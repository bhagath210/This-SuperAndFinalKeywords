package com.pioneercoders.oops;

final class Products { // declaring a class with final keyword
	int Model = 310;
	String Name; // = "Lenovo";
	Float Price ; //= 35000.00f;
}

public class FinalKeywordOnClassEx {
public static void main(String args[]) {
		Products p = new Products();
		p.Model = 0101;
		p.Name = "Dell";
		p.Price = 35000.00f;
		System.out.println(p.Model + " " + p.Name + " " + p.Price);
	}
} 

// the value of final variable is changed but gives the different value