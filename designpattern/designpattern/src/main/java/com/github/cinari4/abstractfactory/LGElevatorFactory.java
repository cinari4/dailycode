package com.github.cinari4.abstractfactory;

public class LGElevatorFactory extends ElevatorFactory {
	private final static ElevatorFactory INSTANCE = new LGElevatorFactory();
	private LGElevatorFactory() {}
	
	@Override
	public Motor createMotor() {
		return new LGMotor();
	}

	@Override
	public Door createDoor() {
		return new LGDoor();
	}

	public static ElevatorFactory getInstance() {
		return INSTANCE;
	}

}
