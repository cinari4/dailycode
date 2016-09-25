package com.github.cinari4.singleton.general;

public class Printer {
	private static Printer printer = null;
	private Printer() {}
	
	public static Printer getPrinter() {
		if (printer == null) {
			printer = new Printer();
		}
		return printer;
	}
	
	public void printer(String str) {
		System.out.println(str);
	}
}
