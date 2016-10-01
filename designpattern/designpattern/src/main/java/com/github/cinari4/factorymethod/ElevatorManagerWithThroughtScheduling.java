package com.github.cinari4.factorymethod;

public class ElevatorManagerWithThroughtScheduling extends ElevatorManager {
	public ElevatorManagerWithThroughtScheduling(int controllerCount) {
		super(controllerCount);
	}
	
	protected ElevatorScheduler getScheduler() {
		ElevatorScheduler scheduler = ThroughputScheduler.getInstance();
		return scheduler;
	}
}
