package com.fabriciojf.factory;

/**
 * English greetings message
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class English 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class English implements ILanguage {

	@Override
	public String greetings() {
		return "Good Morning!";
	}
}
