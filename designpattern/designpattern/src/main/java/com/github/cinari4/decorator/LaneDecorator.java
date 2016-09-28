package com.github.cinari4.decorator;

public class LaneDecorator extends DisplayDecorator {
	public LaneDecorator(Display displayDecorator) {
		super(displayDecorator);
	}
	
	public void draw() {
		super.draw();
		drawLane();
	}
	
	private void drawLane() {
		System.out.println("\tdraw lane");
	}
}
