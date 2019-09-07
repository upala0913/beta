package com.wong.upala.dao.mapper;

import com.wong.upala.dao.entity.AdminDO;
import org.apache.ibatis.annotations.Param;

/*****************************.
 *  @author 王鹏
 *  @since 2019/5/30 17:46
 *  @version 0.0.1
 *****************************/

public interface AdminMapper {

	/**
	 * 获取数据
	 * @param id 参数id
	 * @return 返回值
	 */
	AdminDO selectById(@Param("id") int id);

}
