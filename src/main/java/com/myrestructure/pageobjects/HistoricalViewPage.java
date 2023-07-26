package com.myrestructure.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.myrestructure.actiondriver.Action;
import com.myrestructure.base.BaseClass;

public class HistoricalViewPage extends BaseClass {
		
		Action action= new Action(); 
		private Select dropdown;
		
//		@FindBy(xpath="//b[contains(text(),'Energy Devices')]")
//		 WebElement energydevicespageName;
		
		
		
		@FindBy(xpath="//th[contains(text(),'Description')]")
		 WebElement descriptionName;
		
		
		@FindBy(xpath="")
		 WebElement applyFilter;
		
		public HistoricalViewPage() {
			  PageFactory.initElements(driver, this);
			 } 
	
	
	
	 public boolean validateDescriptionName() throws Throwable {
			return Action.isDisplayed(driver, descriptionName);
		
}
	 
}
