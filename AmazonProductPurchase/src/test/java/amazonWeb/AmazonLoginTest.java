package amazonWeb;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPhone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

@Test
public class AmazonLoginTest {
	WebDriver driver;
	
		// TODO Auto-generated method stub
	@BeforeTest
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\WebDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 
	}
	@Test
	public void LoginPage() {
		PageFactory.initElements(driver, HomePage.class);
		HomePage.Login.click();
		HomePage.Username1.sendKeys("+91 9095194751"+Keys.ENTER);
	    HomePage.Password1.sendKeys("mea15023@mech"+Keys.ENTER);		 
	     }
	 
@Test
public void MiPhoneSearch() throws InterruptedException {
	PageFactory.initElements(driver, SearchPhone.class);
	
	SearchPhone.Search.sendKeys("MI phone"+Keys.ENTER);
	SearchPhone.RedmiA1.click();
	
	/*
	 * String oldWindow =driver.getWindowHandle(); Set<String> handle =
	 * driver.getWindowHandles(); for(String allWindow : handle) {
	 * if(!allWindow.equals(oldWindow)) { driver.switchTo().window(allWindow); } }
	 */
	 SearchPhone.AddCart.click();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 SearchPhone.ProceedToBuy.click();
	 AssertJUnit.assertTrue(driver.findElement(By.xpath("//span[contains(.,'Your addresses')]")).isDisplayed());
}
}

