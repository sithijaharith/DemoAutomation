package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PG_IkmanHomePage {
	
	WebDriver driver;

	public PG_IkmanHomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h1[contains(text(),'Log in to ikman')]")
	WebElement lbl_Header;
	
	

	
	
	public WebElement lbl_Header()
	{
		
		return lbl_Header;
		
		
		
	}
	
	
	
}
