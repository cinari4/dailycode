package com.github.cinari4.state;

public class OFF implements State {
	public static OFF off = new OFF();
	private OFF() {}
	
	public static OFF getInstance() {
		return off;
	}
	
	public void on_button_pushed(Light light) {
		light.setState(ON.getInstance());
		System.out.println("Light On!");
	}

	public void off_button_pushed(Light light) {
		System.out.println("nothing happened");
	}

}
