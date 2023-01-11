package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToparentWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		
		String parentWinId = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> allWinIds = driver.getWindowHandles();
		
		for(String id:allWinIds) {
			driver.switchTo().window(id);
			if(!id.equals(parentWinId));{
			driver.findElement(By.linkText("Try Free")).click();
			break;
			
		}
	}

		driver.switchTo().window(parentWinId);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
}
}
