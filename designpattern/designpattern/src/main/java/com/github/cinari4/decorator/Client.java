package com.github.cinari4.decorator;

public class Client {
	public static void main(String[] args) {
		// usage1
		Display road = new RoadDisplay();
		road.draw();
		
		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw();
		
		Display trafficRoad = new TrafficDecorator(
				new LaneDecorator(new RoadDisplay()));
		trafficRoad.draw();
		
		// usage2
		Display road1 =  new RoadDisplay();
		for (String decoratorName : args) {
			if (decoratorName.equalsIgnoreCase("Lane")) {
				road = new LaneDecorator(road);
			}
			if (decoratorName.equalsIgnoreCase("Traffic")) {
				road = new TrafficDecorator(road);
			}
		}
		road.draw();
		
	}
}
