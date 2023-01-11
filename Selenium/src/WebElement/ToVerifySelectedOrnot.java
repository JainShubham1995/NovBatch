package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifySelectedOrnot {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sj177/OneDrive/Desktop/Webpage.html");
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		
		boolean selected = checkBox.isSelected();
		
		if(selected) {
			System.out.println("pass: The checkbox is selected");
		}
		else
			System.out.println("Fail: The checkbox is not selected");
		
		
		
	}

}
