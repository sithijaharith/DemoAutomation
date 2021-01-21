package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PG_IkmanLoginPage {
	
	
	
	WebDriver driver;
	
	public PG_IkmanLoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By lbl_Login   =By.xpath("//span[contains(text(),'Log in')]");
	By tf_UserName =By.xpath("//input[@id=\"input_email\"]");
	By tf_Password =By.xpath("//input[@id=\"input_password\"]");
    By btn_Login   =By.xpath("//button[contains(text(),'Login')]");
   

    public WebElement lbl_Login()
    {
    	
    	return driver.findElement(lbl_Login);
    }
    public WebElement tf_UserName()
    {
    	
    	return driver.findElement(tf_UserName);
    }
    public WebElement tf_Password()
    {
    	
    	return driver.findElement(tf_Password);
    }
    public WebElement btn_Login()
    {
    	
    	return driver.findElement(btn_Login);
    }
    
}
