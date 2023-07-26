package com.myrestructure.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myrestructure.base.BaseClass;
import com.myrestructure.pageobjects.DashboardPage;
import com.myrestructure.pageobjects.GaugeViewPage;
import com.myrestructure.pageobjects.LoginPage;



public class GaugeViewPageTest extends BaseClass {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	GaugeViewPage gaugeviewPage;

	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	} 
	
	
	@Test
	public void verifygaugeviewTest() throws Throwable {
	    loginPage= new LoginPage();
		dashboardPage = new DashboardPage();
		gaugeviewPage= new GaugeViewPage();
		dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		Thread.sleep(3000);
		gaugeviewPage=dashboardPage.clickOnGaugeView();
		
		boolean result=gaugeviewPage.validateRealTimeViewName();
		Assert.assertTrue(result);
		Thread.sleep(3000);
	
	}

}
