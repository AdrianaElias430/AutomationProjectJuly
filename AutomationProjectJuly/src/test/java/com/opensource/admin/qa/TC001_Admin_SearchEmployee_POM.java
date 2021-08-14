package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.admin.AdminPage;
import com.opensource.admin.LoginPage;
import com.opensource.base.Base;
import com.opensource.base.GlobalVariables;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC001_Admin_SearchEmployee_POM {
	
	WebDriver driver;
	Base base;
	LoginPage login;
	AdminPage admin;
	String username, password;
	
 
  @BeforeTest
  public void beforeTest() {
	  base = new Base(driver);
	  driver = base.chromeDriver();
	  login = new LoginPage(driver);
	  admin = new AdminPage(driver);
  
  
  		//Test Date
  		this.username = "Admin";
  		this.password = "admin123";
 }	
  
  @Test
  public void TC001_Admin_SearchEmployee_POM_Script() {
  			//Step 1
  			
  			base.launchBrowser(GlobalVariables.QA_URL);
  			
  			//Step 2
  			
  			login.loginOrange(username, password);
  			
  			
  			//Step 3
  			
  			admin.validateLogged();
  			
  			
  			//Step 4 al 7
  			
  			
  			admin.verifyUserExistsTableAfterClickSearch(username);
  			
  			
  			//Step 8 al 9
  			
  			login.logoutOrange();
  			
  			
  }

  @AfterTest
  public void afterTest() {
  }

}