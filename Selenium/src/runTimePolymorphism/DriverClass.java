package runTimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		
		ClassA.test(new ChromeDriver(), "http://www.google.co.in/","Google");
		ClassA.test(new FirefoxDriver(), "http://www.google.co.in/","Google");
		ClassA.test(new EdgeDriver(), "http://www.google.co.in/","Google");
	}

}
