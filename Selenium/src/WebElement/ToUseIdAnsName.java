package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdAnsName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);//if the page take more time to open then we have to increase the time in thread.sleep
		
		boolean dispalyed = driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();   //(by.id("email") it can be also used
		if(dispalyed) {
			System.out.println("Pass: The Elemment Is displayed");
		}
		else
			System.out.println("Fail: The Element is not displayed");

	}

}
