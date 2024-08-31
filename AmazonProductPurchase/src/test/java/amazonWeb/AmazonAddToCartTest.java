package amazonWeb;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonAddToCartTest {
	WebDriver driver;

	
		// TODO Auto-generated method stub
		
		@BeforeTest
		public void setUp()
		{
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver, 20); 
		 WebElement Login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='nav-link-accountList']")));
		 Login.click();
		 WebElement Username =driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']"));
		 Username.sendKeys("+91 9095194751"+Keys.ENTER);
		 WebElement Password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		 Password.sendKeys("mea15023@mech"+Keys.ENTER);
		
		 WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		 Search.sendKeys("MI phone"+Keys.ENTER);
		 // Redmi A1
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement RedmiA1 = driver.findElement(By.xpath("//img[contains(@alt,'Redmi A1 (Light Green')]"));
		 RedmiA1.click();
		 String oldWindow =driver.getWindowHandle();
		 Set<String> handle = driver.getWindowHandles();
		 for(String allWindow : handle)
		 {
			 if(!allWindow.equals(oldWindow))
			 {
				 driver.switchTo().window(allWindow);
			 }
		 }
		}
		 @Test
		 public void addToCart()
		 {
		 WebElement AddCart = driver.findElement(By.xpath("//input[@id = 'add-to-cart-button']"));
		 AddCart.click();
		 WebElement ProceedToBuy = driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']"));
		 ProceedToBuy.click();
		 }

	}


