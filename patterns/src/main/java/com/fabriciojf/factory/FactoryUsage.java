package com.fabriciojf.factory;

/**
 * Factor Pattern Usage
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class FactoryUsage 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class FactoryUsage {
	
	public static void main(String[] args) {
		StringBuilder output = new StringBuilder();
		
		output.append("-> Design Patterns")
		 	.append(System.lineSeparator())
		 	
			.append("English greetings: ")
			.append(LanguageFactory.greetings(LanguageEnum.ENGLISH))
			.append(System.lineSeparator())

			.append("Portuguese greetings : ")
			.append(LanguageFactory.greetings(LanguageEnum.PORTUGUESE))
			.append(System.lineSeparator())

			.append("Spanish greetings: ")
			.append(LanguageFactory.greetings(LanguageEnum.SPANISH))
			.append(System.lineSeparator());
		
		System.out.println(output.toString());	
	}

}
