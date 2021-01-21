package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.PG_IkmanHomePage;
import ObjectRepository.PG_IkmanLoginPage;

public class tc_Login {
	
	@Test
	public void bc_Login()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/sithija/Documents/Proffessional/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ikman.lk/");
		PG_IkmanLoginPage IHP = new PG_IkmanLoginPage(driver);
		driver.manage().window().maximize();
		
		IHP.lbl_Login().click();
		IHP.tf_UserName().sendKeys("sithija1990@gmail.com");
		IHP.tf_Password().sendKeys("S@v$2020");
		IHP.btn_Login().click();
		
		PG_IkmanHomePage IHLP =new PG_IkmanHomePage(driver);
		
		IHLP.lbl_Header().click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.close();
	
	}

}
