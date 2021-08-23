package com.opensource.admin;

import javax.swing.UIClientPropertyKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.opensource.base.Base;

public class AdminPage extends Base{

	public AdminPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	By imgHeaderOrange = By.xpath("//img[@alt='OrangeHRM']");
	By lnkAdmin = By.xpath("//a[@id='menu_admin_viewAdminModule']");
	By txtSearchUserName = By.xpath("//input[@id=\"searchSystemUser_userName\"]");
	By btnSearch = By.xpath("//input[@id='searchBtn']");
	By tblUserName = By.xpath("//tbody/tr[1]/td[2]");
	
	
	//Methods
	
		/*
		 * Login OrangeHRM
		 * @author adriana.elias
		 * @date 08142021
		 */
	
	
	public void validateLogged() {
		reporter("Validate that you have logged in successfully");
		waitForElementPresent(imgHeaderOrange);
	}
	
	
	public void clickAdmin() {
		reporter("Click Admin - Go to the admin page");
		click(lnkAdmin);
		implicitlyWait();
		takeScreenshot("Click Admin");
	}
	
	
	public void searchUser(String username) {
		reporter("Searching" + username);
		type(txtSearchUserName, username);
		click(btnSearch);
		implicitlyWait();
		takeScreenshot("SearchUser");
	}
	
	
	public void validateUsernameTable(String username) {
		reporter("Verify this value..." + username + "in Admin user Table");
		SoftAssert validTable = softAssertEquals(getText(tblUserName), username);
		//assertEquals(getText(tblUserName), username);
		validTable.assertAll();
		takeScreenshot("Validate User");
	}
	
	
	/*
	 * Verify User Exists in table after click search
	 * @params (Wrapper)
	 */
	
	public void verifyUserExistsTableAfterClickSearch(String username) {
		clickAdmin();
		searchUser(username);
		validateUsernameTable(username);
		
	}

	

}
