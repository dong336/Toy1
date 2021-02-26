package com.practice01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("panelController")
public class PanelController {
	// Home
	@RequestMapping(value="/mainHome")
	public String getMainHome(Model model) throws Exception {
		System.out.println("Hello, MainHome!");
		
		return "panel/mainHome";
	}
	
	// 로그인
	@RequestMapping(value="/loginForm")
	public String getLogin(Model model) throws Exception {
		System.out.println("Hello, Form!");
		
		return "panel/loginForm";
	}
	
	// 데이터 조회
	@RequestMapping(value="/grid")
	public String getGrid(Model model) throws Exception {
		System.out.println("Hello, Grid!");
		
		return "panel/grid";
	}
	
	// 회원가입
	@RequestMapping(value="/signUp")
	public String getSignUp(Model model) throws Exception {
		System.out.println("Hello, SignUp!");
		
		return "panel/signUp";
	}
}
