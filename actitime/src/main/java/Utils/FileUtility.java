package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	
	
	public String fetchDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\automation19may\\automation_19may\\testData\\propertyData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		return prop.getProperty(key);
		
	}
	
	public String fetchDataFromExcelSheet(String sheetName, int rowno, int cellno) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\automation19may\\automation_19may\\testData\\Exceldata2.xlsx");
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowno).getCell(cellno).toString();
		
		
	}

}
