package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");

	WebDriver dr=new ChromeDriver();
	 dr.get("https://www.amazon.in/");
dr.findElement(By.xpath("(//a[contains(@href,'//www.amazon.in/ap/signin?openid.pape.')])[1]")).click();

//dr.findElement(By.xpath("(//i[contains(@class,' a-icon-checkbox')])[1]")).click();
	
	dr.findElement(By.xpath("//span[@class='a-expander-prompt']")).click();
	dr.findElement(By.xpath("//a[contains(@href,'/gp/help/customer/account-issues')]")).click();
	dr.findElement(By.xpath("//select[contains(@id,'firstNode')]")).click();
}
}
