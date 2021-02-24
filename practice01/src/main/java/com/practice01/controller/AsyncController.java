package com.practice01.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice01.service.TestService;

@RestController
@RequestMapping("/async")
public class AsyncController {
	@Autowired
	TestService testService;
	
	@RequestMapping(value="/data")
	public Map<String, Object> getData(Model model) throws Exception{
		Map<String, Object> map = testService.testVOMap(); 
		
		return map;
	}
	
	
}
