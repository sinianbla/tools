package com.sinianbla.dto;

import com.alibaba.fastjson.JSONObject;

public class JsonResult {
	
	public static JSONObject buildResult(String code, String msg) {
		return buildResult(code, msg, new JSONObject());
	}

	public static JSONObject buildResult(String code, String msg, Object data) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", code);
		jsonObject.put("msg", msg);
		jsonObject.put("data", data);
		return jsonObject;
	}
}
