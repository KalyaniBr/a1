package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");

	WebDriver d =new ChromeDriver();
	
	
	d.get("https://collegedunia.com/");
	
	
	
	d.findElement(By.xpath("//button[contains(@class,'cd-nav-menu-links pointer')]")).click();
	
}
}
