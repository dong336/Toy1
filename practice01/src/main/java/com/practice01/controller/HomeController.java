package com.practice01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("homeController")
public class HomeController {
	
	@RequestMapping(value="/favicon.ico")
	public String getFavicon(Model model) throws Exception {
		System.out.println("Hello, Favicon!");
		return "home";
	}
	
	@RequestMapping(value="/")
	public String getHome(Model model) throws Exception {
		System.out.println("Hello, World!");
		
		model.addAttribute("data", "data 전송 테스트");
		
		return "home";
	}
	
	
}
