package testNg;

import org.testng.annotations.Test;

public class ClassA {
	@Test (groups = "smoke")
	public void login() {
		System.out.println("logged in");
	}
	@Test (groups = "regressiion")
	public void search() {
		System.out.println("Product found");
	}
	@Test (groups = "regressiion")
	public void select() {
		System.out.println("Product Selected");
	}
	@Test (groups = "regressiion")
	public void addToCart() {
		System.out.println("Added in cart");
	}
	@Test (groups = "regressiion")
	public void payment() {
		System.out.println("Payment made Successfully");
	}
	@Test (groups = "smoke")
	public void logOut() {
		System.out.println("logged Out Succesfully");
	}

}
