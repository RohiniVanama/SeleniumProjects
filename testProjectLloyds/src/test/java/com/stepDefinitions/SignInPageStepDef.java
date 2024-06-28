package com.stepDefinitions;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driver.DriverManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pompackage.SignInPagePom;

public class SignInPageStepDef {
	
	WebDriver driver =DriverManager.getDriver();
	SignInPagePom signin = new SignInPagePom();
	String expectedError="";
	
	@Then("I login with incorrect {string} and verify if expected {string} is displayed")
	public void i_login_with_incorrect_and_verify_if_expected_is_displayed(String username, String error) throws InterruptedException {
	   
	  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	  Thread.sleep(4000);
		driver.findElement(signin.getUseridlocator()).sendKeys(username);
	
		Thread.sleep(4000);
		driver.findElement(signin.getContinuelocator()).click();
		
		Thread.sleep(4000);
		if(username.equals("admin")){
		 expectedError = driver.findElement(signin.getEmailErrormessagelocator()).getText();
	}
	else if (username.equals("1234")){
		 expectedError = driver.findElement(signin.getPhoneErrormessagelocator()).getText();
		}
		
		Thread.sleep(4000);
		Assert.assertEquals(expectedError,error);

	
}
	
}
