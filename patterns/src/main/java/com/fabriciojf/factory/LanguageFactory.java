package com.fabriciojf.factory;

public class LanguageFactory {
	
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
