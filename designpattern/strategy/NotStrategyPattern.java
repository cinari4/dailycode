package com.github.cinari4;

public class NotStrategyPattern {
	public abstract class Robot {
		private String name;
		
		public Robot(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public abstract void attack();
		public abstract void move();
	}
	
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
	
	public NotStrategyPattern() {
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
