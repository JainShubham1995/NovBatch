package automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowIds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		 String winIdForGoogle = driver.getWindowHandle();
		System.out.println(winIdForGoogle);
		
		
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();	
		driver1.get("https://www.facebook.com/");
		String winIdForFb = driver.getWindowHandle();
		System.out.println(winIdForFb);
		
		
		

	}

}
