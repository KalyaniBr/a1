package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_4_getTitle {
public static void main(String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
	  String title =driver.getTitle();
	  
	  System.out.println(title);
	  //or
	  System.out.println(driver.getTitle());
}
}
