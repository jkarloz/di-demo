package com.jcczdev.web.controllers;

import org.springframework.stereotype.Controller;

import com.jcczdev.web.services.GreetingService;

/**
 * @author Juan Carlos - 2017/10/14
 *
 */
@Controller
public class MyController {
	
	private GreetingService greetingService;	
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Hello!!!");
		return greetingService.sayGreeting();
	}
	
}
