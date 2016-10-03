package com.github.cinari4.abstractfactory;

public class HyundaiElevatorFactory extends ElevatorFactory {
	private final static ElevatorFactory INSTANCE = new HyundaiElevatorFactory();
	private HyundaiElevatorFactory() {} 
	
	@Override
	public Motor createMotor() {
		return new HyundaiMotor();
	}
	
	@Override
	public Door createDoor() {
		return new HyundaiDoor();
	}

	public static ElevatorFactory getInstance() {
		return INSTANCE;
	}
	
}
