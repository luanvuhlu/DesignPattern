package com.luanvv.design.pattern.builder;

public class Director {

	private MazeBuilder builder;

	public Director(MazeBuilder builder) {
		super();
		this.builder = builder;
	}

	public Maze getMaze() {
		builder.buildMaze();
		builder.buildRoom();
		builder.buildDoor();
		return builder.getMaze();
	}
}
