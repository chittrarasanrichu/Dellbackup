package com.principalConsultant;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepdefinition {
	WebDriver driver;

	@Given("Navigate to login page")
	public void navigate_to_login_page() {
		driver = WebDriverManager.chromedriver().create();
		driver.navigate().to("https://cpamuat2.azurewebsites.net/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("Use Credential to login")
	public void use_credential_to_login() throws InterruptedException {
		WebElement UserID = driver.findElement(By.cssSelector("input[name='userId']"));
		UserID.sendKeys("00006139" + Keys.ENTER);
		WebElement Password = driver.findElement(By.cssSelector("input[name='password']"));
		Password.sendKeys("C1mB10!!" + Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement StartPlanning = driver.findElement(By.xpath("//span[text()='Start Planning']"));
		StartPlanning.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Dropdown = driver.findElement(By.xpath("//div[text()='All']"));
		Dropdown.click();
		Thread.sleep(3000);
		WebElement Option = driver.findElement(By.xpath("//li[text()='Medium']"));
		Option.click();
		Thread.sleep(3000);
		Assert.assertEquals(Option.getText(), "Medium");
		System.out.println("PASSED");

	}

	@Then("Verify the login page")
	public void verify_the_login_page() {

	}

}
