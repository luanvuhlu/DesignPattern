package com.luanvv.design.pattern.builder;

public class NormalMazeBuilder implements MazeBuilder {

	private Maze maze;

	public NormalMazeBuilder() {

	}

	@Override
	public void buildRoom() {
		maze.setRoom(new NormalRoom());
	}

	@Override
	public void buildDoor() {
		maze.setDoor(new NormalDoor());
	}

	@Override
	public Maze getMaze() {
		return maze;
	}

	@Override
	public void buildMaze() {
		maze = new Maze();
	}
}
