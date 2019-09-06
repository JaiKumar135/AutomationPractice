package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.helper.FileDataManager;
import com.selenium.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.Reporter;


	
	@RunWith(Cucumber.class)
	
	@CucumberOptions(plugin= {"pretty",
			"json:src\\com\\cucumber\\properties\\com.cucumber.reports.CucumberReports\\report.json",
			"junit:src\\com\\cucumber\\properties\\com.cucumber.reports.CucumberReports\\report2.xml",
			"html:src\\com\\cucumber\\properties\\com.cucumber.reports.CucumberReports\\"},
			features = "src\\test\\java\\com\\cucumber\\feature\\AutomationLogin.feature", glue="com.cucumber.StepDefinition",
			
			dryRun = false , strict = false, monochrome = true
			) 
	

public class TestRunner{
		
		public static WebDriver driver;
		@BeforeClass
		public static void setUpInitialisation() throws Throwable {
			String browserName = FileDataManager.fdm.getConfigReader().getBrowserName();
			driver = BaseClass.getBrowserProperty(browserName);

		}
		@AfterClass
		public static void tearDown() {
			
			driver.quit();

		}
		
	}