package com.cucumber.helper;

import org.openqa.selenium.WebDriver;

import com.selenium.pom.HomePage;
import com.selenium.pom.LoginPage;

public class PageObjectManager {
	
	public WebDriver driver;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
		
	}
	public static HomePage Hp;
	public static LoginPage Lp;
	
	public HomePage getHp() {
		
		if (Hp== null) {
			Hp = new HomePage(driver);
			
		}
		
		return Hp;
	}
	public LoginPage getLp() {
		
		if(Lp==null) {
			Lp = new LoginPage(driver);
		}
		return Lp;
	}

}
