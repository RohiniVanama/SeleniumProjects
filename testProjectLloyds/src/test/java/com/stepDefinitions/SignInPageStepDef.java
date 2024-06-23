package com.stepDefinitions;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.driver.DriverManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pompackage.SignInPagePom;

public class SignInPageStepDef {
	
	WebDriver driver =DriverManager.getDriver();
	SignInPagePom signin = new SignInPagePom();
	String expectedError;
	
	@Then("I login with incorrect {string} and verify if expected {string} is displayed")
	public void i_login_with_incorrect_and_verify_if_expected_is_displayed(String username, String error) {
	    // Write code here that turns the phrase above into concrete actions
	  
		driver.findElement(signin.getUseridlocator()).sendKeys(username);
		driver.findElement(signin.getContinuelocator()).click();
		
		
//		if(username.equals("admin")){
//		 expectedError = "We cannot find an account with that mobile number";
//	}
//		else if (username.equals("1234")){
//			expectedError = "We cannot find an account with that email address";
//		}
		
		
		Assert.assertEquals(driver.findElement(signin.getErrormessagelocator()).getText(),error);

	
}
	
}
