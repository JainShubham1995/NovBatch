package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIndependantAndDependantXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/s?k=iphone+12&crid=2M0D43380C45I&sprefix=iphone+%2Caps%2C880&ref=nb_sb_ss_ts-doa-p_2_2");
		
		 
		WebElement price= driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - White']/../../../..//span[text()='60,900']"));
		String actualPrice = price.getText();
		System.out.println(actualPrice);
		
		
		

	}

}
