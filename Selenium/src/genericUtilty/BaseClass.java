package genericUtilty;

import java.io.IOException;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POMRepo.Homepage;
import POMRepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fUtils = new FileUtility();
	public ExcelUtility eUtils = new ExcelUtility();
	@BeforeSuite
	public void bsCofig() 
	{
		System.out.println("Data base connection has been established");		
	}
	@BeforeClass
	public void bcCofig() throws IOException 
	{
	String url = fUtils.fetchDataFromPropertyFile("url");
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get(url);
	
	System.out.println("browser launched");
	System.out.println("navigate Url");		
	}
	@BeforeMethod
	public void bmCofig() throws IOException {
		String username = fUtils.fetchDataFromPropertyFile("username");
		String password = fUtils.fetchDataFromPropertyFile("password");
		LoginPage login = new LoginPage(driver);
		login.loginAction(username, password);
		System.out.println("logeed in");		
	}
	@AfterMethod
	public void amCofig() {
		Homepage home = new Homepage(driver);
		home.logoutAction();
		System.out.println("Logged out from to the Application");
		}
	@AfterClass
	public void acCofig() {
		driver.quit();
		System.out.println("Browser has been Closed");	
		
			}
	@AfterSuite
	public void asCofig() {
		System.out.println("DataBase Connection has been Closed");	
		
			}
}