package com.github.cinari4.factorymethod;

public class Client {
	public static void main(String[] args) {
		ElevatorManager em1 = new ElevatorManagerWithDynamicScheduling(2);
		em1.requestElevator(10, Direction.UP);
		
		em1 = new ElevatorManagerWithResponseTimeScheduling(2);
		em1.requestElevator(10, Direction.UP);
		
		em1 = new ElevatorManagerWithThroughtScheduling(2);
		em1.requestElevator(10, Direction.UP);
		
	}
}
