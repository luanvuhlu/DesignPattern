package com.luanvv.design.pattern.factory.method;

public interface Application {
	Document createDocument();

	Document newDocument();

	Document openDocument();
}
