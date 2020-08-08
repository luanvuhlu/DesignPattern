package com.luanvv.design.pattern.factory.method;

public class MyApplication extends AbstractApplication {

	@Override
	public Document createDocument() {
		return new MyDocument();
	}

}
