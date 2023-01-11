package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchByUsingEnterKey {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		WebElement passwordTextField = driver.findElement(By.name("pwd")); 
		passwordTextField.sendKeys("manager"); 
		Thread.sleep(3000);
		passwordTextField.sendKeys(Keys.ENTER);
		
	
		
		
//this is the valid way if we are using same code in a same program then we have to store that code on a reference variable after that we can use it many time it is a perfect way.
		

	}

}
