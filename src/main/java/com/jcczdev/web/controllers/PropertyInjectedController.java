package com.jcczdev.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jcczdev.web.services.GreetingServiceImpl;

/**
 * @author Juan Carlos - 2017/10/17
 *
 */
@Controller
public class PropertyInjectedController {
	
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
