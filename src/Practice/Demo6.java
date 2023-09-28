package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");

	WebDriver d =new ChromeDriver();
	d.get("https://www.amazon.in/");
	//using xpathByindex
	d.findElement(By.xpath("(//a[contains(@href,'//www.amazon.in/ap/signin?openid.pape.')])[1]")).click();

	//xpathbycontainswith_attribute
	d.findElement(By.xpath("//input[contains(@class,'auth-autofocus auth-required-field')]")).sendKeys("Kalyani");
	
	//xpathByAttribute
	d.findElement(By.xpath("//input[@id='continue']")).click();
}
}
