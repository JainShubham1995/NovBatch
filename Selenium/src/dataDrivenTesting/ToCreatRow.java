package dataDrivenTesting;

import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToCreatRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub -
		FileInputStream fis = new FileInputStream("./testData/excelData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		 workbook.getSheet("Sheet1").getRow(0).createCell(3).setCellValue("Name");
		 workbook.getSheet("Sheet1").createRow(2).createCell(0).setCellValue("https://smartbear.com/blog/your-guide-to-data-driven-testing/");
	
		FileOutputStream fos = new FileOutputStream("./testData/excelData.xlsx");
		workbook.write(fos);

	}

}
