package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_xpathby_contains_withText {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d =new ChromeDriver();

	d.get("https://www.zomato.com/");
	
	
	
	d.findElement(By.xpath("//h5[contains(text(),'Malad ')]")).click();
	         //popular localities of nag 
}
}
