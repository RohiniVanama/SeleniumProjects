package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CommonUtils {
	
	
	
	public static String getGlobalValue(String key) {		
		Properties prop = new Properties();
		
		String dir = System.getProperty("user.dir");
		dir = dir + "\\src\\test\\java\\environmentvariables\\Config.properties";
		
		try {
			FileInputStream fs = new FileInputStream(dir);
					prop.load(fs);			
				}
				catch (FileNotFoundException e) {e.printStackTrace();}
				catch (IOException e) {e.printStackTrace();
				}
		  return prop.getProperty(key);		
		}
	
	public static  String driverpath() {
		String path2 ="";
		if(getGlobalValue("browser").equalsIgnoreCase("Chrome")){
		path2 =getGlobalValue("ChromeDriverPath");}
		
		else if(getGlobalValue("browser").equalsIgnoreCase("edge")){
			path2 =getGlobalValue("firefoxDriverPath");}
		else if(getGlobalValue("browser").equalsIgnoreCase("firefox")){
			path2 =getGlobalValue("edgeDriverPath");}
		
		String dir = System.getProperty("user.dir");
		dir = dir + path2;
		
		System.out.println("text is"+dir+"text");
		return dir;
		
		

		
	}

}
