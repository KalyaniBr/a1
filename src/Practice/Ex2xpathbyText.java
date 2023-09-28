package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2xpathbyText {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
     WebDriver driver = new ChromeDriver();
    
	driver.get("https://www.flipkart.com/");
		
//	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9604893245");  //By attribute
	
	//driver.findElement(By.xpath("//span[text()='Forgot?']")).click();	//forgot button	
	
	driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click(); //new to button
//	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9604893245"); 
	//driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();  //continue button
	
	
	driver.findElement(By.xpath("//span[text()='Existing User? Log in']")).click(); //existing user 
	
}
}
