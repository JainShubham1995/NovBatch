package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDataFromExcelSheets {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
				FileInputStream fis = new FileInputStream("./testData/excelData.xlsx");
				Workbook workbook = WorkbookFactory.create(fis);
				Sheet sheet = workbook.getSheet("Sheet1");
				Row row = sheet.getRow(1);
				Cell cell = row.getCell(0);
				String url = cell.toString();
				System.out.println(url);
				
				String username = row.getCell(1).toString();
				System.out.println(username);
				String password = row.getCell(2).toString();
				System.out.println(password);
				

				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get(url);
				 
				driver.findElement(By.id("username")).sendKeys(username);
				driver.findElement(By.name("pwd")).sendKeys(password);
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
				

	}

}
