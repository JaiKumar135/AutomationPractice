package com.selenium.pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.selenium.baseclass.BaseClass;

public class FacebookLogin extends BaseClass {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = getBrowserProperty("chrome");
		specifiedURL("https://www.facebook.com");
		
		LoginPage Lp = new LoginPage(driver);
		waitforElementVisibility(Lp.getUserNameField());
		inputValuesToWebElement(Lp.getUserNameField(), "coolheartedguy6@yahoo.in");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		inputValuesToWebElement(Lp.getPasswordField(), "ABCDEFGH");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		clickOnWebElement(Lp.getSubmitBtn());
		
		Thread.sleep(3000);
		driverQuitMethod();
	}

}
