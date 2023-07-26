package com.myrestructure.testcases;

import java.util.HashMap;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myrestructure.base.BaseClass;
import com.myrestructure.pageobjects.AddAlertThresholdPage;
import com.myrestructure.pageobjects.AddUsersPage;
import com.myrestructure.dataprovider.DataProviders;
import com.myrestructure.pageobjects.DashboardPage;
import com.myrestructure.pageobjects.LoginPage;

public class AddAlertThresholdPageTest extends BaseClass {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AddUsersPage addusersPage;
	AddAlertThresholdPage addalertthresholdPage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	} 

	
	@Test(dataProvider = "newThresholdDetailsData",dataProviderClass = DataProviders.class)
	public void createThresholdTest(HashMap<String,String> hashMapValue) throws Throwable {
	loginPage= new LoginPage();
	dashboardPage = new DashboardPage();
	
	addalertthresholdPage = new AddAlertThresholdPage();
	dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	Thread.sleep(3000);
	dashboardPage.clickOnProfileIcon();
	addusersPage=dashboardPage.clickOnSettings();
	Thread.sleep(3000);
	addusersPage.clickOnAlerts();
	addalertthresholdPage.clickOnAddAlertThresholdBtn();
	Thread.sleep(3000);
	
	addalertthresholdPage.createThreshold(hashMapValue.get("DeviceType"), hashMapValue.get("MeterName"), hashMapValue.get("ParameterName"));
	Thread.sleep(3000);
//	addalertthresholdPage.clickOnSaveBtn();	
//		
//	addalertthresholdPage.validateConfirmMessage();
		
	}
	
	 

}
