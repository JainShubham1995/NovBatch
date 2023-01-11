package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenShotOfWebpage1 {

	public static void main(String[] args) throws IOException {
		
		Date date = new Date();
		String sysDatetime = date.toString().replace(" ","_").replace(":","_");  //this line use to relace space into Hyphen.
		System.out.println(sysDatetime);
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.actitime.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;		//Takes screenshot is used to take screenshot for a particular page or web element
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshot/actitime"+sysDatetime+".png");  // +sysDatetime+ is used to save screenshot to again with unique date or time.
		Files.copy(source, destination);

	}

}
