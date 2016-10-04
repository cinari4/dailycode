package com.github.cinari4.composite.not;

import lombok.Getter;

public class Body {
	@Getter
	private int price;
	
	@Getter
	private int power;
	
	public Body(int power, int price) {
		this.power = power;
		this.price = price;
	}
}
