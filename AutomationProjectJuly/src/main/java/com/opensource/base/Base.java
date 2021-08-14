package com.opensource.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Base {
	
	private WebDriver driver;
	
	/*
	 * Constructor
	 * @author adriana.elias
	 * @param
	 * @return
	 * @throws
	 */

	public Base(WebDriver driver) {
		this.driver = driver;
		
	}
	
	/*
	 * Reporter
	 */
	
	
	public void reporter(String log) {
	
	Reporter.log(log); //Este reporte es para TestNG
	
	
	}
	
	/*
	 * Set WebDriver
	 */
	
	public WebDriver chromeDriver() {
		System.setProperty(GlobalVariables.CHROME_DRIVER_KEY,GlobalVariables.CHROME_DRIVER_NAME);
	    driver = new ChromeDriver();
		return driver;
	}
	
	
	/*
	 * implicit Wait
	 */
	
	public void implicitlyWait(int second) {
		try {
			driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
		}catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Implicit Wait (OVERLOADDING)
	 */
	
	public void implicitlyWait() {
		try {
			driver.manage().timeouts().implicitlyWait(GlobalVariables.GENERAL_IMPLICITLY_TIMEOUT, TimeUnit.SECONDS);
		}catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Wait for element present(sycn)
	 */
	
	public void waitForElementPresent (By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, GlobalVariables.GENERAL_TIMEOUT);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Wait for element present(sycn) (overloading)
	 */
	
	public void waitForElementPresent (By locator, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Launch Browser
	 */
	
	
	public void launchBrowser(String url) {
		reporter("Launch Brower... " + url);
		driver.get(url);
		driver.manage().window().maximize();
		implicitlyWait();
	}
	
	/*
	 * Type
	 */
	
	public void type(By locator, String inputText) {
		try{
			driver.findElement(locator).sendKeys(inputText);
		}catch(NoSuchElementException e) {		
			e.printStackTrace();
		}
	}
	

	
	/*
	 * Click
	 */
	
	
	public void click(By locator) {
		try{
			driver.findElement(locator).click();
		}catch(NoSuchElementException e) {		
			e.printStackTrace();
		}
	}
	
	
	/*
	 * isDisplayed
	 */
	
	
	public boolean isDisplay(By locator) {
		try{
			return driver.findElement(locator).isDisplayed();
		}catch(NoSuchElementException e) {		
			e.printStackTrace();
			return false;
		}
	}
	
	
	/*
	 * GetText
	 */
	
	
	public String getText(By locator) {
		try{
			return driver.findElement(locator).getText();
		}catch(NoSuchElementException e) {		
			e.printStackTrace();
			return null;
		}
	}
	
	
	/*
	 * Assertion (String)
	 */
	
	
	public void assertEquals(String actualValue, String expectedValue) {
		try{
			 Assert.assertEquals(actualValue, expectedValue);
		}catch(AssertionError e) {
			Assert.fail(e.getMessage() + "Actual value" + actualValue +  "does not macht with Expected Value" + expectedValue);
		}
	}
	
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	
}
