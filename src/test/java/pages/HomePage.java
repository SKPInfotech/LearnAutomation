package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//a[text()='Sign In']")WebElement signInLink;
	@FindBy(xpath="//a[text()='My Account']")WebElement myAccountInLink;
	@FindBy(xpath="//a[text()='My cart']")WebElement myCartInLink;
	@FindBy(xpath="//a[text()='Checkout']")WebElement checkutInLink;
	
	public void clickonsigninlink(){
		signInLink.click();
	}
	public void myAccountlink(){
		myAccountInLink.click();
	}
	public void myCartInlink(){
		myCartInLink.click();
	}
	public void checkutInlink(){
		checkutInLink.click();
	}
	public String getApplicationTitle(){
		return driver.getTitle();
	}
	
	
}
