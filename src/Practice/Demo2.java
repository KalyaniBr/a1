package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d =new ChromeDriver();

	d.get("https://www.irctc.co.in/");
	
d.findElement(By.xpath("//button[contains(@class,'train_Search')]")).click();
	
	}	
	
}
