package com.pioneercoders.oops;

class Graduates { // creating the class
	int RegNo;
	String Name;
	int Marks;
	
	// observe that, in the below method both parameter's names and variable's names are same
	Graduates(int RegNo, String Name, int Marks) { // create method
		this.RegNo = RegNo; // using "this" keyword in order to represent that variable belongs to current class
		this.Name = Name;
		this.Marks = Marks;
	}
}

public class ThisKeywordEx {
	public static void main(String args[]) {
		Graduates g = new Graduates(786, "Siva", 915); // calling the Constructor method by passing parameters
		System.out.println(g.RegNo + " " + g.Name + " " + g.Marks); // printing the statements

	}
}
