package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	/*@Test
	public void  demo()
	{
		String expectedData = "abc";
		String actualData = "abc";
		
		Assert.assertEquals(expectedData, actualData);
		System.out.println("Pass");*/
		
		
		@Test
		public void  demo()
		{
			boolean expectedData = true;
			boolean actualData = false;
			
			Assert.assertEquals(expectedData, actualData);
			System.out.println("Pass");
	}
}
