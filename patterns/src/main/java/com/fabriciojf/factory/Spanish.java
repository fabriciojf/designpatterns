package com.fabriciojf.factory;

/**
 * Spanish greetings message  
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class Spanish 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class Spanish implements ILanguage {

	@Override
	public String greetings() {
		return "buen día!";
	}
}
