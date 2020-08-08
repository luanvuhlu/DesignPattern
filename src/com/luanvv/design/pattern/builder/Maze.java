package com.luanvv.design.pattern.builder;

import java.text.MessageFormat;

public class Maze {
	private Door door;
	private Room room;

	public void setDoor(Door door) {
		this.door = door;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Door getDoor() {
		return door;
	}

	public Room getRoom() {
		return room;
	}

	@Override
	public String toString() {
		return MessageFormat.format("I have a {0} and a {1}", getDoor().getClass().getSimpleName(), getRoom().getClass().getSimpleName());
	}
}
