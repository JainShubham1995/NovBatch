package testNg;

import org.testng.annotations.Test;

//if u want to run same test case multiple times with multiple data then use DataProvider Annotation

public class DataProvider {
	
	@Test (dataProvider = "data")
	public void test (String state, String capital) {
	System.out.println(state+" : "+capital);
	}
	@org.testng.annotations.DataProvider
	public Object[][] data() 
	{
	Object[][] ar = new Object [3][2];
	
	ar[0][0] = "Delhi";
	ar[1][0] = "UP";
	ar[2][0] = "Karnatka";
	
	
	ar[0][1] = "New Delhi";
	ar[1][1] = "Lucknow";
	ar[2][1] = "Banglore";
	return ar;
	
	}

}
