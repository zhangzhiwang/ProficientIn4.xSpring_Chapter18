package com.asiainfo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asiainfo.entity.User;

/**
 * 用户Controller
 *
 * @author zhangzhiwang
 * @date Aug 20, 2019 7:38:44 PM
 */
@Controller
@RequestMapping("/userController")
public class UserController {
	@RequestMapping("/met1")
	public void met1(HttpServletRequest request) {
		System.out.println("RequestURI=" + request.getRequestURI());
		System.out.println("RequestURL=" + request.getRequestURL());
		System.out.println("ContextPath=" + request.getContextPath());
		System.out.println("QueryString=" + request.getQueryString());
//		System.out.println("met1");
	}
	
	@RequestMapping("/met2")
	public void met2() {
		System.out.println("met2");
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = new ModelAndView();
		andView.setViewName("/login");
		
		return andView;
	}
	
	@RequestMapping("/doLogin")
	public ModelAndView doLogin(HttpServletRequest request, HttpServletResponse response) {
		// 模拟登陆成功
		User user  = new User();// 模拟从数据库查出来的用户
		user.setUserId(1);
		user.setUserName("aaa");
		user.setPassword("1234");
		
		String loginToUrl = (String) request.getSession().getAttribute("loginToUrl");
		request.getSession().removeAttribute("loginToUrl");
		if(StringUtils.isBlank(loginToUrl)) {
			loginToUrl = "/index";
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:" + loginToUrl);
		
		return modelAndView;
	}
}
