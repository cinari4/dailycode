package com.github.cinari4.template;

public class HyundaiMotor extends Motor {
	public HyundaiMotor(Door door) {
		super(door);
	}
	
	protected void moveMotor(Direction direction) {
		System.out.println("move hyundai motor");
	}
}
