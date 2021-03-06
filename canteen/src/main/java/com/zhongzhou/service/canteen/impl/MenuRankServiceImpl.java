package com.zhongzhou.service.canteen.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhongzhou.dao.canteen.MenuFeedbackDao;
import com.zhongzhou.dto.MenuRankDto;
import com.zhongzhou.service.canteen.MenuRankService;

/**
 *	菜单排名
 */
@Service
public class MenuRankServiceImpl implements MenuRankService{

	/**
	 *  注入 dao对象
	 */
	@Autowired
	MenuFeedbackDao menuFeedbackDao;
	
	
	
	/**
	 *	查询菜单排名 分页 (好评 差评 ) 
	 * 
	 * @param goodState
	 * @param startTime
	 * @param endTime
	 * @param startPage
	 * @param endPage
	 * @return
	 */
	@Override
	public List<MenuRankDto> queryMenuRank(Integer goodState, String startTime, String endTime, Integer startPage,
			Integer endPage) {
		return menuFeedbackDao.queryMenuRank(goodState, startTime, endTime, startPage, endPage);
	}


	/**
	 *	查询菜单排名 分页 (好评 差评 )  总数
	 * 
	 * @param goodState
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	@Override
	public Long queryMenuRankCount(Integer goodState, String startTime, String endTime) {
		return menuFeedbackDao.queryMenuRankCount(goodState, startTime, endTime);
	}

}
