package com.myrestructure.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myrestructure.actiondriver.Action;
import com.myrestructure.base.BaseClass;

public class AllDevicesPage extends BaseClass {
	
	Action action= new Action(); 
	
	
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/table[1]/div[2]/table[1]")
	
	 WebElement allDevicesTable;
	
	public AllDevicesPage() {
		PageFactory.initElements (driver, this);
	}
	
	
	
	
	
	 public boolean validateAllDevicesTable() throws Throwable {
			return Action.isDisplayed(driver, allDevicesTable);
		}

}
