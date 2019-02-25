package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello111");
		return "hello";
	}
}
