package com.jcczdev.web.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Juan Carlos - 2017/10/17
 *
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

	/* (non-Javadoc)
	 * @see com.jcczdev.web.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Hello- Primary Greetint Service";
	}

}
