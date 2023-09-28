package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d =new ChromeDriver();

	d.get("https://www.instagram.com/");
	
	d.findElement(By.xpath("//span[contains(text(),'Sign ')]")).click();
	
	//d.findElement(By.xpath("//button[text()='Log in with Facebook']")).click(); //bytext
	
	
	
}
}
