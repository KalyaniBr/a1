package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d =new ChromeDriver();

	d.get("https://www.facebook.com/");
	
	d.findElement(By.xpath("//a[contains(text(),'a Page')]")).click();
	
	d.findElement(By.xpath("//span[contains(text(),'log in to Facebook')]")).click();
	d.findElement(By.xpath("//span[contains(text(),'log in to Facebook')]")).click();
	
	d. findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
}
}
