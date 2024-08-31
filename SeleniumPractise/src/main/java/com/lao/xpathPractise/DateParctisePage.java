package com.lao.xpathPractise;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class DateParctisePage {
	public static WebDriver driver;
	public static String OpDate;
	@FindBy(xpath="//input[contains(@id,'inp_val')]")
	WebElement FirstCrush;
	@FindBy(xpath="//input[contains(@name,'the_date')]")
	WebElement  date;

	
	
public void LaunchXpath() {
		
		FirstCrush.sendKeys("akshay");
		date.sendKeys("11-04-1997");
		OpDate=driver.findElement(By.xpath("//label[contains(.,'Password')]")).getText();
		//OpDate = FirstCrush.getText();
		System.out.println("ABCD"+OpDate);
		
		
		
	}
}
