package com.fabriciojf.singleton;

import java.util.Random;

/**
 * Class Singleton Example
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class SingletonPattern 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class SingletonPattern {
	
	/**
	 * Create a instance variable setting to null
	 */
	private static SingletonPattern instance = null;	
	private int id;
	
	/**
	 * Always return the same instance of the class SingletonPattern
	 * @return
	 */
	public static SingletonPattern getInstance() {
		if (instance == null) {
			instance = new SingletonPattern();			
		}
		return instance;
	}
	
	/**
	 * Constructor set a new id (int) 
	 */
	public SingletonPattern() {
		id = new Random().nextInt();
	}
	
	/**
	 * Return the class Id
	 * @return
	 */
	public int getClassId() {
		return id;
	}

}
