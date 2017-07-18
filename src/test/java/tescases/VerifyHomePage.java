package tescases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage;

public class VerifyHomePage {

	@Test
	public void testHomePage(){
		WebDriver driver=BrowserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		HomePage home= PageFactory.initElements(driver, HomePage.class);
		String title= home.getApplicationTitle();
		System.out.println("My Application Title is "+title);
		BrowserFactory.closeBrowser(driver);
	}
}
