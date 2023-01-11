package testNg;

import org.testng.annotations.Test;

public class DependsonMethods {
	
	@Test (priority=1)
	public void login() {
		System.out.println("logged in");
	}
	@Test (dependsOnMethods="login")
	public void search() {
		System.out.println("Product found");
	}
	@Test (dependsOnMethods="search")
	public void select() {
		System.out.println("Product Selected");
	}
	@Test (dependsOnMethods="select")
	public void addToCart() {
		System.out.println("Added in cart");
	}
	@Test (dependsOnMethods="addToCart")
	public void payment() {
		System.out.println("Payment made Successfully");
	}
	@Test (dependsOnMethods="payment")
	public void logOut() {
		System.out.println("logged Out Succesfully");
	}

}
