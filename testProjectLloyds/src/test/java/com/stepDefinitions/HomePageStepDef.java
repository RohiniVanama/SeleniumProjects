package com.stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.driver.DriverManager;
import com.utils.CommonUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.net.http.common.Utils;
import jdk.internal.org.jline.utils.Log;
import pompackage.HomePagePom;

public class HomePageStepDef {
	
	public static Properties prop = new Properties();
	
	WebDriver driver=DriverManager.getDriver();
	HomePagePom home = new HomePagePom();
	
	
    
	
	@When("I launch URL for amazon")
	public void i_load_url_for_amazon() {
		//driver= DriverManager.getDriver();		
		driver.get(CommonUtils.getGlobalValue("url"));		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@Then("I verify the title of page is displayed as expected")
	public void i_verify_the_title_of_page_is_displayed_as_Expected() {
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Then("I calculate total number of links present on the webpage")
	public void i_calculate_total_number_of_links_present_on_the_webpage() {
	   
		int links = (driver.findElements(By.tagName("a"))).size();
		System.out.println("Total number of links are"+links);
	}
	
	@Then("I Verify if default language is English")
	public void i_verify_if_default_language_is_english() {
		Assert.assertEquals(driver.findElement(home.getDefaultlanglocator()).getText(),"EN");	
	    }
	
	@Then("I Verify if SignIn Link is displayed")
	public void i_verify_if_sign_in_link_is_displayed() {
	
		Assert.assertEquals(driver.findElement(home.getSignInSpanLocator()).getText(),"Hello, sign in");
		
	}
	@Then("I Verify the logo text present on homepage is as expected")
	public void i_verify_the_logo_text_present_on_homepage_is_as_expected() {
		Assert.assertEquals(driver.findElement(home.getLogoLocator()).getAttribute("aria-label"),"Amazon.in");
		}
	
	@When("I Click on Signin")
	public void i_click_on_signin() {
		driver.findElement(home.getSignInSpanLocator()).click();
	}
	
	@Then("I login with incorrect userid and verify if error is displayed")
	public void i_login_with_incorrect_userid_and_verify_if_error_is_displayed() {
		
	}

}
