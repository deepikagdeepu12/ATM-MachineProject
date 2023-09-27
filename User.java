package com.atm;

public class User {
	private double userId;
	private int pin;

	public User(double userId, int pin) {
		
		this.userId = userId;
		this.pin = pin;
	}

	public boolean validate(double userId1, int pin1) {
		if ((userId == userId1) && (pin == pin1)) {
			System.out.println("Login Successfully");
			System.out.println("****************");
			return true;
		} else {
			System.out.println("Login failed. Please enter correct UserId and Pin.");
			System.out.println("****************");
			return false;
		}
		
	

	}
}
