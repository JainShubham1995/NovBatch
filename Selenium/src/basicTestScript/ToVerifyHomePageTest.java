package basicTestScript;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import POMRepo.Homepage;
import genericUtilty.BaseClass;
import genericUtilty.WebDriverUtility;

public class ToVerifyHomePageTest extends BaseClass{

	
	@Test
	public void  verifyHomePageTest() throws EncryptedDocumentException, IOException {
		String expectedTitle = eUtils.fetchStringDataFromExcelSheets("Sheet2", 1, 0);
		Homepage home = new Homepage(driver);
		
		//Test Script
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.toWaitForTitle(driver, "Enter");
		
		
		String actualTitle = home.verifyHomePageTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass Home Page Title Is Verified");
	
		
		
	}
}
