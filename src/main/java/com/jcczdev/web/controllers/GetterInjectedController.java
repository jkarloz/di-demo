package com.jcczdev.web.controllers;

import com.jcczdev.web.services.GreetingService;

/**
 * @author Juan Carlos - 2017/10/17
 *
 */
public class GetterInjectedController {
	private GreetingService greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
