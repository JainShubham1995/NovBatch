package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	public static void main(String[] args) {
		String expectedUrl = "facebook";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.facebook.com/");
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actual Url : "+actualUrl);
		System.out.println("Expected Url : "+expectedUrl);
		
	 	if(actualUrl.contains(expectedUrl)) {
	 		System.out.println("Pass : The Url has been verified");
	 	}
	 	else
	 		System.out.println("Pass : The Url has not been verified");
	}

		
	}


