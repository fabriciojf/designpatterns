package com.fabriciojf.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Collector Observer
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class Collector 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class Collector implements Observer {
	
	private int qtdeEggs = 0;
	
	public void collect() {
		qtdeEggs++;
		System.out.println("Collecting egg : " + qtdeEggs);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
		String action = String.valueOf(arg);
		
		if (action.equals("Laid egg")) {			
			collect();
		}
		else {
			System.out.println("Method not implemented yet");			
		}
		
	}

}
