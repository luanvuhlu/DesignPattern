package com.luanvv.design.pattern.abs.factory;

public interface AbstractProductA {
	String getMessage();

	default void sayHello() {
		System.out.println(getMessage());
	}
}
