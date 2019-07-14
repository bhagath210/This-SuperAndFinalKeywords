package com.pioneercoders.oops;

class Person {
	Person() {
		System.out.println("Person class Constructor");
	}
}

class Students extends Person {
	Students() {
		super();

		System.out.println("Student class Constructor");
	}
}

public class SuperKeywordOnConstructorsEx {
	public static void main(String[] args) {
		Students s = new Students();
	}
}