package MyProfile;


import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class P6_MyProfile { 
	
	 @FindBy(xpath="//input[@name='personName']") private WebElement MyName;
 public	WebDriver driver;
	
	public P6_MyProfile(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void SwitchtoWindow() 
	{
		
		Set<String> allIds = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList(allIds);
		driver.switchTo().window(al.get(1));
	}
	
	public String verifyname()
	
	{
		String Actname = MyName.getAttribute("value");
		return Actname;
	}
	
	
	
	
	
	
	
	
	
}
