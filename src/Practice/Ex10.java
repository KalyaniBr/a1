package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex10 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d =new ChromeDriver();
	d.get("https://www.zomato.com/");
	
	d.findElement(By.xpath("//a[text()='Investor Relations']")).click();
	
	d.findElement(By.xpath("//div[text()='ESG INITIATIVES']")).click();
	
	
	
	
	
}
}
