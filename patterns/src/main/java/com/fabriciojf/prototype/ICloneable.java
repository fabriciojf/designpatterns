package com.fabriciojf.prototype;

/**
 * Interface Cloneable
 *  
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class ICloneable 
 * @version 1.0
 * @since 19 de out de 2020
 */
public interface ICloneable extends Cloneable {
	
	/**
	 * Allow Cloneable method
	 * @return
	 */
	public ICloneable clone();
	
}
