package com.myrestructure.testcases;

import java.util.HashMap;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myrestructure.base.BaseClass;
import com.myrestructure.dataprovider.DataProviders;

import com.myrestructure.pageobjects.AddGraphGroupPage;
import com.myrestructure.pageobjects.AddUsersPage;
import com.myrestructure.pageobjects.DashboardPage;
import com.myrestructure.pageobjects.LoginPage;

public class AddGraphGroupPageTest extends BaseClass {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AddUsersPage addusersPage;
	AddGraphGroupPage addgraphgroupPage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit(); 
	} 
	
	
	@Test(dataProvider = "newGraphGroupDetailsData",dataProviderClass = DataProviders.class)
	public void createGraphTest(HashMap<String,String> hashMapValue) throws Throwable {
	loginPage= new LoginPage();
	dashboardPage = new DashboardPage();
	
	addgraphgroupPage = new AddGraphGroupPage();
	dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	Thread.sleep(3000);
	dashboardPage.clickOnProfileIcon();
	addusersPage=dashboardPage.clickOnSettings();
	Thread.sleep(3000);
	addusersPage.clickOnGraphGroup();
	addgraphgroupPage.clickOnAddGraphGroupBtn();
	Thread.sleep(3000);
	

	
	addgraphgroupPage.createGraph(hashMapValue.get("DeviceType"), hashMapValue.get("MeterName"), hashMapValue.get("ParameterName"));
//	Thread.sleep(3000);
//	addgraphgroupPage.clickOnSaveBtn();	
		
//	addgraphgroupPage.validateConfirmMessage();
		
	}
	
 
}
