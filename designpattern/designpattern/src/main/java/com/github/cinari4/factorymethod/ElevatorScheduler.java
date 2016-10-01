package com.github.cinari4.factorymethod;

public interface ElevatorScheduler {
	public int selectElevator(ElevatorManager manager, int destionation, Direction direction);
}
