package com.pioneercoders.oops;

class Produc {
	int productId;
	String productName;

	void Product(int productId) { // constructor 1
		this.productId = productId;
	}

	void Product(int productId, String productName) { // constructor 2
		this.Product(productId); // calling the above constructor using this keyword
		this.productName = productName;
	}
}

public class ThisKeywordCallingConstructorInConstructor {
	public static void main(String args[]) {
		Produc p = new Produc();
		p.Product(786); // calling constructor with one parameter
		p.Product(89, "lenevo"); // calling constructor with one parameter
		System.out.println(p.productId + " " + p.productName);
	}
}
