package com.github.cinari4.decorator.not;

public class Client {
	public static void main(String[] args) {
		RoadDisplay road = new RoadDisplay();
		road.draw();
		
		RoadDisplayWithLane roadWithLane = new RoadDisplayWithLane();
		roadWithLane.draw();
	}
}
