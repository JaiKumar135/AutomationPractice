package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
	
	public Properties pr = new Properties();
	
	public ConfigReader() throws Throwable {
		
		try {
			File propFile = new File(System.getProperty("user.dir")+"\\src\\com\\cucumber\\properties\\Configuration.properties");
			
			FileInputStream fis = new FileInputStream(propFile);
			pr.load(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public String getBrowserName() throws Exception {
		String browser = pr.getProperty("BrowserName");
		if (browser==null) {
			throw new Exception("Enter a valid browser name");
			
		}
		return browser;

	}
	public String getUrl() throws Exception {
		String property = pr.getProperty("Url");
		if (property== null) {
			throw new Exception("Enter a valid URL");
			
		}
		return property;

	}
}
