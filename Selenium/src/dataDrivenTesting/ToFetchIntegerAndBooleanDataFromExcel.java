package dataDrivenTesting;

import java.io.FileInputStream; 

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchIntegerAndBooleanDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/excelData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet2");
		 double value = sheet.getRow(0).getCell(0).getNumericCellValue();
		 boolean boolvalue = sheet.getRow(0).getCell(1).getBooleanCellValue();
		
		System.out.println(value);
		System.out.println(boolvalue);

		
	}

}
