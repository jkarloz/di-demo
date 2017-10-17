package com.jcczdev.web.controllers;

import com.jcczdev.web.services.GreetingServiceImpl;

/**
 * @author Juan Carlos - 2017/10/17
 *
 */
public class PropertyInjectedController {
	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
