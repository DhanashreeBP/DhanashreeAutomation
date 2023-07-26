package com.myrestructure.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myrestructure.actiondriver.Action;
import com.myrestructure.base.BaseClass;



public class DashboardPage extends BaseClass {
	
	Action action= new Action(); 
	
	@FindBy(xpath="//img[@id='Elliot-Logo']") 
	 WebElement myElliotLogo;
	
	
	@FindBy(xpath="//span[contains(text(),'Uni Klinger Limited')]")
	 WebElement companyName;
	
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/img[1]")
	 WebElement navigationBar;
	
	@FindBy(xpath="//span[contains(text(),'My smart factory')]") 
	 WebElement mySmartFactory;
	

	@FindBy(xpath="//div[contains(text(),'S')]") 
	 WebElement profileIcon;
	
	@FindBy(xpath="//body/div[@id='basic-menu']/div[3]/ul[1]/li[1]") 
	 WebElement settings;
	
	
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]/div[2]/a[1]/*[1]") 
	 WebElement gaugeView;
	
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]/div[2]/a[2]/*[1]") 
	 WebElement historicalView;
	
	
	@FindBy(xpath="//body/div[@id='basic-menu']/div[3]/ul[1]/li[2]") 
	 WebElement logout;
	
	
	
	public DashboardPage() {
		PageFactory.initElements (driver, this);
	}
	
	public String getCurrURL() throws Throwable {
		String dashboardPageURL=Action.getCurrentURL(driver);
		return dashboardPageURL;
	}
	
	
	public boolean validateCompanyName() throws Throwable {
		return Action.isDisplayed(driver, companyName);
	}
	
	 public String getMyElliotTitle() {
		 String myElliotTitle=driver.getTitle();
		 return myElliotTitle;
	 }
	
	
	
    public boolean validateLogo() throws Throwable {
     return Action.isDisplayed(driver, myElliotLogo);
    
       }	
    
    public boolean validateMySmartFactory() throws Throwable {
		return Action.isDisplayed(driver, mySmartFactory);
	}

	  public void clickOnNavigationBar() throws Throwable {
	 		Action.click(driver, navigationBar);
        
	 	}
	  
	 
	  
	  public void clickOnProfileIcon() throws Throwable {
	 		Action.click(driver, profileIcon);
      
	 	}
	  
	  public AddUsersPage clickOnSettings() throws Throwable {
	 		Action.click(driver, settings);
			return new AddUsersPage();
    
	 	}
	  
	  public GaugeViewPage clickOnGaugeView() throws Throwable {
	 		Action.click(driver, gaugeView);
	 		return new GaugeViewPage();
	 	}
	  
	  
	  public HistoricalViewPage clickOnHistoricalView() throws Throwable {
	 		Action.click(driver, historicalView);
	 		return new HistoricalViewPage();
	 	}
    
	  public LoginPage clickOnLogout() throws Throwable {
	 		Action.click(driver, logout);
			return new LoginPage();
  
	 	}
	  
	  
	  

    
	

	
	
}
