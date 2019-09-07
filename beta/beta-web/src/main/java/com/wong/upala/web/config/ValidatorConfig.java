package com.wong.upala.web.config;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/*****************************
 *  @author 王鹏
 *  @since 2019/6/17 22:11
 *  @version 0.0.1
 *****************************/

@Configuration
public class ValidatorConfig {

	/**
	 * 参数校验配置文件
	 * @return 返回值
	 */
	@Bean
	public Validator validator () {

		ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class)
				.configure()
				.addProperty("hibernate.validator.fail_fast", "true")
				.buildValidatorFactory();

		return validatorFactory.getValidator();
	}

}
