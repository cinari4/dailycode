package com.github.cinari4.decorator;

public class TrafficDecorator extends DisplayDecorator {
	public TrafficDecorator(Display displayDecorator) {
		super(displayDecorator);
	}
	
	public void draw() {
		super.draw();
		drawTraffic();
	}
	
	private void drawTraffic() {
		System.out.println("\tdraw traffic");
	}
}
