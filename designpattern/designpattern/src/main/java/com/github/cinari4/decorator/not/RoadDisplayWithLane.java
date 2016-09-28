package com.github.cinari4.decorator.not;

public class RoadDisplayWithLane extends RoadDisplay {
	public void draw() {
		super.draw();
		drawLane();
	}
	
	private void drawLane() {
		System.out.println("draw lane");
	}
}
