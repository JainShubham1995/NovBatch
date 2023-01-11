package testNg;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test (invocationCount = 5)      		//invocationCount is use to run the program as the no which is given 
	public void demoTest()
	{
	System.out.println("Test");
	}
}
