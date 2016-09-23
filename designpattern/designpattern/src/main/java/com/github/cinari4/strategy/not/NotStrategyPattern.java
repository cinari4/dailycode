package com.github.cinari4.strategy.not;

public class NotStrategyPattern {
	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("taekwonV");
		Robot atom = new Atom("atom");
			
		System.out.println(taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
			
		System.out.println(atom.getName());
		atom.move();
		atom.attack();
	}
}
