package com.jcczdev.web.services;

/**
 * @author Juan Carlos - 2017/10/17
 *
 */

public class PrimaryGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;
	
	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	/* (non-Javadoc)
	 * @see com.jcczdev.web.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Hello - Primary Greeting Service";
	}

}
