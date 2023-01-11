package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMsg = "Pass: The error msg is verified";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.actitime.com/login.do");

		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 
		Thread.sleep(2000);
		
	String actualErrormsg = driver.findElement(By.className("erroormsg")).getText();
		
		if(actualErrormsg.equals(expectedErrorMsg)) {
			System.out.println("Pass: The error msg is verified" );
		}
			
			else
				System.out.println("Fail: The error msg is not verified");
		
		driver.quit();
			
		}
	}


