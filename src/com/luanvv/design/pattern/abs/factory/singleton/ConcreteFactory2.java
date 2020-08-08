package com.luanvv.design.pattern.abs.factory.singleton;

import java.io.Serializable;

import com.luanvv.design.pattern.abs.factory.AbstractFactory;
import com.luanvv.design.pattern.abs.factory.AbstractProductA;
import com.luanvv.design.pattern.abs.factory.AbstractProductB;
import com.luanvv.design.pattern.abs.factory.ProductA2;
import com.luanvv.design.pattern.abs.factory.ProductB2;

public class ConcreteFactory2 implements AbstractFactory, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile AbstractFactory INSTANCE;

	private ConcreteFactory2() {
		// Prevent form the reflection api.
		if (INSTANCE != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
		}
	}

	public static AbstractFactory getInstance() {
		if (INSTANCE == null) {
			synchronized (ConcreteFactory2.class) {
				if (INSTANCE == null) {
					INSTANCE = new ConcreteFactory2();
				}
			}
		}
		return INSTANCE;
	}

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
