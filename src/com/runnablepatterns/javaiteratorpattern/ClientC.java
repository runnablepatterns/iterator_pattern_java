package com.runnablepatterns.javaiteratorpattern;

import java.util.HashMap;
import java.util.Iterator;

public class ClientC implements MyDocumentAggregate {

	/**
	 * Variable to store XML files
	 */
	private HashMap<String, MyDocument> documents;
	
	/**
	 * Default constructor used to fill the hash map
	 */
	public ClientC() {
		this.documents = new HashMap<>();
		this.documents.put("XMLA.xml", new MyDocument("XMLA.xml", "XML"));
		this.documents.put("XMLB.xml", new MyDocument("XMLB.xml", "XML"));
		this.documents.put("XMLC.xml", new MyDocument("XMLC.xml", "XML"));
	}
	
	@Override
	public Iterator<MyDocument> createIterator() {
		// get the specific iterator for array
		return this.documents.values().iterator();
	}

}
