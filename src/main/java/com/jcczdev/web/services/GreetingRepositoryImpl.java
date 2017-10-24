package com.jcczdev.web.services;

import org.springframework.stereotype.Component;

/**
 * @author Juan Carlos - 2017/10/24
 *
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	/* (non-Javadoc)
	 * @see com.jcczdev.web.services.GreetingRepository#getEnglishGreeting()
	 */
	@Override
	public String getEnglishGreeting() {
		return "Hello - Primary Greeting service";
	}

	/* (non-Javadoc)
	 * @see com.jcczdev.web.services.GreetingRepository#getSpanishGreeting()
	 */
	@Override
	public String getSpanishGreeting() {
		return "Servicio de Saludo Primario";
	}

	/* (non-Javadoc)
	 * @see com.jcczdev.web.services.GreetingRepository#getGermanGreeting()
	 */
	@Override
	public String getGermanGreeting() {
		return "Primärer Grubdienst";
	}

}
