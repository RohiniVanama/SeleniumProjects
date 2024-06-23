package com.driver;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utils.CommonUtils;

public class DriverManager {
	
	//public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	public static WebDriver driver;
	
	
	public static void initiate_driver(String browsername) {
		
		switch (browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",CommonUtils.driverpath());
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",CommonUtils.driverpath());
			driver = new FirefoxDriver();	
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver",CommonUtils.driverpath());
			driver = new EdgeDriver();	
			break;	
		
		}}
		
		
	
		public static synchronized WebDriver getDriver(){
			return driver;
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	