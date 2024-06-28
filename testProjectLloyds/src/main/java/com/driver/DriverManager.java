package com.driver;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.utils.CommonUtils;

public class DriverManager {
	
	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	public  WebDriver driver;
	
	
	public void initiate_driver(String browsername) {
		
		switch (browsername) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver",CommonUtils.driverpath());
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.driver",CommonUtils.driverpath());
			ChromeOptions op = new ChromeOptions();
			op.setAcceptInsecureCerts(true);			
			driver = new ChromeDriver(op);
			dr.set(driver);
			break;
		case "firefox":
		//	System.setProperty("webdriver.gecko.driver",CommonUtils.driverpath());
			driver = new FirefoxDriver();	
			break;
		case "edge":
		//	System.setProperty("webdriver.edge.driver",CommonUtils.driverpath());
			driver = new EdgeDriver();	
			break;	
		
		}}
		
		
	
		public static synchronized WebDriver getDriver(){
			return dr.get();
	}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	