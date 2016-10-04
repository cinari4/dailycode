package com.github.cinari4.composite.not;

public class Computer {
	private Body body;
	private Keyboard keyboard;
	private Monitor monitor;
	
	public void addBody(Body body) {
		this.body = body;
	}
	
	public void addKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	
	public void addMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	public int getPrice() {
		return body.getPrice() + keyboard.getPrice() + monitor.getPrice();
	}
	
	public int getPower() {
		return body.getPower() + keyboard.getPower() + monitor.getPower();
	}
}
