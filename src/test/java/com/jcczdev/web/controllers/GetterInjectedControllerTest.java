package com.jcczdev.web.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jcczdev.web.services.GreetingServiceImpl;

/**
 * @author Juan Carlos - 2017/10/17
 *
 */
public class GetterInjectedControllerTest {
	
	private GetterInjectedController getterInjectedController;
	
	@Before
	public void setup() throws Exception {
		this.getterInjectedController = new GetterInjectedController();
		this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
	}

}
