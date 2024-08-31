package com.naukri.stepdefintion;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naukri.constants.Constants;
import com.naukri.page_object.LoginPage;
import com.naukri.utilties.CommonUtil;
import com.naukri.webdriver_manager.DriverManagerUserDefined;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinition{
	@Given("Navigate to login page")
	public void navigate_to_login_page() throws InterruptedException{
		DriverManagerUserDefined.getDriver().navigate().to(Constants.APP_URL);
		System.out.println("Navigate to login page");	
	}

	@When("Use credential to login the naukri page")
	public void use_credential_to_login_the_naukri_page() throws InterruptedException{
		PageFactory.initElements(DriverManagerUserDefined.getDriver(), LoginPage.class);
		Thread.sleep(2000);
		LoginPage.LoginButton.click();
		Thread.sleep(2000);
		LoginPage.UserName.sendKeys(Constants.UserName);
		LoginPage.Password.sendKeys(Constants.Password);
		LoginPage.SubmitButton.click();
		System.out.println("Use credential to login the naukri page");	
	}

	@Then("Validate the login Page")
	public void validate_the_login_page() {
		
		Assert.assertEquals(LoginPage.logo, LoginPage.logo);
		System.out.println("Validate the login Page");
	}


}
