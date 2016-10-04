package com.github.cinari4.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Keyboard  extends ComputerDevice {
	@Getter
	private int power;
	
	@Getter
	private int price;
}
