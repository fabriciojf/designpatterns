package com.fabriciojf.factory;

/**
 * Portuguese greetings message
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class Portuguese 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class Portuguese implements ILanguage {

	@Override
	public String greetings() {
		return "Bom dia!";
	}

}
