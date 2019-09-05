package com.runnablepatterns.javaiteratorpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to store document details.
 */
public class MyDocument {
	
	private String name;
	private String type;
	private byte[] data;
	
	/**
	 * Overloaded constructor used to initialize attributes
	 * @param _name Document name
	 * @param _type Document type
	 */
	public MyDocument(String _name, String _type) {
		this.name = _name;
		this.type = _type;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the data
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(byte[] data) {
		this.data = data;
	}
}
