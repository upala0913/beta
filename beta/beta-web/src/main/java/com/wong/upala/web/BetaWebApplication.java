package com.wong.upala.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*****************************.
 *  @author 王鹏
 *  @since 2019/5/30 17:46
 *  @version 0.0.1
 *****************************/

@SpringBootApplication(scanBasePackages = "com.wong.upala")
@MapperScan("com.wong.upala.dao.mapper")
public class BetaWebApplication extends SpringBootServletInitializer {

	/**
	 * 主程序入口
	 *
	 * @param args 参数
	 */
	public static void main(String[] args) {
		SpringApplication.run(BetaWebApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources(BetaWebApplication.class);
	}

}
