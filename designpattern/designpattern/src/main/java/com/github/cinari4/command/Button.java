package com.github.cinari4.command;

public class Button {
	private Command theCommand;
	
	public Button(Command theCommand) {
		setCommand(theCommand);
	}
	
	public void setCommand(Command newCommand) {
		this.theCommand = newCommand;
	}
	
	public void press() {
		theCommand.execute();
	}
}
