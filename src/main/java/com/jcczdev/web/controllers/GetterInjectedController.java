package com.jcczdev.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.jcczdev.web.services.GreetingService;

/**
 * @author Juan Carlos - 2017/10/17
 *
 */
@Controller
public class GetterInjectedController {
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	@Autowired
	//@Qualifier("getterGreetingService") can be declared here
	public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
