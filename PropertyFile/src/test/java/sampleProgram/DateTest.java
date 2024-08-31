package sampleProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateTest {
	public static WebDriver driver;
	public static  void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		
		WebElement date = driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
		date.click();
		
		 
			
				
			  while(true) {
				  String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
					String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
				  
				  String mon = "december";
					String yr = "2023";
					if  (month.equalsIgnoreCase(mon) && year.equalsIgnoreCase(yr))
					{
						break;
					}else 
					{
						
				  WebElement next = driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")); 
			      next.click();
					}
	
			 
			}  
			  WebElement day = driver.findElement(By.xpath("//a[contains(.,\"21\")]"));
			 day.click();
			 
		
		

	}

}

