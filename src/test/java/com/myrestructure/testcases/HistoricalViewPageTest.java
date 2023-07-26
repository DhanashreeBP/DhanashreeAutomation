package com.myrestructure.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import com.myrestructure.base.BaseClass;
import com.myrestructure.pageobjects.DashboardPage;
import com.myrestructure.pageobjects.HistoricalViewPage;
import com.myrestructure.pageobjects.LoginPage;

public class HistoricalViewPageTest extends BaseClass {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	HistoricalViewPage historicalviewPage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	}  
	
	
	
	@Test
	public void verifyhistoricalviewTest() throws Throwable {
	    loginPage= new LoginPage();
		dashboardPage = new DashboardPage();
		historicalviewPage= new HistoricalViewPage();
		dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		Thread.sleep(3000);
		historicalviewPage=dashboardPage.clickOnHistoricalView();
		
		boolean result=historicalviewPage.validateDescriptionName();
		Assert.assertTrue(result);
		Thread.sleep(3000);
	
	}
	
	
	
	
	
}

