package com.github.cinari4.strategy.not;

public class TaekwonV extends Robot {
	public TaekwonV(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Missile attack");
	}

	@Override
	public void move() {
		System.out.println("I can walk");
	}
}