package com.github.cinari4.abstractfactory.not;

public class LGMotor extends Motor {
	public LGMotor() {
	}

	@Override
	protected void moveMotor(Direction direction) {
	System.out.println("move lg motor");	
	}

}
