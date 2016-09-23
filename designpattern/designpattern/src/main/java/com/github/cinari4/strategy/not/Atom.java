package com.github.cinari4.strategy.not;

public class Atom extends Robot {
	public Atom(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Strong punch");
	}

	@Override
	public void move() {
		System.out.println("I can fly");
	}
}
