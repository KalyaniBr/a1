package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6_maximise {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
//      Options s1 =driver.manage();
//      Window s2=s1.window();
//    	s2.	maximize();
//	
    	driver.manage().window().minimize(); //tp minimise the window
    	driver.manage().window().maximize(); //to minimize the window
}

	
	}
