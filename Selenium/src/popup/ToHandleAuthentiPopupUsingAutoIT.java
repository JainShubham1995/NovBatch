package popup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAuthentiPopupUsingAutoIT {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/basic_auth"); //http://admin:admin@the-internet.herokuapp.com/basic_auth
		
		//We can handle authentication pop up by using both way first pass the user name and password in URL Second pass value by AutoIt.
		
		Runtime.getRuntime().exec("./AutoIT/Auth.exe");

	}

}
