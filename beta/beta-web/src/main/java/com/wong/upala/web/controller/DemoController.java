package com.wong.upala.web.controller;

import com.wong.upala.biz.service.DemoService;
import lombok.extern.log4j.Log4j2;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;

/*****************************.
 *  @author 王鹏
 *  @since 2019/5/30 17:46
 *  @version 0.0.1
 *****************************/

@RestController
@RequestMapping("/demo")
@Log4j2
@Validated
public class DemoController {

	@Autowired
	private DemoService demoService;

	/**
	 * @return 返回值
	 */
	@GetMapping("/test")
	public String test() {
		return demoService.test();
	}

	/**
	 * 查询用户
	 * @param id 入参
	 * @return 返回值
	 */
	@RequestMapping(value="findUserById", method = RequestMethod.POST)
	public String findUserById (@NotBlank(message = "id 不能为空") @Length(min = 2, max = 10, message = "id 长度必须在 {min} - {max} 之间") @RequestBody String id) {
		log.info("id = "+id);
		return id;
	}

}
