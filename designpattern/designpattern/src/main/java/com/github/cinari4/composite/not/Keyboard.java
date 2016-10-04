package com.github.cinari4.composite.not;

import lombok.Getter;

public class Keyboard {
	@Getter
	private int price;
	@Getter
	private int power;
	
	public Keyboard(int power, int price) {
		this.power = power;
		this.price = price;
	}
}
