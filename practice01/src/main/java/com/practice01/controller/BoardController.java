package com.practice01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("boardController")
public class BoardController {
	@RequestMapping(value="/mainBoard")
	public String getMainBoard(Model model) throws Exception {
		System.out.println("Hello, MainBoard!");
		
		return "board/mainBoard";
	}
}
