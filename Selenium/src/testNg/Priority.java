package testNg;

import org.testng.annotations.Test;

public class Priority {
	//@Test Annotated method
		@Test (priority = 3)			//@Test = act like a main method
		public void gdemo() {
			System.out.println("gTest");
		}

		@Test (priority = 1)		
		public void bdemo() {
			System.out.println("bTest1");
		}

		@Test (priority = 2)
		public void idemo() {
			System.out.println("iDemo ");
		}
}
