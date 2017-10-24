package com.jcczdev.web.services;

/**
 * @author Juan Carlos - 2017/10/19
 *
 */

public class PrimarySpanishGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;
	
	public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	/* (non-Javadoc)
	 * @see com.jcczdev.web.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Servicio de Saludo Primario";
	}

}
