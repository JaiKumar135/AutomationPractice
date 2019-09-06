package com.cucumber.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.helper.PageObjectManager;
import com.selenium.baseclass.BaseClass;
import com.selenium.pom.HomePage;
import com.selenium.pom.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.bind.annotation.DefaultMethod;

public class StepDefinition extends BaseClass {

	public static WebDriver driver;
	
	

@Given("^User hit the Automation practice website$")
public void user_hit_the_Automation_practice_website() throws Throwable {
	
	driver = getBrowserProperty("chrome");
	specifiedURL("http://automationpractice.com/index.php?");
	System.out.println("Given Tag printed");
    
    throw new PendingException();
}

@When("^User click on Signin button in Header$")
public void user_click_on_Signin_button_in_Header() throws Throwable {
	
	WebElement signInBtn = PageObjectManager.Lp.getContinueBtn();
	clickOnWebElement(signInBtn);
    
    throw new PendingException();
}

@When("^User enter the email id 'jaisampathkumar(\\d+)@gmail\\.com' in the login page$")
public void user_enter_the_email_id_jaisampathkumar_gmail_com_in_the_login_page(String arg1) throws Throwable {
	
	WebElement userNameField = PageObjectManager.Lp.getUserNameField();
	inputValuesToWebElement(userNameField, arg1);
    
    throw new PendingException();
}

@When("^User enter the Password 'jaikumar' in the login page$")
public void user_enter_the_Password_jaikumar_in_the_login_page() throws Throwable {
	
	WebElement passwordField = PageObjectManager.Lp.getPasswordField();
	inputValuesToWebElement(passwordField, "jaikumar");
    
    throw new PendingException();
}

@Then("^User verifies the email id entered$")
public void user_verifies_the_email_id_entered() throws Throwable {
	
	WebElement userNameField = PageObjectManager.Lp.getUserNameField();
	Assert.assertTrue(userNameField.getAttribute("value"), true);
	highlightWebelement(userNameField);
    
    throw new PendingException();
}

@Then("^User verifies the password entered$")
public void user_verifies_the_password_entered() throws Throwable {
	
	String passwordField = PageObjectManager.Lp.getPasswordField().getAttribute("value");
	Assert.assertTrue(passwordField.endsWith("r"));
    
    throw new PendingException();
}

@Then("^User click on Login Button in the Login Page$")
public void user_click_on_Login_Button_in_the_Login_Page() throws Throwable {
	
	WebElement submitBtn = PageObjectManager.Lp.getSubmitBtn();
	clickOnWebElement(submitBtn);
    
    throw new PendingException();
}

@Then("^User verifies Login Button clicked in Login Page$")
public void user_verifies_Login_Button_clicked_in_Login_Page() throws Throwable {
	
	WebElement submitBtn = PageObjectManager.Lp.getSubmitBtn();
	Assert.assertTrue(submitBtn.isSelected());
    
    throw new PendingException();
}

@Then("^User verifies the Username 'jaikumar' present in the header of main Page$")
public void user_verifies_the_Username_jaikumar_present_in_the_header_of_main_Page(String arg2) throws Throwable {
	
	WebElement loggedInUserName = PageObjectManager.Lp.getLoggedInUserName();
	Assert.assertTrue(loggedInUserName.equals(arg2));
    
    throw new PendingException();
}


}

