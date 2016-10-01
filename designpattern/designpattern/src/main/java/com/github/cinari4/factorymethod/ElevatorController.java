package com.github.cinari4.factorymethod;

public class ElevatorController {
	private int id;
	private int currentFloor;
	
	public ElevatorController(int id) {
		this.id = id;
		currentFloor = 1;
	}
	
	public void gotoFloor(int destination) {
		System.out.println(String.format("Elevator [%d] Floor : ", currentFloor));
		currentFloor = destination;
		System.out.println(String.format(" ==> %d", currentFloor));
		
	}
}
