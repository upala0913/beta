package com.wong.upala.web.controller;

import com.wong.upala.biz.utils.FinalVariable;
import com.wong.upala.biz.utils.TransApi;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*****************************
 *  @author 王鹏
 *  @since 2019/6/30 1:02
 *  @version 0.0.1
 *****************************/

@RestController
@RequestMapping("/trans/ai")
@Log4j2
public class TransController {

	@RequestMapping("/trans")
	public String httpTrans (@RequestBody Map<String, String> params) {
		log.info("process params is: {}", params.get("params"));
		TransApi transApi = new TransApi(FinalVariable.APP_ID, FinalVariable.SECURITY_KEY);
		String result = transApi.getTransResult(params.get("params"), FinalVariable.FRAM, FinalVariable.TO);
		return result != null?result:"翻译出错！";
	}

}
