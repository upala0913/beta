package com.wong.upala.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*****************************
 *  @author 王鹏
 *  @since 2019/6/17 20:56
 *  @version 0.0.1
 *****************************/

@Configuration
public class WebConfig implements WebMvcConfigurer {

	/**
	 *  视图解析器
	 * @param registry 参数
	 */
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index").setViewName("index");
	}

	/**
	 *  加载静态资源
	 * @param registry 参数
	 */
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	}

}
