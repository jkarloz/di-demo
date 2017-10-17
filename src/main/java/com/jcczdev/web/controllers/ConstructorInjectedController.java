package com.jcczdev.web.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.jcczdev.web.services.GreetingService;

/**
 * @author Juan Carlos - 2017/10/17
 *
 */
@Controller
public class ConstructorInjectedController {
	
	private GreetingService greetingService;
	
	
	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
