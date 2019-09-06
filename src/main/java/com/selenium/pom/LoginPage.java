package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
			this.driver = ldriver;
			PageFactory.initElements(driver, this);
	}

	public WebElement getUserNameField() {
		return userNameField;
	}

	public void setUserNameField(WebElement userNameField) {
		this.userNameField = userNameField;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public void setContinueBtn(WebElement continueBtn) {
		this.continueBtn = continueBtn;
	}

	@FindBy(xpath="//input[@type='email']")
	private WebElement userNameField;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement submitBtn;
	
	public WebElement getNameinHeader() {
		return NameinHeader;
	}

	public void setNameinHeader(WebElement nameinHeader) {
		NameinHeader = nameinHeader;
	}

	@FindBy(xpath="//div[@dir='ltr']")
	private WebElement NameinHeader;
	
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement signOutBtn;
	
	public WebElement getPrintedDress1() {
		return PrintedDress1;
	}

	public void setPrintedDress1(WebElement printedDress1) {
		PrintedDress1 = printedDress1;
	}

	@FindBy(xpath="(//img[@title='Printed Dress'])[1]")
	private WebElement PrintedDress1;
	
	public WebElement getDressesPageTitle() {
		return DressesPageTitle;
	}

	public void setDressesPageTitle(WebElement dressesPageTitle) {
		DressesPageTitle = dressesPageTitle;
	}

	@FindBy(xpath="//span[@class='lighter']")
	private WebElement DressesPageTitle;
	
	@FindBy(xpath="(//a[@id='color_31'])[1]")
	private WebElement summerDresses1;
	
	@FindBy(xpath="(//span[text()='Add to cart'])[2]")
	private WebElement printedDress;
	
	public WebElement getPrintedDress() {
		return printedDress;
	}

	public void setPrintedDress(WebElement printedDress) {
		this.printedDress = printedDress;
	}

	public WebElement getSearchSubmitBtn() {
		return searchSubmitBtn;
	}

	public void setSearchSubmitBtn(WebElement searchSubmitBtn) {
		this.searchSubmitBtn = searchSubmitBtn;
	}

	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchSubmitBtn;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchBar;
	
	public WebElement getSearchBar() {
		return searchBar;
	}

	public void setSearchBar(WebElement searchBar) {
		this.searchBar = searchBar;
	}

	public WebElement getLoggedInUserName() {
		return loggedInUserName;
	}

	public void setLoggedInUserName(WebElement loggedInUserName) {
		this.loggedInUserName = loggedInUserName;
	}

	@FindBy(xpath="//a[@title='View my customer account']//span")
	private WebElement loggedInUserName;
	
	public WebElement getSummerDresses1() {
		return summerDresses1;
	}

	public void setSummerDresses1(WebElement summerDresses1) {
		this.summerDresses1 = summerDresses1;
	}

	public WebElement getElementBtnCart1() {
		return elementBtnCart1;
	}

	public void setElementBtnCart1(WebElement elementBtnCart1) {
		this.elementBtnCart1 = elementBtnCart1;
	}

	@FindBy(xpath="(//a[@title='Add to cart'])[2]")
	private WebElement elementBtnCart1;
	
	@FindBy(xpath="(//a[@title='Women'])[1]")
	private WebElement Women;
	
	public WebElement getProductTotal() {
		return productTotal;
	}

	public void setProductTotal(WebElement productTotal) {
		this.productTotal = productTotal;
	}

	@FindBy(xpath="(//span[@class='price'])[1]")
	private WebElement productTotal;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[1]")
	private WebElement proceedToCheckOutBtn1;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement proceedToCheckOutBtn3;
	
	public WebElement getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(WebElement totalAmount) {
		this.totalAmount = totalAmount;
	}

	@FindBy(xpath="(//span[@id='total_price'])[1]")
	private WebElement totalAmount;
	
	public WebElement getPayByBankWire() {
		return payByBankWire;
	}

	public void setPayByBankWire(WebElement payByBankWire) {
		this.payByBankWire = payByBankWire;
	}

	@FindBy(xpath="//span[text()='(order processing will be longer)']")
	private WebElement payByBankWire;
	
	public WebElement getTermsAndConditionsBtn() {
		return termsAndConditionsBtn;
	}

	public void setTermsAndConditionsBtn(WebElement termsAndConditionsBtn) {
		this.termsAndConditionsBtn = termsAndConditionsBtn;
	}

	@FindBy(xpath="//input[@id='cgv']")
	private WebElement termsAndConditionsBtn;
	
	public WebElement getProceedToCheckOutBtn3() {
		return proceedToCheckOutBtn3;
	}
	
	public WebElement getConfirmMyOrderBtn() {
		return confirmMyOrderBtn;
	}

	public void setConfirmMyOrderBtn(WebElement confirmMyOrderBtn) {
		this.confirmMyOrderBtn = confirmMyOrderBtn;
	}

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmMyOrderBtn;

	public WebElement getConfirmationText() {
		return ConfirmationText;
	}

	public void setConfirmationText(WebElement confirmationText) {
		ConfirmationText = confirmationText;
	}

	@FindBy(xpath="//strong[text()='Your order on My Store is complete.']")
	private WebElement ConfirmationText;
	
	public void setProceedToCheckOutBtn3(WebElement proceedToCheckOutBtn3) {
		this.proceedToCheckOutBtn3 = proceedToCheckOutBtn3;
	}
	

	public WebElement getProceedToCheckOutBtn2() {
		return proceedToCheckOutBtn2;
	}

	public void setProceedToCheckOutBtn2(WebElement proceedToCheckOutBtn2) {
		this.proceedToCheckOutBtn2 = proceedToCheckOutBtn2;
	}

	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceedToCheckOutBtn2;
	
	@FindBy(xpath="//li[text()='No 13 thirumangalam road villivakkam ']")
	private WebElement DeliveryAddress;
	
	public WebElement getDeliveryAddress() {
		return DeliveryAddress;
	}

	public void setDeliveryAddress(WebElement deliveryAddress) {
		DeliveryAddress = deliveryAddress;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public void setBillingAddress(WebElement billingAddress) {
		BillingAddress = billingAddress;
	}

	@FindBy(xpath="(//li[text()='No 13 thirumangalam road villivakkam '])[2]")
	private WebElement BillingAddress;
	
	public WebElement getProceedToCheckOutBtn1() {
		return proceedToCheckOutBtn1;
	}

	public void setProceedToCheckOutBtn1(WebElement proceedToCheckOutBtn1) {
		this.proceedToCheckOutBtn1 = proceedToCheckOutBtn1;
	}

	public WebElement getWomen() {
		return Women;
	}

	public void setWomen(WebElement women) {
		Women = women;
	}

	public WebElement getSignOutBtn() {
		return signOutBtn;
	}

	public void setSignOutBtn(WebElement signOutBtn) {
		this.signOutBtn = signOutBtn;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(WebElement passwordField) {
		this.passwordField = passwordField;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}


	
	}



	
