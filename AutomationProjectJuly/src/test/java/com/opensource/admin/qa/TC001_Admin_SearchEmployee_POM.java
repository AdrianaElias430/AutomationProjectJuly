package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.admin.AdminPage;
import com.opensource.base.Base;
import com.opensource.base.GlobalVariables;
import com.opensource.main.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC001_Admin_SearchEmployee_POM {
	
	//Aqui creamos los objetos Estan fuera de los metodos y significa que seran usados en todas lados, instanciamos los objetos
	//paginas con las cuales va interactuar
	WebDriver driver;
	Base base;
	LoginPage login;
	AdminPage admin;
	String username, password;
	
 //Aqui seteamos los objetos y les damos valor y pueden convivir en toda la clase en general
  @BeforeTest
  public void beforeTest() {
	  base = new Base(driver);
	  driver = base.chromeDriver(); //driver general que traera todos nuestros objetos
	  login = new LoginPage(driver);
	  admin = new AdminPage(driver);
  
  
  		//Test Date with json file
  		//this.username = base.getJSONValue(this.getClass().getSimpleName(), "username");
  		//this.password = base.getJSONValue(this.getClass().getSimpleName(), "password");
	  
	  
	  //Test Data with xlsx.file
	  this.username = base.getCellData(this.getClass().getSimpleName(), 1, 0);
	  this.password = base.getCellData(this.getClass().getSimpleName(), 1, 1);
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
