package com.github.cinari4.template.not;

public class HyundaiMotor {
	private Door door;
	private MotorStatus motorStatus;
	
	public HyundaiMotor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}
	
	private void moveHyundaiMotor(Direction direction) {
		System.out.println("move hyundai motor");
	}
	
	public MotorStatus getMotorStatus() {
		return motorStatus;
	}
	
	private void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING) {
			return;
		}
		
		DoorStatus doorStatus = door.getDoorStatus();
		if (doorStatus == DoorStatus.OPEND) {
			door.close();
		}
		
		moveHyundaiMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
}
