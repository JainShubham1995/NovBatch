package basicTestScript;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import POMRepo.Homepage;
import POMRepo.LoginPage;
import genericUtilty.BaseClass;
import genericUtilty.ExcelUtility;
import genericUtilty.FileUtility;
import genericUtilty.WebDriverUtility;

public class ToVerifyHomePageTest2 extends BaseClass{

	
	@Test
	public void  verifyHomePageTest() throws EncryptedDocumentException, IOException {
		
		String expectedTitle = eUtils.fetchStringDataFromExcelSheets("Sheet2", 1, 0);
		Homepage home = new Homepage(driver);
		
		//Test Script
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.toWaitForTitle(driver, "Enter");
		
		
		String actualTitle = home.verifyHomePageTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass Home page title is verified");
	
		
		
	}
}
