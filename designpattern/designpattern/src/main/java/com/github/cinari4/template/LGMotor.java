package com.github.cinari4.template;

public class LGMotor extends Motor {
	public LGMotor(Door door) {
		super(door);
	}
	
	protected void moveMotor(Direction direction) {
		System.out.println("move lg motor");
	}

}
