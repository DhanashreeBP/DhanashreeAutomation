package com.myrestructure.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myrestructure.base.BaseClass;

import com.myrestructure.actiondriver.Action;


public class AddUsersPage extends BaseClass {
	
	Action action= new Action();
	
	@FindBy(xpath="//span[contains(text(),'Users')]")
	 WebElement userspageName;

	 @FindBy(xpath="//button[contains(text(),'Add User')]")
	 WebElement addUserBtn;
	 
//	 @FindBy(xpath="//h5[contains(text(),'Register User')]")
//	 WebElement formTitle;
	 
	 @FindBy(xpath="//input[@id='firstname']")
	 WebElement firstName;
     
	 @FindBy(xpath="//input[@id='lastname']")
	 WebElement lastName;
     
	 @FindBy(xpath="//input[@id='email']")
	 WebElement emailId;
     
	 @FindBy(xpath="//input[@id='phonenumber']")
	 WebElement phoneNumber;
     
	 @FindBy(xpath="//input[@id='password']")
	 WebElement password;
	
	 @FindBy(xpath="//button[contains(text(), 'Save')]")
	 WebElement saveBtn;
	 
	 
	 @FindBy(xpath="//span[contains(text(),'Alerts')]")
	 WebElement alerts;
	 
	 @FindBy(xpath="//span[contains(text(),'Groups')]")
	 WebElement groups;
	 
	 @FindBy(xpath="//span[contains(text(),'Graph Group')]")
	 WebElement graphGroup;
	 
	 @FindBy(xpath="//span[contains(text(),'Lcd Parameter')]")
	 WebElement lcdParameter;
	 
	 @FindBy(xpath="//span[contains(text(),'Lcd Diff Parameter')]")
	 WebElement lcdDiff;
	 
	 
	 @FindBy(xpath="//div[contains(text(),'User Added successfully')]")
		private WebElement confirmMessage;
	
	 public AddUsersPage() {
		  PageFactory.initElements(driver, this);
		 }
	 
	   public AddAlertThresholdPage clickOnAlerts() throws Throwable {
			  Action.click(driver, alerts);
	           return new AddAlertThresholdPage();
		}
	   
	   
	   public AddGroupPage clickOnGroups() throws Throwable {
			  Action.click(driver, groups);
	           return new AddGroupPage();
		}
	   
	   
	   
	   public AddGraphGroupPage clickOnGraphGroup() throws Throwable {
			  Action.click(driver, graphGroup);
	           return new AddGraphGroupPage();
		}
	 
	   
	   
	   public AddLcdParameterPage clickOnLcdParameter() throws Throwable {
			  Action.click(driver, lcdParameter);
	           return new AddLcdParameterPage();
		}
	   
	   public AddLcdDiffParameterPage clickOnLcdDiffParameter() throws Throwable {
			  Action.click(driver, lcdDiff);
	           return new AddLcdDiffParameterPage();
		}
	   
	 
	 public boolean validateUsersPageName() throws Throwable {
			return Action.isDisplayed(driver, userspageName);
		}
	
	 public void clickOnAddUserBtn() throws Throwable  {
		 Action.click(driver, addUserBtn);
	 }
	
	 
//	 public boolean validateFormTitle() throws Throwable {
//			return Action.isDisplayed(driver, formTitle);
//}
	 
	 
	 public boolean clickOnSaveBtn() throws Throwable {
    	 return Action.JSClick(driver, saveBtn);
    	
     }
	
	 
//	 public String validateConfirmMessage() {
//			String confirmMsg=confirmMessage.getText();
//			return confirmMsg;
//		}

	 
	 public void createUser(String fName, String lName, 
			 String eId, 
			 String pNumber,
			 String pswd)throws Throwable {
	
	 
	 Action.type(firstName, fName);
	 Action.type(lastName, lName);
	 Action.type(emailId, eId);
//	 Thread.sleep(3000);
	 Action.type(phoneNumber,pNumber);
//	 Action.sendKeysUsingJavaScriptById(driver, "phone_no" , String.valueOf(pNumber));
	 Action.type(password, pswd);
	
} 

}
