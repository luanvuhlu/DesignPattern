package com.luanvv.design.pattern.builder;

public class DangerousMazeBuilder implements MazeBuilder {

	private Maze maze;

	public DangerousMazeBuilder() {
	}

	@Override
	public void buildRoom() {
		maze.setRoom(new TrapRoom());
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
