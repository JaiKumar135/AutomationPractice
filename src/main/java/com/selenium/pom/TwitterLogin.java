package com.selenium.pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.selenium.baseclass.BaseClass;

public class TwitterLogin extends BaseClass  {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = getBrowserProperty("chrome");
		
		specifiedURL("https://twitter.com/login");
		
		LoginPage Lp = new LoginPage(driver);
		waitforElementVisibility(Lp.getUserNameField());
		inputValuesToWebElement(Lp.getUserNameField(), "jaisampathkumar94@gmail.com");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		inputValuesToWebElement(Lp.getPasswordField(), "jaikumar147");
		clickOnWebElement(Lp.getContinueBtn());
		Thread.sleep(1000);
		clickOnWebElement(Lp.getSubmitBtn());
		
		Thread.sleep(3000);
		
		driverQuitMethod();
		
		

		
	}
	
	
}
