package com.github.cinari4.factorymethod;

public class ThroughputScheduler implements ElevatorScheduler {
	private static final ThroughputScheduler INSTANCE = new ThroughputScheduler();
	
	public int selectElevator(ElevatorManager manager,
			int destination, Direction direction) {
		return 0;
	}
	
	public static ElevatorScheduler getInstance() {
		return INSTANCE;
	}
}
