package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAlignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sj177/OneDrive/Desktop/Webpage.html");
		Point usernameLoc = driver.findElement(By.id("123")).getLocation();
		System.out.println(usernameLoc);
		int usernameStartX = usernameLoc.getX();
		
		Point passwordloc = driver.findElement(By.xpath("(//input[@type='text'])[2]")).getLocation();
		System.out.println(passwordloc);
		
		int passwordStartY = passwordloc.getY();
		
		System.out.println("The Start x of username is :"+usernameStartX);
		System.out.println("The Start y of username is :"+passwordStartY);
		if(usernameStartX==passwordStartY)  {
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		}
	}
