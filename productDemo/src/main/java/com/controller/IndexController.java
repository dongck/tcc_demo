package com.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;

@RestController
public class IndexController {
	
	private final Logger logger = Logger.getLogger(getClass());
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
