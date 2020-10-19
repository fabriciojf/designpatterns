package com.fabriciojf.observer;

import java.util.Observable;

/**
 * Class chicken observable
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class Chicken 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class Chicken extends Observable {

	public void putEgg() {
		System.out.println("Laid egg");
		
		setChanged();
		notifyObservers("Laid egg");
	}

}
