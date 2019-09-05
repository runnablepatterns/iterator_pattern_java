package com.runnablepatterns.javaiteratorpatterndemo;

import com.runnablepatterns.javaiteratorpattern.ClientA;
import com.runnablepatterns.javaiteratorpattern.ClientB;
import com.runnablepatterns.javaiteratorpattern.ClientC;
import com.runnablepatterns.javaiteratorpattern.MyDocumentAggregate;
import com.runnablepatterns.javaiteratorpattern.SaveMyDocument;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class used to demonstrates Iterator pattern
 * 
 */
public class JavaIteratorPatternDemo {

	public static void main(String[] args) {
		// create client that uses ArrayList
		MyDocumentAggregate clientA = new ClientA();
		
		// create client that uses Array
		MyDocumentAggregate clientB = new ClientB();
		
		// create client that uses HashMap
		MyDocumentAggregate clientC = new ClientC();
		
		// create save service
		SaveMyDocument saveDocument = new SaveMyDocument();
		
		// save photos
		saveDocument.saveDocuments(clientA.createIterator());
		
		// save pdfs
		saveDocument.saveDocuments(clientB.createIterator());
		
		// save xmls
		saveDocument.saveDocuments(clientC.createIterator());
	}

}
