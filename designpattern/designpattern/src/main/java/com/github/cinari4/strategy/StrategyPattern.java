package com.github.cinari4.strategy;

import com.github.cinari4.strategy.attack.MissileStrategy;
import com.github.cinari4.strategy.attack.PunchStrategy;
import com.github.cinari4.strategy.moving.FlyingStrategy;

public class StrategyPattern {
	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("taekwonV");
		Robot atom = new Atom("atom");
		
		taekwonV.setAttackStrategy(new MissileStrategy());
		atom.setAttackStrategy(new PunchStrategy());
		
		taekwonV.setMovingStrategy(new FlyingStrategy());
		atom.setMovingStrategy(new FlyingStrategy());
		
		System.out.println(taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
			
		System.out.println(atom.getName());
		atom.move();
		atom.attack();
	}
}

