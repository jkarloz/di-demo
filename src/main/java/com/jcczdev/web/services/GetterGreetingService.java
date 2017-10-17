package com.jcczdev.web.services;

import org.springframework.stereotype.Service;

/**
 * @author Juan Carlos - 2017/10/17
 *
 */
@Service
public class GetterGreetingService implements GreetingService {

	/* (non-Javadoc)
	 * @see com.jcczdev.web.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Hello - I was injected by the getter";
	}

}
