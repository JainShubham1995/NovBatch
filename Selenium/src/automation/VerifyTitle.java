package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		String expectedTitle = "Google";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	 	WebDriver driver =new ChromeDriver();
	 	driver.get("htttp;//wwww.google.co.in/");
	 	
	 	String actualTitle = driver.getTitle();
	 	System.out.println("Actual title: "+actualTitle);
	 	System.out.println("Expected title: "+expectedTitle);
	 	
	 	if(actualTitle.contains(expectedTitle)) {
	 		System.out.println("Pass : The Title has been verified");
	 	}
	 	else
	 		System.out.println("Pass : The Title has not been verified");
	}

}

