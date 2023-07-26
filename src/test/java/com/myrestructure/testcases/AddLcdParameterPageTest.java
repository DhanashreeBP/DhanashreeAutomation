package com.myrestructure.testcases;

import java.util.HashMap;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myrestructure.base.BaseClass;
import com.myrestructure.dataprovider.DataProviders;
import com.myrestructure.pageobjects.AddAlertThresholdPage;
import com.myrestructure.pageobjects.AddLcdParameterPage;
import com.myrestructure.pageobjects.AddUsersPage;
import com.myrestructure.pageobjects.DashboardPage;
import com.myrestructure.pageobjects.LoginPage;

public class AddLcdParameterPageTest extends BaseClass {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AddUsersPage addusersPage;
	AddLcdParameterPage addlcdparameterPage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	}  

	
	@Test(dataProvider = "newLcdParameterDetailsData",dataProviderClass = DataProviders.class)
	public void createLcdParameterTest(HashMap<String,String> hashMapValue) throws Throwable {
	loginPage= new LoginPage();
	dashboardPage = new DashboardPage();
	
	addlcdparameterPage = new AddLcdParameterPage();
	dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	Thread.sleep(3000);
	dashboardPage.clickOnProfileIcon();
	addusersPage=dashboardPage.clickOnSettings();
	Thread.sleep(3000);
	addusersPage.clickOnLcdParameter();
	addlcdparameterPage.clickOnAddParameterBtn();
	Thread.sleep(3000);
	
	addlcdparameterPage.createLcdParameter(hashMapValue.get("DeviceType"), hashMapValue.get("ParameterName"));
	Thread.sleep(3000);
//	addlcdparameterPage.clickOnSaveBtn();	
//		
//	addlcdparameterPage.validateConfirmMessage();
		
	}
	
}
