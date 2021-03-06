package com.zhongzhou.service.canteen;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhongzhou.dto.MenuDto;
import com.zhongzhou.dto.MenuFeedbackDto;
import com.zhongzhou.dto.MenuSelectDto;
import com.zhongzhou.dto.WeeklyMenuDto;
import com.zhongzhou.entity.canteen.Menu;
import com.zhongzhou.entity.canteen.MenuFeedback;
import com.zhongzhou.entity.canteen.TimeSlot;
import com.zhongzhou.entity.canteen.WeeklyMenuList;

import net.sf.jsqlparser.util.AddAliasesVisitor;

/**
 *	菜单 service
 */
public interface MenuService {
	
	
	/**
	 * 	查询 哪个时间段
	 * @param time
	 * @return
	 */
	TimeSlot queryTimeSlot( String time);
	

	/**
	 *	查询修改菜单 列表 
	 *	参数 : timeSlotId 
	 *	返回 : List<MenuSelectDto>
	 */
	List<MenuSelectDto> querySelectMenuList(Integer timeSlotId , Integer weeklyId);
	
	/**
	 *	查询菜单Dto 
	 *	参数 :  menuTypeId
	 *	返回 : List<MenuDto>
	 */
	List<MenuDto> queryMenuTypeIsMenu(Integer menuTypeId);
	
	
	/**
	 *	查询菜单Dto Page 
	 *	参数 : timeSlotId 和 menuTypeId
	 *	返回 : List<MenuDto>
	 */
	List<MenuDto> queryMenuTypeIsMenuPage(Integer timeSlotId, Integer menuTypeId ,Integer pageStart ,Integer pageSize ,String menuName);
	
	
	/**
	 *	查询菜单Dto count
	 *	参数 : timeSlotId 和 menuTypeId
	 *	返回 : List<MenuDto>
	 */
	Integer queryMenuTypeIsMenuCount(Integer timeSlotId, Integer menuTypeId ,String menuName);
	
	
	/**
	 * 	查询指定星期 时间段  菜单类型
	 * 	参数 : timeSlotId 和 menuTypeId 和 weeklyId
	 *	返回 : List<MenuDto>
	 */
	List<MenuDto> queryWeeklyMenuList(Integer timeSlotId, Integer menuTypeId , Integer weeklyId);
	
	/**
	 * 	查询指定星期 时间段 
	 * 	参数 : timeSlotId  和 weeklyId
	 *	返回 : List<MenuDto>
	 */
	List<MenuDto> queryWeeklySlotMenuList( Integer timeSlotId, Integer weeklyId);
	
	/**
	 *	添加周几菜单列表数据
	 */
	Long addWeeklyMenuListObj(WeeklyMenuList weeklyMenuList);
	
	/**
	 *	删除周几菜单列表 id
	 */
	Long deleteWeeklyMenuListId(Integer id);
	
	/**
	 *	删除周几菜单列表 Obj
	 */
	Long deleteWeeklyMenuListObj(WeeklyMenuList weeklyMenuList);
	
	
	/**
	 * 	查询指定星期 时间段  菜单名称
	 * 	参数 : timeSlotId 和  weeklyId 和 menuName
	 *	返回 : List<MenuDto>
	 */
	List<MenuDto> queryWeeklyMenuName(Integer timeSlotId, Integer weeklyId , String menuName);
	
	
	
	/**
	 *	每周菜谱页面 数据
	 * @param timeSlotId
	 * @return
	 */
	List<WeeklyMenuDto> weeklyMenuPageList(Integer timeSlotId);
	
	
	
	/**
	 *	添加菜单
	 */
	MenuDto addMenu(String menuName, String menuPicUrl, BigDecimal menuPrice, Integer menuTypeId);
	
	
	/**
	 * 	删除 菜单 
	 *	并且删除 :  menu_list , weekly_menu_list , menu_feedback
	 */
	String deleteMenuId(Integer id);
	
	
	/**
	 *	根据id查询对象 修改
	 */
	Long updateMenu(Menu record);
	
	
	
	
	/**
	 *	根据weeklyId timeSlotId menuId 进行修改
	 */
	Long updateWeeklyMenuList(Integer weeklyId, Integer timeSlotId , String menuIdArr[]);
	

	/**
	 * 	app 菜单页面分页
	 */
	List<MenuFeedbackDto> appMenuListPage(Integer timeSlotId, Integer menuTypeId , Integer weeklyId , String wxid , String goodTime, Integer startPage , Integer endPage);

	/**
	 * 	app 菜单页面
	 */
	List<MenuFeedbackDto> appMenuList(Integer timeSlotId, Integer menuTypeId , Integer weeklyId , String wxid , String goodTime);
	
	/**
	 * 	app 菜单页面 点赞
	 */
	MenuFeedback appMenuClickGood(Integer menuId , String wxid , String goodTime ,Integer goodState);
}
