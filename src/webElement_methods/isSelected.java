package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
   WebDriver driver= new ChromeDriver();
   
   driver.get("https://www.facebook.com/");
   
   driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
   
	Thread.sleep(3000);

boolean result=driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
	
	System.out.println(result);
	
	if(result==true)
	{
		System.out.println("radio btn is Selected");
	}
	else
	{
		System.out.println("radio btn is not selected");
	}
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	
	Thread.sleep(2000);
	boolean result1=driver.findElement(By.xpath("(//label[@class=\"_58mt\"])[1]")).isSelected();

	System.out.println(result1);
	if(result1==true)
	{
		System.out.println("radio btn is Selected");
	}
	else
	{
		System.out.println("radio btn is not selected");
	}
//	result.click();
}
}
