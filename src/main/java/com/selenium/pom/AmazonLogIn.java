package com.selenium.pom;

import org.openqa.selenium.WebDriver;

import com.selenium.baseclass.BaseClass;

public class AmazonLogIn extends BaseClass {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = getBrowserProperty("chrome");
		specifiedURL("https://www.Amazon.in");
		HomePage Hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		mouseHoverToElement(Hp.getAmazonPay());
		clickOnWebElement(Hp.getAmazonPay());
		Thread.sleep(1000);
		mouseHoverToElement(Hp.getHelloSignIn());
		clickOnWebElement(Hp.getSignInBtn());
		inputValuesToWebElement(lp.getUserNameField(), "jaisampathkumar94@gmail.com");
		clickOnWebElement(lp.getContinueBtn());
		waitforElementVisibility(lp.getPasswordField());
		inputValuesToWebElement(lp.getPasswordField(), "jaikumar147");
		clickOnWebElement(lp.getSubmitBtn());
		Thread.sleep(3000);
		driverQuitMethod();
	}
	

}
