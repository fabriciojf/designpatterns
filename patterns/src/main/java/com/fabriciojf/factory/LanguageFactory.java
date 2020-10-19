package com.fabriciojf.factory;

/**
 * Greetings message factory
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class LanguageFactory 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class LanguageFactory {
	
	/**
	 * Return a greeting message by language
	 * @param language
	 * @return
	 */
	public static String greetings(LanguageEnum language) {
		
		switch (language) {
		case ENGLISH:
			return new English().greetings();
			
		case PORTUGUESE:
			return new Portuguese().greetings();
			
		case SPANISH:
			return new Spanish().greetings();	

		default:
			return "Language not implemented yet";
		}
		
	}

}
