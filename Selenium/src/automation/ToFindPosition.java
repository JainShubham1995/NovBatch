package automation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindPosition {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		Point position = driver.manage().window().getPosition();
		int startx = position.getX();
		int starty = position.getY();
		
		System.out.println(startx);
		System.out.println(starty);

	}

}
