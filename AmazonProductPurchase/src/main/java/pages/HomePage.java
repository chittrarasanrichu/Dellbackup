package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	public static WebElement Login;
	@FindBy(xpath="//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	public static WebElement Username1;
	@FindBy(xpath = "//input[@id='ap_password']")
	 public static WebElement Password1;
}
