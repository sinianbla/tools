package com.sinianbla.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.sinianbla.dto.JsonResult;
import com.sinianbla.entity.UserEntity;
import com.sinianbla.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/user/loginPage")
	public ModelAndView loginPage(HttpServletRequest req, HttpServletResponse res){
		
		ModelAndView mv = new ModelAndView("view/login");
		return mv;
	}
	@RequestMapping("/user/list")
	public ModelAndView userList(HttpServletRequest req, HttpServletResponse res){
		
		ModelAndView mv = new ModelAndView("view/userList");
		return mv;
	}
	
	@RequestMapping("/user/login")
	@ResponseBody
	public JSONObject login(HttpServletRequest req, HttpServletResponse res){
		
		UserEntity user = new UserEntity();
		user.setLoginName("admin");
		user.setPassword("123456");
		req.getSession().setAttribute("userInfo", user);
		return JsonResult.buildResult("200", "登录成功",user);
	}
	
	@RequestMapping("/user/count")
	@ResponseBody
	public JSONObject count(Long id) {

		UserEntity user = userService.getUserInfo(id);
//		user.setLoginName("admin");
//		user.setPassword("123456");
		JSONObject ret = new JSONObject();
		ret.put("user", user);
//		ret.put("count", );

		return JsonResult.buildResult("200", "登录成功", ret);
	}
}
