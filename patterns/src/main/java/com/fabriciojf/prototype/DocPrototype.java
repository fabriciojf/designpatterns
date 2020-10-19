package com.fabriciojf.prototype;

/**
 * DocPrototype allows the creation of clones
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class DocPrototype 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class DocPrototype implements ICloneable {

	/**
	 * Simple Attribute
	 */
	private String name;

	/**
	 * Delivery a clone of DocPrototype
	 */
	@Override
	public DocPrototype clone() {

		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}

		return (DocPrototype) clone;
	}

	/**
	 * Getters and Setters
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
