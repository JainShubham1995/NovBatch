package genericUtilty;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility
{
	public String fetchStringDataFromExcelSheets(String sheetName, int rowNo, int cellNO) throws EncryptedDocumentException, IOException {
		FileInputStream fisExcel = new FileInputStream("./testdata/excelData.xlsx");
		Workbook workbook = WorkbookFactory.create(fisExcel);
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNO).toString();
		
		
	}
	
	
	
	
	
	
	

}
