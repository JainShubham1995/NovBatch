package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyFbErrorMsg {

	public static void main(String[] args) throws InterruptedException {
	
		String expectedErrorMsg = "The email address and mobile number";	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("login")).click();
		String actualErrorMsg = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		System.out.println(actualErrorMsg);
		
		if(actualErrorMsg.contains(expectedErrorMsg))
		{
			System.out.println("Pass The error msg has been displayed");
		}
		else
			System.out.println("Fail: The error msg has not been displayed");
		
		driver.quit();
		

	}

}
