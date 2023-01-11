package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/sj177/OneDrive/Desktop/Xpath2.html");
		
		WebElement aTextField = driver.findElement(By.xpath("//input [@value='A']"));
		aTextField.clear();
		Thread.sleep(2000);
		aTextField.sendKeys("Shubham");

	}

}
