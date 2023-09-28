package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7 {
public static void main(String[] args) {
	
	
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
			
		     WebDriver driver = new ChromeDriver();
		 
			driver.get("https://www.meesho.com/");
			
			driver.findElement(By.xpath("//span[text()='Download App']")).click();

	
	
	
}
}
