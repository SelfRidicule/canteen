package com.zhongzhou.service.canteen.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhongzhou.dao.canteen.MenuTypeDao;
import com.zhongzhou.dto.MenuTypeDto;
import com.zhongzhou.entity.canteen.MenuList;
import com.zhongzhou.entity.canteen.MenuType;
import com.zhongzhou.service.canteen.MenuTypeService;

/**
 * 	菜单类型 Service impl
 */
@Service
public class MenuTypeServiceImpl implements MenuTypeService{

	/**
	 *  注入 dao对象
	 */
	@Autowired
	MenuTypeDao menuTypeDao;

	/**
	 * 
	 * 查询 时间段id 
	 * @param timeSlotId
	 * @return
	 */
	@Override
	public List<MenuTypeDto> querySlotId(Integer timeSlotId) {
		return menuTypeDao.querySlotId(timeSlotId);
	}

	/**
	 *	查询所有
	 */
	@Override
	public List<MenuType> queryList() {
		return menuTypeDao.queryList();
	}

	
	
}
