package com.github.cinari4.abstractfactory;

public class LGMotor extends Motor {
	public LGMotor() {
	}

	@Override
	protected void moveMotor(Direction direction) {
	System.out.println("move lg motor");	
	}

}
