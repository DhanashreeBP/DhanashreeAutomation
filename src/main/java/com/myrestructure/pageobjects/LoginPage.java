package com.myrestructure.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myrestructure.actiondriver.Action;
import com.myrestructure.base.BaseClass;



public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//*[@placeholder='Email']") 
	 WebElement userName;
	 
	 @FindBy(xpath="//*[@placeholder='Password']") 
	 WebElement password;
	 
	 @FindBy(xpath="//button[contains(text(), 'Log in')]") 
	 WebElement logInBtn;
	 

	 
	 public LoginPage() {
	  PageFactory.initElements(driver, this);
	 }
	 
	 public DashboardPage login (String uname, String pswd)throws Throwable {
		 
		 Action.type(userName, uname);
		 Action.type(password, pswd);
		 Action.click(driver, logInBtn);
		 return new DashboardPage();
	 }
	 


}
