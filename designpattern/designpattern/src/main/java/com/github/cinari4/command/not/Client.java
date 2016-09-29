package com.github.cinari4.command.not;

public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Alarm alarm = new Alarm();
		Button button = new Button(lamp, alarm);
		
		button.setMode(Mode.LAMP);
		button.pressed();
		
		button.setMode(Mode.ALARM);
		button.pressed();
	}
}
