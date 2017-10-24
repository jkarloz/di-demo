package com.jcczdev.web.services;

/**
 * @author Juan Carlos - 2017/10/19
 *
 */

public class PrimaryGermanGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;
	
	public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	/* (non-Javadoc)
	 * @see com.jcczdev.web.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Hallo - Primäre Begrüßung Service";
	}

}
