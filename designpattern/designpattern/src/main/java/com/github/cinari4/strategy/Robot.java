package com.github.cinari4.strategy;

import com.github.cinari4.strategy.attack.AttackStrategy;
import com.github.cinari4.strategy.moving.MovingStrategy;

public abstract class Robot {
	private String name;
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;
	
	public Robot(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void attack() {
		attackStrategy.attack();
	}
	public void move() {
		movingStrategy.move();
	}
	
	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
	
	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}
}
