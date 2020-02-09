package com.whisard.controller;

import org.springframework.web.bind.annotation.RequestMapping;


public class RootController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	

}
