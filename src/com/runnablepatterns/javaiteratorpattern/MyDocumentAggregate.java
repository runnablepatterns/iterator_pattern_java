package com.runnablepatterns.javaiteratorpattern;

import java.util.Iterator;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Interface used to group different MyDocument objects 
 * 
 */
public interface MyDocumentAggregate {
	
	/**
	 * Method to create an Iterator from the specific aggregate
	 * @return
	 */
	public Iterator<MyDocument> createIterator();

}
