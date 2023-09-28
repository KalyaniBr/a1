package libraryFiles;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
      public WebDriver driver;
	
	public void initializeBrowser() throws IOException 
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		 driver=new ChromeDriver(op);
		driver.get(UtilityClass.PropertyFileTD("URL"));;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();		
	}
	
	
	
	
	
}
