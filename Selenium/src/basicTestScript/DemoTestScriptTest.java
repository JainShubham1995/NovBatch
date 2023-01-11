package basicTestScript;

import org.testng.annotations.Test;

import genericUtilty.BaseClass; 
public class DemoTestScriptTest extends BaseClass {
	
	@Test(priority = 1)
	public void verifyHomePage()
	{
		System.out.println("HomePage has been verified");
	}
	@Test(priority = 2)
	public void verifyCustomer() {
		System.out.println("Customer has been Verified");
	}
}
