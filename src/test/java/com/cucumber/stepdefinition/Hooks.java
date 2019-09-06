package com.cucumber.stepdefinition;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.model.ScreenCapture;
import com.selenium.baseclass.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.Reporter;

public class Hooks {
	
	@Before
	public void userHit() {
		System.out.println("Before each scenario Hooks done");

	}
	@After
	public void pageQuit(cucumber.api.Scenario testcase) throws Exception {
		
		System.out.println("After Hooks");
		
		testcase.getStatus();
		if (testcase.isFailed()) {
			File screenshot = BaseClass.screenShotTakingOnWebPage(testcase.getName());
			
		}
		
			BaseClass.driverQuitMethod();
	}
}
