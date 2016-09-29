package com.github.cinari4.command.not;

enum Mode { LAMP, ALARM };

public class Button {
	private Lamp theLamp;
	private Alarm theAlarm;
	private Mode theMode;
	
	public Button(Lamp theLamp, Alarm theAlarm) {
		this.theLamp = theLamp;
		this.theAlarm = theAlarm;
	}
	
	public void setMode(Mode mode) {
		this.theMode = mode;
	}
	
	public void pressed() {
		switch (theMode) {
		case LAMP:
			theLamp.turnOn();
			break;
		case ALARM:
			theAlarm.start();
			break;
		}
	}
}
