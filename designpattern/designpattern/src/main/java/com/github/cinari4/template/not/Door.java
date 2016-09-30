package com.github.cinari4.template.not;

public class Door {
	private DoorStatus doorStatus;
	
	public Door() {
		doorStatus = DoorStatus.CLOSED;
	}
	
	public DoorStatus getDoorStatus() {
		return doorStatus;
	}
	
	public void close() {
		doorStatus = DoorStatus.CLOSED;
	}
	
	public void open() {
		doorStatus = DoorStatus.OPEND;
	}
}
