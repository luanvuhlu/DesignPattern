package com.luanvv.design.pattern.factory.method;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractApplication implements Application{
	
	private List<Document> docs;
	
	public AbstractApplication() {
		docs = new ArrayList<>();
	}
	@Override
	public Document newDocument() {
		Document doc = createDocument();
		docs.add(doc);
		doc.open();
		return doc;
	}
	
	@Override
	public Document openDocument() {
		// TODO Auto-generated method stub
		return null;
	}
}
