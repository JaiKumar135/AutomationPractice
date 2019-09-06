package com.selenium.baseclass;

import java.awt.List;
import java.beans.Statement;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.implementation.bytecode.Throw;

public class BaseClass {
	
			public static WebDriver driver;
			
			public static WebDriver getBrowserProperty(String browserName) throws Exception {
				try {
					if (browserName.equalsIgnoreCase("chrome")) {
						System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe"); 					
						driver = new ChromeDriver();
						
						}else if (browserName.equalsIgnoreCase("IE")) {
						System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe");
						driver = new InternetExplorerDriver();
						
						}
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					return driver;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
				

			}
			public static void highlightWebelement(WebElement element) {
				try {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].SetAttribute('style','background:yellow;border:2px solid red;');", element);
				} catch (Exception e) {
					
					e.printStackTrace();
				}

			}
			
			public static void specifiedURL(String uRL) throws Exception {
				try {
					driver.get(uRL);
				} catch (Exception e) {
					
					e.printStackTrace();
					throw new Exception("Mismatch occured");
				}
	
		
			}
			
			public static String getCurrentUrlMethod() throws Exception {
				try {
					String ActiveUrl = driver.getCurrentUrl();
					return ActiveUrl;
				} catch (Exception e) {
					
					e.printStackTrace();
					throw new Exception("value not matching with correct URL ");
				}
				

			}
			public static String getTitleMethod() throws Exception {
				try {
					 String title = driver.getTitle();
					 return title;
				} catch (Exception e) {
					
					e.printStackTrace();
					throw new Exception("Link is mentioned wrong");
				}
				

			}
			public static void driverQuitMethod() throws Exception {
				
					try {
						driver.quit();
					} catch (Exception e) {
						
						e.printStackTrace();
						throw new Exception();
						
					}
			}
			public static void navigatepane(String options) throws Exception {
				try {
					if (options.equalsIgnoreCase("refresh")) {
						driver.navigate().refresh();
						
					}
					else if (options.equalsIgnoreCase("forward")) {
						driver.navigate().forward();
						
					}
					else if (options.equalsIgnoreCase("back")) {
						driver.navigate().back();
						
					}
				} catch (Exception e) {

					e.printStackTrace();
					throw new Exception("option invalid");
				}
				

			}
			public static ArrayList<String> getDynamicContentFromWebTable(String header) throws Exception {
				try {
					ArrayList<String> arrayList = new ArrayList<String>();
					WebElement table = driver.findElement(By.tagName("//table"));
					java.util.List<WebElement> trdata = driver.findElements(By.tagName("tr"));
					for (int i = 0; i < trdata.size(); i++) {
						java.util.List<WebElement> thdata = trdata.get(i).findElements(By.tagName("th"));
						for (int j = 0; j < thdata.size(); j++) {
							String text = thdata.get(j).getText();
							if (text.equals(header)) {
								java.util.List<WebElement> tdata = trdata.get(i).findElements(By.tagName("td"));
								for (int k = 0; k < tdata.size(); k++) {
									String tdataContent = tdata.get(k).getText();
									arrayList.add(tdataContent);
									
								}
								
							}
							
						}
						
					}
					return arrayList;
				} catch (Exception e) {	
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
				
				

			}
			public static void switchToWindowHandle(String WindowTitles) throws Exception {
				try {
					Set<String> handles = driver.getWindowHandles();
					for (String newWindow : handles) {
						driver.switchTo().window(newWindow);
						String title = driver.getTitle();
						if (title.equals(WindowTitles)) {
							driver.switchTo().window(newWindow);
							
						}
						
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
				

			}
			public static void driverCloseMethod() throws Exception {
				try {
					driver.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
				

			}
			public static File screenShotTakingOnWebPage(String filename) throws Exception {
				try {
					File destination = new File(System.getProperty("user.dir")+"\\Library\\Screenshot"+filename+".png");
					TakesScreenshot ts = (TakesScreenshot) driver;
					File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(screenshotAs, destination );
					return destination;
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception();
				}
				

				
			}
			public String getTextMethod(WebElement Element) throws Exception {
				try {

					String text = Element.getText();
					return text;
				} catch (Exception e) {
					
					e.printStackTrace();
					throw new Exception();
				}

			}
			public static String getAttributeFromWebElementMethod(WebElement element) throws Exception {
				try {
					waitforElementVisibility(element);
					String text = element.getText();
					return text;
					
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception();
				}
				
				
				
				}
			public static void switchingAndSendKeysToAlert(String value) throws Exception {
				try {
					Alert alert = driver.switchTo().alert();
					alert.sendKeys(value);
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception();
				}

			}
			public void switchingToDefault() throws Exception {
				try {
					driver.switchTo().defaultContent();
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception();
				}
				

			}
			public static void mouseScrollViews(WebElement element) throws Exception {
				
				try {
					waitforElementVisibility(element);
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView();", element);
				} catch (Exception e) {
					
					e.printStackTrace();
					throw new Exception();
				}
				
			

			}
			public void mouseScrollUsingPixels(int width, int height) throws Exception {
				try {
					
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("windows.scrollBy(" + width +","+ height + ")");
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception();
				}
				
				

			}
			public void scrollTillBottomOfPage() throws Exception {
				try {
					
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("windows.scrollTo(0,document.body.scrollHeight)");
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception();
				}
			}
			public static void dragAndDropElements(WebElement source, WebElement target) throws Exception {
				
					try {
						
						Actions ac = new Actions(driver);
						ac.dragAndDrop(source, target).build().perform();
					} catch (Exception e) {
						
						e.printStackTrace();
						throw new Exception();
					}
			}
			public static void doubleClickOnWebElement(WebElement element) throws Exception {
				try {
					waitforElementVisibility(element);
					Actions ac = new Actions(driver);
					ac.doubleClick(element).build().perform();
				} catch (Exception e) {

					e.printStackTrace();
					throw new Exception();
				}
				
				
			}
			public static void rightClickOnWebElement(WebElement element) throws Exception {
				try {
					waitforElementVisibility(element);
					Actions ac = new Actions(driver);
					ac.contextClick(element).build().perform();
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception();
				}

			}
			public static void alertSimpleAccept() throws Exception {
				
				try {
					Alert alert = driver.switchTo().alert();
					alert.accept();
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception();
				}
				

			}
			public void alertDismissal() throws Exception {
				try {
					Alert alert1 = driver.switchTo().alert();
					alert1.dismiss();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}

			}
			public static void waitforElementVisibility(WebElement element) throws Exception {
				try {
					WebDriverWait ws = new WebDriverWait(driver, 60);
					ws.until(ExpectedConditions.visibilityOf(element));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}

			}
			
			public static void selectDropDownValues(WebElement element, String value, String option) throws Exception {
				try {
					//waitforElementVisibility(element);
					Select sc = new Select(element);
					if(option.equalsIgnoreCase("value")) {
						sc.selectByValue(value);

					}else if (option.equalsIgnoreCase("visiblecontent")) {
						sc.selectByVisibleText(value);
						
					}else if (option.equalsIgnoreCase("index")) {
						sc.selectByIndex(Integer.parseInt(value));
						
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception("value mismatch happened");
				}
		}
			public static void clickOnWebElement(WebElement element) throws Exception {
				try {
					waitforElementVisibility(element);
					if (element.isDisplayed()) {
						element.click();
						
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
				
				

			}
			public static void mouseHoverToElement(WebElement element) throws Exception {
				try {
					Actions ac = new Actions(driver);
					ac.moveToElement(element).build().perform();
				} catch (Exception e) {
					
					e.printStackTrace();
					throw new Exception();
				}
			

			}
			public static boolean isSelectedWebElement(WebElement element) throws Exception {
				try {
					boolean selected = element.isSelected();
					return selected;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}

			}
			public static void inputValuesToWebElement(WebElement element, String values) throws Exception {
				try {
					waitforElementVisibility(element);
					if (element.isDisplayed() && element.isEnabled() ) {
						element.clear();
						element.sendKeys(values);
						
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
				

			}
			public static boolean webElementisDisplayed(WebElement element) throws Exception {
				try {
					boolean displayed = element.isDisplayed();
					return displayed;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
				
				
				

			}
			public static boolean webElementisEnabled(WebElement element) throws Exception {
				try {
					boolean enabled = element.isEnabled();
					return enabled;
				} catch (Exception e) {
					
					e.printStackTrace();
					throw new Exception();
				}

			}
			public static void retrievedatafromDataBaseUsingJDBC(String url, String Username, String Password, String query, String ColumName) throws Exception {
				try {
					java.util.List <String> li = new ArrayList<String>();
					Class.forName("com.mysql.jdbc.driver");
					Connection conn = DriverManager.getConnection(url,Username,Password);
					java.sql.Statement createStatement = conn.createStatement();
					ResultSet executeQuery = createStatement.executeQuery(query);
					while (executeQuery.next()) {
						String data = executeQuery.getString(ColumName);
						li.add(data);
						
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
			}

			public static void main(String[] args) throws Exception {
				
				//BaseClass Obj1 = new BaseClass();
				getBrowserProperty("chrome");
				specifiedURL("https://www.amazon.in");
				WebElement Orders = driver.findElement(By.xpath("//span[text()='Orders']"));
				doubleClickOnWebElement(Orders);
				Thread.sleep(2000);
				WebElement CreateAccount = driver.findElement(By.id("createAccountSubmit"));
				doubleClickOnWebElement(CreateAccount);
				Thread.sleep(2000);
				getCurrentUrlMethod();
				
				
				driver.quit();
				
			}
			}
			