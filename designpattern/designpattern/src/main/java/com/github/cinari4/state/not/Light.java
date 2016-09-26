package com.github.cinari4.state.not;

public class Light {
	private static int ON = 0;
	private static int OFF = 1;
	private int state;
	
	public Light() {
		state = OFF;
	}
	
	public void on_button_pushed() {
		if (state == ON) {
			System.out.println("staty this state");
		} else {
			System.out.println("Light On!");
			state = ON;
		}
	}
	
	public void off_button_pushed() {
		if (state == OFF) {
			System.out.println("stay this state");
		} else {
			System.out.println("Light Off!");
			state = OFF;
		}
	}
}
