package com.fabriciojf.singleton;

/**
 * Singleton Pattern Example Usage
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class SingletonUsage 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class SingletonUsage {
	
	public static void main(String[] args) {
		
		StringBuilder usage = new StringBuilder();
		
		usage.append("Singleton Example")
			.append(System.lineSeparator())
			
			.append("Unique Id Singleton: ")
			.append(SingletonPattern.getInstance().getClassId())
			.append(System.lineSeparator())
			
			.append("New Instance = new Id: ")
			.append(new SingletonPattern().getClassId())
			.append(System.lineSeparator())
			
			.append("Unique Id Singleton: ")
			.append(SingletonPattern.getInstance().getClassId())
			.append(System.lineSeparator());
			
		
		System.out.println(usage.toString());
		
	}	

}
