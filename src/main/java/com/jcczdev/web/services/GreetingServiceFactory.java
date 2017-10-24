package com.jcczdev.web.services;

/**
 * @author Juan Carlos - 2017/10/24
 *
 */
public class GreetingServiceFactory {
	
	private GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	public GreetingService createGreetingService(String lang) {
		switch (lang) {
		case "en":
			return new PrimaryGreetingService(greetingRepository);
		case "de":
			return new PrimaryGermanGreetingService(greetingRepository);
		case "es":
			return new PrimarySpanishGreetingService(greetingRepository);
			default:
				return new PrimaryGreetingService(greetingRepository);
		}
	}

}
