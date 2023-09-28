package libraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {

	public static String getTestData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException 
	//@Author Name: Kalyani
		//Date: 25th Aug 23
		//this method is use to get test data from excel sheet
		//need to pass  2 inputs
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\jayas\\eclipse-workspace\\SeleniumRevisionMavan\\TestData\\Selenium.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
		
		String value=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		
		return  value;
	}
	
	public static void screenshotoffailTC(WebDriver driver ,int TCID) throws IOException 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\jayas\\eclipse-workspace\\SeleniumRevisionMavan\\Screenshots"+TCID+".jpj");
		FileHandler.copy(src,dest);
	}
public static String PropertyFileTD(String Key) throws IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\jayas\\eclipse-workspace\\SeleniumRevisionMavan\\Properties.properties");
	Properties p=new Properties();
	p.load(file);
	String value=p.getProperty(Key);
	return value;
}
	
	
	
	
}
