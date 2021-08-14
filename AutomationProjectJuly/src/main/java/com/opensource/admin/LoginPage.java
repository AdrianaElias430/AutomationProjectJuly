package com.opensource.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.Base;

public class LoginPage extends Base{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	//Objects (declaracion de objetos)
	
	By txtUsername = By.xpath("//input[@id='txtUsername']");
	By txtPassword = By.xpath("//input[@id='txtPassword']");
	By btnLogin = By.xpath("//input[@id='btnLogin']");
	By lnkWelcome = By.xpath("//a[@id='welcome']");
	By lnkLogout = By.xpath("//a[contains(text(), 'Logout')]");
	
 
	
	//Methods
	
	/*
	 * Login OrangeHRM
	 * @author adriana.elias
	 * @date 08142021
	 */
	
	public void loginOrange(String username, String password) {
		reporter("Enter Username and Password");
		type(txtUsername, username);
		type(txtPassword, password);
		click(btnLogin);
		implicitlyWait();
	}
	
	
	public void logoutOrange() {
		reporter("Log out");
		click(lnkWelcome);
		click(lnkLogout);
		implicitlyWait();
		closeBrowser();
		
	}
	
}
