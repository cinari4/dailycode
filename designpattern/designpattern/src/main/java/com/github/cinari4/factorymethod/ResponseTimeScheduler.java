package com.github.cinari4.factorymethod;

public class ResponseTimeScheduler implements ElevatorScheduler {
	private static final ResponseTimeScheduler INSTANCE = new ResponseTimeScheduler();
	
	public int selectElevator(ElevatorManager manager,
			int destination, Direction direction) {
		return 0;
	}
	
	public static ElevatorScheduler getInstance() {
		return INSTANCE;
	}
}
