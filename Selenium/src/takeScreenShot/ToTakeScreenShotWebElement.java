package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenShotWebElement {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		String sysDatetime = date.toString().replace(" ","_").replace(":","_");
		System.out.println(sysDatetime);

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='desktop-navLink']")); 
		 File source = logo.getScreenshotAs(OutputType.FILE);		/*getscreenshotAs is used to store the screenshot and OutputType.Fiile is use to convert
		 Screenshot img into file format*/
		 File destination = new File("./screenshot/myntralogo"+sysDatetime+".png");  /*File object create for store the Screenshot file in a new created folder
		  in  eclipse. because if screenshot is not in java file then another person not able to understand the Actual*/
		 Files.copy(source, destination);
	}

}
