package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class get {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();

//	driver.get("https://www.facebook.com/");
//	driver.get("https://www.flipkart.com/");
//	driver.getTitle();	
//   String	s1 =driver.getTitle();
//    System.out.println(s1);
//    //or
//    System.out.println(driver.getTitle());
//    
//    driver.getCurrentUrl();
//   String s2=driver.getCurrentUrl();
//    System.out.println(s2);
//      //OR
//   System.out.println(driver.getCurrentUrl());
//    
//    Options s=driver.manage();
//    Window s3=s.window();
//    s3.minimize();
//    
	driver.navigate().to("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	
	
	
	
	
}
}