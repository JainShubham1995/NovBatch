package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);  //if the page take more time to open then we have to increase the time in thread.sleep
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sj177889@gmail.com");//(by.id("email") it can be also used
		Thread.sleep(2000);
		
		boolean enabled = driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).isEnabled();
		
		if(enabled) {
			System.out.println("Pass: The button is enabled");
		}
		else
			System.out.println("fail: The button is not enabled");
			
	}

}
