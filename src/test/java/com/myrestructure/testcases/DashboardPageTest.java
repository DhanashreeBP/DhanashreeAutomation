package com.myrestructure.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.myrestructure.base.BaseClass;
import com.myrestructure.pageobjects.AllDevicesPage;
import com.myrestructure.pageobjects.DashboardPage;
import com.myrestructure.pageobjects.LoginPage;



public class DashboardPageTest extends BaseClass {
	
	LoginPage loginPage;
	DashboardPage dashboardPage;
    AllDevicesPage alldevicesPage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
} 
	
	@Test
	public void verifyLogo() throws Throwable {
		 loginPage= new LoginPage();
		dashboardPage = new DashboardPage();
		dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		boolean result=dashboardPage.validateLogo();
		Assert.assertTrue(result);
		Thread.sleep(3000);
	}
	
	
	@Test
    public void verifyTitle() throws Exception {
			String actTitle=dashboardPage.getMyElliotTitle();
			Assert.assertEquals(actTitle, "Elliot Systems");
		Thread.sleep(3000);
}
	
	@Test
	public void companyNameTest() throws Throwable {
	    loginPage= new LoginPage();
		dashboardPage = new DashboardPage();
		dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		boolean result=dashboardPage.validateCompanyName();
		Assert.assertTrue(result);
		Thread.sleep(3000);
	}
	
	
//	@Test
//	public void navigationBarTest() throws Throwable {
//	    loginPage= new LoginPage();
//		dashboardPage = new DashboardPage();
//		dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
//		dashboardPage.clickOnNavigationBar();
//		boolean result=dashboardPage.validateMySmartFactory();
//		Assert.assertTrue(result);
//		Thread.sleep(3000);
//	}
	
	
	
	
	
	
	
	@Test
	public void verifylogoutTest() throws Throwable {
	    loginPage= new LoginPage();
	    dashboardPage = new DashboardPage();
		
	    dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		Thread.sleep(3000);
		dashboardPage.clickOnProfileIcon();
		loginPage=dashboardPage.clickOnLogout();
		
		Thread.sleep(3000);
		
		String actualURL=dashboardPage.getCurrURL();
		String expectedURL="http://elliotsystems.in/";
		Assert.assertEquals(actualURL, expectedURL);
		Thread.sleep(3000);
	}
	
	
//	@Test
//	public void verifyDropdownTest() throws Throwable {
//	    loginPage= new LoginPage();
//	    dashboardPage = new DashboardPage();
//		
//	    dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
//		Thread.sleep(3000);
//		
//		    WebElement dropdownElement = driver.findElement(By.id("//div[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf\" and text()=\"EMA\"]"));
//			dropdownElement.click(); 
//			Thread.sleep(3000);
//			WebElement optionElement = driver.findElement(By.xpath("//ul[@role='listbox']//li[contains(text(), '11D HT Panel')]"));
//	        optionElement.click(); 
//			boolean result=alldevicesPage.validateAllDevicesTable();
//			Assert.assertTrue(result);
//			Thread.sleep(3000);
//	}	

}
