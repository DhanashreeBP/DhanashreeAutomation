package com.myrestructure.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myrestructure.dataprovider.DataProviders;
import com.myrestructure.base.BaseClass;
import com.myrestructure.pageobjects.DashboardPage;
import com.myrestructure.pageobjects.LoginPage;



public class LoginPageTest extends BaseClass {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
}
	
	@Test(dataProvider="credentials", dataProviderClass = DataProviders.class)
	public void loginTest(String uname, String pswd) throws Throwable {
		LoginPage loginPage = new LoginPage();
		dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		dashboardPage=loginPage.login(uname,pswd);
		String actualURL=dashboardPage.getCurrURL();
		String expectedURL="http://elliotsystems.in/";
		Assert.assertEquals(actualURL, expectedURL);
		Thread.sleep(3000);
	}

	
} 

