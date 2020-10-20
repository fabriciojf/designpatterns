package com.fabriciojf.depinjection;

/**
 * Dependency Injection Sample Code Usage
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class DependencyInjectionUsage 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class DependencyInjectionUsage {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Dependency Injection Messages")
			.append(System.lineSeparator())
			
			.append("Users Notification Implementation")			
			.append(System.lineSeparator())
			
			.append(new DependencyInjectionPattern(new UserNotificationImpl()).getNotify())
			.append(System.lineSeparator())
			
			.append("Admind Notification Implementation")
			.append(System.lineSeparator())
			
			.append(new DependencyInjectionPattern(new AdminNotificationImpl()).getNotify());
			
		System.out.println(builder.toString());
	}
}
