package com.zhongzhou.service.canteen;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhongzhou.dto.MenuMessageDto;
import com.zhongzhou.entity.canteen.MenuMessage;

/**
 *	菜单消息
 */
public interface MenuMessageService {

	/**
	 *	菜单消息分页查询
	 */
	List<MenuMessageDto> queryMenuMessagePage(Integer lr, Integer startPage, Integer endPage);
	
	/**
	 *	菜单消息分页 总数
	 */
	Long queryMenuMessagePageCount(Integer lr);

	/**
	 * 	删除指定id
	 */
	Long deleteId(Integer id);
	
	
	Long insert(MenuMessage record);
	
	
	/**
	 *	菜单消息 id
	 */
	MenuMessageDto queryMenuMessageId(Integer id);
	
}
