package com.github.cinari4.composite.not;

import lombok.Getter;

public class Monitor {
	@Getter
	private int price;
	
	@Getter
	private int power;
	
	public Monitor(int power, int price) {
		this.power = power;
		this.price = price;
	}
}

