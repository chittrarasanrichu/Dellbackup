package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPhone {
	@FindBy(id="twotabsearchtextbox")
	public static WebElement Search ; 
	
	@FindBy(xpath="//img[contains(@alt,'Redmi A1 (Light Green')]")
	public static WebElement RedmiA1;
	@FindBy(xpath="//input[@id = 'add-to-cart-button']")
	public static WebElement AddCart;
	@FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")
	public static WebElement ProceedToBuy;
	
	
	

}
