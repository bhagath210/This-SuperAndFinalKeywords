package com.pioneercoders.oops;

class Vehicle { // SUPER CLASS
	int MaxSpeed = 150; // VARIABLE IN SUPER CLASS

	void motion() { // METHOD IN SUPER CLASS
		System.out.println("The vehicle is moving Forward with a speed of " + MaxSpeed+ "kmph");
		System.out.println(" ");
	}
}

class Car extends Vehicle { // SUB CLASS
	int MaxSpeed = 120; // VARIABLE IN SUB CLASS

	void motion() { // MTHOD IN SUB CLASS
		super.motion(); // CALLING OF METHOD IN SUPER CLASS BY USING SUPER KEYWORD

		System.out.println("Car speed is " + MaxSpeed + "kmph"); // CALLING METHOD IN SUB CLASS
		System.out.println(" ");
		System.out.println("Car also reach " + super.MaxSpeed + "kmph"); // PRINTING SUPER CLASS's VARIABLE
	}
}

public class SuperKeywordEx {
	public static void main(String args[]) {
		Car car = new Car(); // OBJECT CREATION WITH SUB CLASS NAME
		car.motion(); // CALLING SUB CLASS METHOD
	}
}