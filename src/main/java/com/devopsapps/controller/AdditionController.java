package com.devopsapps.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	
	@RequestMapping("add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int sum = num1 + num2;
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", sum);
		mv.setViewName("result");
		return mv;
	}
}
