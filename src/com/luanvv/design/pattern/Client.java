package com.luanvv.design.pattern;

import com.luanvv.design.pattern.abs.factory.AbstractProductA;
import com.luanvv.design.pattern.abs.factory.AbstractProductB;
import com.luanvv.design.pattern.abs.factory.singleton.ConcreteFactory1;
import com.luanvv.design.pattern.abs.factory.singleton.ConcreteFactory2;
import com.luanvv.design.pattern.builder.DangerousMazeBuilder;
import com.luanvv.design.pattern.builder.Director;
import com.luanvv.design.pattern.builder.Maze;
import com.luanvv.design.pattern.builder.MixMazeBuilder;
import com.luanvv.design.pattern.builder.NormalMazeBuilder;

public class Client {

	public static void main(String[] args) {
		// Factory Method, Singleton and Abstract Factory
		AbstractProductA productA1 = ConcreteFactory1.getInstance().createProductA();
		productA1.sayHello();
		AbstractProductB productB1 = ConcreteFactory1.getInstance().createProductB();
		productB1.sayYourName();
		AbstractProductA productA2 = ConcreteFactory2.getInstance().createProductA();
		productA2.sayHello();
		AbstractProductB productB2 = ConcreteFactory2.getInstance().createProductB();
		productB2.sayYourName();
		
		// Builder
		Maze scaredMaze = new Director(new DangerousMazeBuilder()).getMaze();
		System.out.println(scaredMaze);
		
		Maze childrenMaze = new Director(new NormalMazeBuilder()).getMaze();
		System.out.println(childrenMaze);
		
		Maze unpredictableMaze = new Director(new MixMazeBuilder()).getMaze();
		System.out.println(unpredictableMaze);
		
		
	}
}
