package com.jcczdev.web.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jcczdev.web.services.GreetingServiceImpl;

/**
 * @author Juan Carlos - 2017/10/17
 *
 */
public class ConstructorInjectedControllerTest {
	private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.constructorInjectedController =  new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
	}

}
