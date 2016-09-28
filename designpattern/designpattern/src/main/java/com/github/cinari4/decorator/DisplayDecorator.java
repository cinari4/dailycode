package com.github.cinari4.decorator;

public abstract class DisplayDecorator extends Display {
	private Display decoratedDisplay;
	
	public DisplayDecorator(Display decorateDisplay) {
		this.decoratedDisplay = decorateDisplay;
	}
	
	public void draw() {
		decoratedDisplay.draw();
	}
}
