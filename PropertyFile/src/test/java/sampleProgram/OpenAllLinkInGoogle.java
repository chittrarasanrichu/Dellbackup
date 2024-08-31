package sampleProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAllLinkInGoogle {
	WebDriver driver;
	@BeforeTest
	
	public void base() {
		
		
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.get("https://www.flipkart.com/");
			 WebElement close = driver.findElement(By.className("_30XB9F"));
			 close.click();
			 List <WebElement> link = driver.findElements(By.tagName("a"));
			 System.out.println("Size of the link "+link.size());
			 for(WebElement link_1: link) {
				 System.out.println(link_1.getAttribute("href")); 
				 System.out.println(link_1.getText()); 
				 
				 
			 }
	}	
	
	
}	
		
		
	

	

