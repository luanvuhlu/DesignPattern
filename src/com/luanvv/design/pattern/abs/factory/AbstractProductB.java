package com.luanvv.design.pattern.abs.factory;

public interface AbstractProductB {

	String getName();

	default void sayYourName() {
		System.out.println("My name is " + getName());
	}
}
