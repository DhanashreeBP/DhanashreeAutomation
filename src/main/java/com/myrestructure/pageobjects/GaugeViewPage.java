package com.myrestructure.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.myrestructure.base.BaseClass;
import com.myrestructure.actiondriver.Action;


public class GaugeViewPage extends BaseClass {
	
	Action action= new Action(); 
	private Select dropdown;
	
	
	
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[1]")
	 WebElement realtimeView;
	
//	@FindBy(xpath="//div[@id=':rr:']")
//	 WebElement graphviewName;
	
	
	
	
	@FindBy(xpath="")
	 WebElement applyFilter;
	
	public GaugeViewPage() {
		  PageFactory.initElements(driver, this);
		 } 


	 public boolean validateRealTimeViewName() throws Throwable {
			return Action.isDisplayed(driver, realtimeView);
		}
	 
//	 public boolean validateGraphViewName() throws Throwable {
//			return Action.isDisplayed(driver, graphviewName);
//		}
	
}

