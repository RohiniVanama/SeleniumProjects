package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
	@CucumberOptions(features = "src/test/resources/features",
			glue= {"com.stepDefinitions","com.hooks"},
					plugin= {"pretty","html:target/cucumber-reports"},
			monochrome=true,
			publish=true, tags ="@Smoke")
	
	public class Home_SignInPageRunner extends AbstractTestNGCucumberTests {

	
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
	
	

}
