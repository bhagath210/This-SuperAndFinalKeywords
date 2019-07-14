package com.pioneercoders.oops;

public class FinalKeywordOnVariablesEx {
	public static void main(String args[]) {
		int x = 10; // normal variable representation
		final int y = 18; // variable representation by using FINAL keyword
		System.out.println("The normal variable is: " + x); // printing normal variable  
		System.out.println("The Final keyword variable is: " + y); // printing variable representation by using FINAL keyword
		//y=10;  // we got error bcz we trying to change the final keyword variable's value
		//System.out.println("The Final keyword variable is: " + y); 
		add(x, y); // calling the add method by passing the variables
	}

	static void add(int x, int y) { // add method
		x = 9;
		y = 10; // here we aren't get the error bcz we declare final variable in the main method
		int z = x + y;
		System.out.println("The result is: " + z);
	}
}