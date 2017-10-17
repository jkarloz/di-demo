package com.jcczdev.web.services;

import org.springframework.stereotype.Service;

/**
 * @author Juan Carlos - 2017/10/17
 *
 */
@Service
public class GreetingServiceImpl implements GreetingService{
	public static final String HELLO_GURUS = "Hello Gurus!!!";
	
	@Override
	public String sayGreeting() {
		return HELLO_GURUS;
	}
}
