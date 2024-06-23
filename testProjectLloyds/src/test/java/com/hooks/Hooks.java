package com.hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.driver.DriverManager;
import com.utils.CommonUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;


//import jdk.internal.org.jline.utils.Log;

public class Hooks {
	

	private WebDriver driver;

	
	@Before
	public void launchBrowser() {
		
		//Log.info("Launching browser");	
		
		String browsername = CommonUtils.getGlobalValue("browser");
		DriverManager.initiate_driver(browsername);	
		
	}
	
	@After()
	public void tearDown() {
	//	Log.info("Closing driver session");
		driver= DriverManager.getDriver();
		driver.quit();
		
	}
	
	

}
