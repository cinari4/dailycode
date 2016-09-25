package com.github.cinari4.singleton.general;

public class User {
	public static void main(String[] args) {
		int numUsers = 5;
		for(int i = 0; i < numUsers; i++) {
			Printer printer = Printer.getPrinter();
			System.out.println(
					String.format("%d-user using printer %s", i+1, printer.toString()));
		}
	}
}
