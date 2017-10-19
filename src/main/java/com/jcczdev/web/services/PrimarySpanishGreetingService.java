package com.jcczdev.web.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Juan Carlos - 2017/10/19
 *
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

	/* (non-Javadoc)
	 * @see com.jcczdev.web.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Servicio de Saludo Primario";
	}

}
