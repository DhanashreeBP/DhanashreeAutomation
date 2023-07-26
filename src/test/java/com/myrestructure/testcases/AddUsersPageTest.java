package com.myrestructure.testcases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.myrestructure.dataprovider.DataProviders;
import com.myrestructure.base.BaseClass;
import com.myrestructure.pageobjects.AddUsersPage;
import com.myrestructure.pageobjects.DashboardPage;
import com.myrestructure.pageobjects.LoginPage;

public class AddUsersPageTest  extends BaseClass {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AddUsersPage addusersPage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	}

	


	
	
	@Test(dataProvider = "newUserDetailsData",dataProviderClass = DataProviders.class)
	public void createUserTest(HashMap<String,String> hashMapValue) throws Throwable {
	loginPage= new LoginPage();
	dashboardPage = new DashboardPage();
	addusersPage= new AddUsersPage();
	dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	Thread.sleep(3000);
	dashboardPage.clickOnProfileIcon();
	addusersPage=dashboardPage.clickOnSettings();
	Thread.sleep(3000);
	addusersPage.clickOnAddUserBtn();
	
	
	addusersPage.createUser(hashMapValue.get("FirstName"), hashMapValue.get("LastName"), hashMapValue.get("EmailId"), hashMapValue.get("PhoneNumber"), hashMapValue.get("Password"));
		addusersPage.clickOnSaveBtn();	
		
//		addusersPage.validateConfirmMessage();
		
	}

 

}
