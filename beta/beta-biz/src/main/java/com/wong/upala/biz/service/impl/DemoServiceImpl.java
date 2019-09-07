package com.wong.upala.biz.service.impl;

import com.wong.upala.biz.service.DemoService;
import com.wong.upala.dao.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*****************************.
 *  @author 王鹏
 *  @since 2019/5/30 17:46
 *  @version 0.0.1
 *****************************/

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private AdminMapper adminMapper;

	@Override
	public String test() {
		return adminMapper.selectById(2).toString();
	}
}
