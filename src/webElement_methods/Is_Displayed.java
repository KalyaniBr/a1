package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://www.facebook.com/");
      
      
   boolean result = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]")).isDisplayed();
      System.out.println(result);
      
      if(result==true)
      { 
    	  System.out.println("Element is Displayed");
      }
      else
      {
    	  System.out.println("Element is not Displayed");
      }
      
      
      
      
}
}
