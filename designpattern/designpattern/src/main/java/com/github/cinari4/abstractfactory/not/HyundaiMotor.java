package com.github.cinari4.abstractfactory.not;

public class HyundaiMotor extends Motor {
	public HyundaiMotor() {
	}

	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("move hyundai motor");
	}

}
