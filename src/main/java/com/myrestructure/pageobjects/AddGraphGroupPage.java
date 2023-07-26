package com.myrestructure.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myrestructure.actiondriver.Action;
import com.myrestructure.base.BaseClass;
import org.openqa.selenium.interactions.Actions;

public class AddGraphGroupPage extends BaseClass {
	

	Action action= new Action();
	


	 @FindBy(xpath="//button[@title='Add user details']")
	 WebElement addGraphGroupBtn;
	 
	 @FindBy(xpath="//label[text()='Enter group name']/parent::div//input")
	 WebElement groupName;
	 
	 @FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	 WebElement deviceType;
	 
	 @FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
	 WebElement meterName;
     
	 @FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]")
	 WebElement parameterName;
     
	 @FindBy(xpath="//th[text()='Device Name']")
	 WebElement deviceName;
	
	 @FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]")
	 WebElement saveBtn;
	 
	 
	 
//	 @FindBy(xpath="//div[contains(text(),'Alert Added successfully')]")
//		private WebElement confirmMessage;
	
	 public AddGraphGroupPage() {
		  PageFactory.initElements(driver, this);
		 }
	 

	
	 public void clickOnAddGraphGroupBtn() throws Throwable  {
		 Action.click(driver, addGraphGroupBtn);
	 }
	
	 

	 
	 
	 public boolean clickOnSaveBtn() throws Throwable {
    	 return Action.JSClick(driver, saveBtn);
    	
     }
	
	 
//	 public String validateConfirmMessage() {
//			String confirmMsg=confirmMessage.getText();
//			return confirmMsg;
//		}
	 
	

	 
	 public void createGraph(String dType, String mName, String pName)throws Throwable {
		 
		 groupName.sendKeys("Furnace"+System.currentTimeMillis() / 1000);
     Thread.sleep(3000);
    
    
     deviceType.click();
     selectDropdownUsingClick(dType);
     meterName.click();
     Thread.sleep(3000);
     selectDropdownUsingClick(mName);
     parameterName.click();
     Thread.sleep(2000);
     String[] values = pName.split(",");
     
    for (int i=0; i<values.length; i++)
    {
    	System.out.println(values[i]);
    	Thread.sleep(1000);
    	selectDropdownUsingClick(values[i]);
    }
    Thread.sleep(1000);
//    Action.JSClick(driver, saveBtn);
//    Thread.sleep(3000);
    //saveBtn.click();
    Actions act=new Actions(driver);
    act.sendKeys(Keys.TAB).build().perform();
    Thread.sleep(1000);
//    act.sendKeys(Keys.TAB).build().perform();
//    Thread.sleep(2000);
    //act.sendKeys(Keys.ENTER).build().perform();
    Action.JSClick(driver, saveBtn);
    Thread.sleep(6000);
    //saveBtn.click();
	 }
	 
	 public void selectDropdownUsingClick(String val) throws Exception {
		 
		  List<WebElement> eles = driver.findElements(By.xpath("//ul[@role='listbox']/li"));

	      System.out.println(eles.size());
	     // eles.get(0).getText();
	     // System.out.println(eles.get(0).getText());
	     for (WebElement e : eles){
	    	 Thread.sleep(1000);
	    	 System.out.println(e.getText());
	    	 
	    	   if(e.getText().contains(val))
	    	   { System.out.println(e.getText());
	           Thread.sleep(3000);
	           e.click();
	       break;
	    	   } 	   	
	     } 
	 }

	 



}
