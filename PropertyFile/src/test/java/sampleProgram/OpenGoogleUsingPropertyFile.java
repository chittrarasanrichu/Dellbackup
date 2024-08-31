package sampleProgram;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleUsingPropertyFile {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream Stream = new FileInputStream("file.properties");
		Properties properties = new Properties();
		properties.load(Stream);
		
		String link_1 = properties.getProperty("link");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(link_1);
		//WebElement searchbox  = driver.findElement(By.id("input"));
		WebElement searchbox = driver.switchTo().activeElement();
		String filpkart_link = properties.getProperty("filpkart");
		searchbox.sendKeys(filpkart_link+Keys.ENTER);
		WebElement close = driver.findElement(By.xpath("//h3[contains(.,'Online Shopping Site for Mobiles, Electronics, Furniture ...')]"));
		Assert.assertTrue(close.isDisplayed());
		
		

	}

}
