package com.wong.upala.biz.utils;

import java.util.HashMap;
import java.util.Map;

/*****************************
 *  @author 王鹏
 *  @since 2019/6/29 16:47
 *  @version 0.0.1
 *****************************/
public class TransApi {

	private static final String TRANS_API_HOST = "http://api.fanyi.baidu.com/api/trans/vip/translate";

	private String appid;
	private String securityKey;

	public TransApi(String appid, String securityKey) {
		this.appid = appid;
		this.securityKey = securityKey;
	}

	/**
	 * getTransResult
	 * @param query 参数
	 * @param from 参数
	 * @param to 参数
	 * @return 返回值
	 */
	public String getTransResult(String query, String from, String to) {
		Map<String, String> params = buildParams(query, from, to);
		return HttpGet.get(TRANS_API_HOST, params);
	}

	/**
	 * buildParams
	 * @param query 参数
	 * @param from 参数
	 * @param to 参数
	 * @return 返回值
	 */
	private Map<String, String> buildParams(String query, String from, String to) {
		Map<String, String> params = new HashMap<>();
		params.put("q", query);
		params.put("from", from);
		params.put("to", to);
		params.put("appid", appid);
		// 随机数
		String salt = String.valueOf(System.currentTimeMillis());
		params.put("salt", salt);
		// 签名
		String src = appid + query + salt + securityKey; // 加密前的原文
		params.put("sign", Md5.md5(src));
		return params;
	}

}
