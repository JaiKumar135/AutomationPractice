package com.selenium.pom;

import javax.xml.xpath.XPath;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver ldriver) {
			this.driver = ldriver;
			PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement helloSignIn;
	
	
	
	public WebElement getHelloSignIn() {
		return helloSignIn;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	
	@FindBy(xpath="//a[text()='Amazon Pay']")
	private WebElement amazonPay;
	
	public WebElement getAmazonPay() {
		return amazonPay;

	}
	@FindBy(xpath="(//span[text()='Sign in'])[2]")
	private WebElement signInBtn;

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public void setSignInBtn(WebElement signInBtn) {
		this.signInBtn = signInBtn;
	}
	
	@FindBy(xpath="//*[@id=\"header_logo\"]/a/img")
	private WebElement logo;
	
	public WebElement getLogo() {
		return logo;
	}

	public void setLogo(WebElement logo) {
		this.logo = logo;
	}

	public WebElement getMainLogo() {
		return mainLogo;
	}

	public void setMainLogo(WebElement mainLogo) {
		this.mainLogo = mainLogo;
	}
	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div/div/a/img")
	private WebElement mainLogo;
	
	
	}
