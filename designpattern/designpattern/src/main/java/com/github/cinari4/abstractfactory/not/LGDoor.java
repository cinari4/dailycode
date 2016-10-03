package com.github.cinari4.abstractfactory.not;

public class LGDoor extends Door {
	@Override
	protected void doClose() {
		System.out.println("close LGDoor");
		
	}

	@Override
	protected void doOpen() {
		System.out.println("open LGDoor");
	}

}
