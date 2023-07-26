package com.myrestructure.testcases;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.myrestructure.dataprovider.DataProviders;
import com.myrestructure.base.BaseClass;
import com.myrestructure.pageobjects.AddGroupPage;
import com.myrestructure.pageobjects.AddUsersPage;
import com.myrestructure.pageobjects.DashboardPage;
import com.myrestructure.pageobjects.LoginPage;

public class AddGroupPageTest extends BaseClass {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AddGroupPage addgroupPage;
	AddUsersPage addusersPage;
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	}  
	
	
	
	@Test(dataProvider = "newGroupDetailsData",dataProviderClass = DataProviders.class)
	public void addGroupTest(HashMap<String,String> hashMapValue) throws Throwable {
	loginPage= new LoginPage();
	dashboardPage = new DashboardPage();
	addgroupPage= new AddGroupPage();
	dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	Thread.sleep(3000);
	dashboardPage.clickOnProfileIcon();
	addusersPage=dashboardPage.clickOnSettings();
	Thread.sleep(3000);
	addgroupPage=addusersPage.clickOnGroups();
	Thread.sleep(3000);
	addgroupPage.clickOnAddGroupsBtn();
	
	addgroupPage.createGroup(hashMapValue.get("DeviceType"), hashMapValue.get("MeterName"));
	
//	addgroupPage.clickOnSaveBtn();	
//		
//	addgroupPage.validateConfirmMessage();
		
	}
	

}
