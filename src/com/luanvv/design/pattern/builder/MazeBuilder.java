package com.luanvv.design.pattern.builder;

public interface MazeBuilder {

	void buildMaze();
	
	void buildRoom();

	void buildDoor();
	
	Maze getMaze();
}
