package com.sinianbla.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sinianbla.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/user/login")
	public ModelAndView login(HttpServletRequest req, HttpServletResponse res){
		
		ModelAndView mv = new ModelAndView("view/login");
		userService.add();
//		mv.addObject("name", req.getCookies()[0].getValue());
		return mv;
	}
	@RequestMapping("/user/list")
	public ModelAndView userList(HttpServletRequest req, HttpServletResponse res){
		
		ModelAndView mv = new ModelAndView("view/userList");
//		mv.addObject("name", req.getCookies()[0].getValue());
		return mv;
	}

}
