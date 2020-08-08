package com.luanvv.design.pattern.abs.factory.singleton;

import java.io.Serializable;

import com.luanvv.design.pattern.abs.factory.AbstractFactory;
import com.luanvv.design.pattern.abs.factory.AbstractProductA;
import com.luanvv.design.pattern.abs.factory.AbstractProductB;
import com.luanvv.design.pattern.abs.factory.ProductA1;
import com.luanvv.design.pattern.abs.factory.ProductB1;

public class ConcreteFactory1 implements AbstractFactory, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile AbstractFactory INSTANCE;

	private ConcreteFactory1() {
		// Prevent form the reflection api.
		if (INSTANCE != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
		}
	}

	public static AbstractFactory getInstance() {
		if (INSTANCE == null) {
			synchronized (ConcreteFactory1.class) {
				if (INSTANCE == null) {
					INSTANCE = new ConcreteFactory1();
				}
			}
		}
		return INSTANCE;
	}

	// Make singleton from serialize and deserialize operation.
	protected AbstractFactory readResolve() {
		return getInstance();
	}

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
