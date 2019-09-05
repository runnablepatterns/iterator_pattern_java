package com.runnablepatterns.javaiteratorpattern;

import java.util.Iterator;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class used to perform MyDocument save operations
 * 
 */
public class SaveMyDocument {
	
	/**
	 * Handle the items to be saved regardless of their container implementation
	 * @param documents The iterable entity that contains all the items
	 */
	public void saveDocuments(Iterator<MyDocument> documents) {
		// if there are more items
		while(documents.hasNext()) {
			// save the document
			save((MyDocument)documents.next());
		}
		System.out.println();
	}

	/**
	 * Handle the save operation
	 * @param document The document to save
	 */
	private void save(MyDocument document) {
		System.out.println(String.format("Saving the document: %s - type: %s", document.getName(), document.getType()));
	}
}
