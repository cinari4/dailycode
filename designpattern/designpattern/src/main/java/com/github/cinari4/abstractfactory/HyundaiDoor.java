package com.github.cinari4.abstractfactory;

public class HyundaiDoor extends Door {
	@Override
	protected void doClose() {
		System.out.println("close HyundaiDoor");
	}

	@Override
	protected void doOpen() {
		System.out.println("open HyundaiDoor");
	}

}
