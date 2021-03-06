package com.fabriciojf.observer;

/**
 * Observer Sample Code Usage
 * 
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class ObserverUsage
 * @version 1.0
 * @since 19 de out de 2020
 */
public class ObserverUsage {

	public static void main(String[] args) {

		/**
		 * When chicken put eggs, the collector work
		 */
		Chicken chicken = new Chicken();
		Collector collector = new Collector();

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				chicken.addObserver(collector);
				chicken.putEgg();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(new ObserverUsage().toString());
	}

}
