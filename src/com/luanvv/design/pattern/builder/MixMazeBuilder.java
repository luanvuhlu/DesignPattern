package com.luanvv.design.pattern.builder;

public class MixMazeBuilder implements MazeBuilder {

	private Maze maze;

	public MixMazeBuilder() {
	}

	@Override
	public void buildRoom() {
		maze.setRoom(new NormalRoom());
	}

	@Override
	public void buildDoor() {
		maze.setDoor(new TrapDoor());
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
