package com.myrestructure.testcases;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.myrestructure.actiondriver.Action;
import com.myrestructure.base.BaseClass;
import com.myrestructure.dataprovider.DataProviders;
import com.myrestructure.pageobjects.AddLcdDiffParameterPage;
import com.myrestructure.pageobjects.AddUsersPage;
import com.myrestructure.pageobjects.DashboardPage;
import com.myrestructure.pageobjects.LoginPage;

public class AddLcdDiffParameterPageTest extends BaseClass {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AddUsersPage addusersPage;
	AddLcdDiffParameterPage addlcddiffparameterPage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	}  

	
	@Test(dataProvider = "newLcdDiffDetailsData",dataProviderClass = DataProviders.class)
	public void createLcdDiffTest(HashMap<String,String> hashMapValue) throws Throwable {
	loginPage= new LoginPage();
	dashboardPage = new DashboardPage();
	
	addlcddiffparameterPage = new AddLcdDiffParameterPage();
	dashboardPage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	Thread.sleep(3000);
	dashboardPage.clickOnProfileIcon();
	addusersPage=dashboardPage.clickOnSettings();
	Thread.sleep(3000);
     WebElement lcdDiff = driver.findElement(By.xpath("//span[contains(text(),'Lcd Diff Parameter')]"));
	
	Action.scrollByVisibilityOfElement(driver, lcdDiff);
	
	addusersPage.clickOnLcdDiffParameter();
	
	WebElement element = driver.findElement(By.xpath("//button[@title='Add Parameter']"));
	
	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	
	 WebDriverWait wait = new WebDriverWait(driver, 10);
	 
     wait.until(ExpectedConditions.elementToBeClickable(element));
     
	element.sendKeys(Keys.ARROW_UP);

	Thread.sleep(3000);
	
	
	addlcddiffparameterPage.clickOnAddParameterBtn();
	Thread.sleep(3000);
	
	addlcddiffparameterPage.createLcdDiff(hashMapValue.get("DeviceType"), hashMapValue.get("ParameterName"));
	Thread.sleep(3000);
//	addlcddiffparameterPage.clickOnSaveBtn();	
//		
//	addlcddiffparameterPage.validateConfirmMessage();
		
	}
	 
	
	

}
