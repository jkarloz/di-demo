package com.jcczdev.web.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jcczdev.web.services.GreetingServiceImpl;

/**
 * @author Juan Carlos - 2017/10/17
 *
 */
public class PropertyInjectedControllerTest {
	
	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
	}

}
