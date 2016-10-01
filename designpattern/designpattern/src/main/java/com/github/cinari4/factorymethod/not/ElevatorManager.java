package com.github.cinari4.factorymethod.not;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler;
	
	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		for (int i = 0; i < controllerCount; i++) {
			ElevatorController controller = new ElevatorController(1);
			controllers.add(controller);
		}
		scheduler = new ThroughputScheduler();
	}
	
	void requestElevator(int destination, Direction direction) {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if (hour < 12) {
			scheduler = new ResponseTimeScheduler();
		} else {
			scheduler = new ThroughputScheduler();
		}
		
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}
