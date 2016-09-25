package com.github.cinari4.singleton.threadsafe.staticvariable;

public class User {
	public static void main(String[] args) {
		int numUser = 5;
		
		for (int i = 0; i < numUser; i++) {
			UserThread userThread = new UserThread(i+1 + "-thread");
			userThread.start();
		}
	}
}

