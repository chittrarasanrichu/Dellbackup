package com.lao.launchPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lao.xpathPractise.DateParctisePage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DateEntryTest extends DateParctisePage {
	@BeforeTest
	
	public void Base(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		
	}
@Test
	public void LoginTest() {
		
		DateParctisePage sc = PageFactory.initElements(driver, DateParctisePage.class);
		sc.LaunchXpath();
		
		Assert.assertEquals(OpDate, "Password");
		
}
	
}
