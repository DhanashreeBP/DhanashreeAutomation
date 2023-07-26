package com.myrestructure.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static Properties prop= new Properties();
	public static WebDriver driver;
	
	

	public static FileInputStream ip;

	//loadConfig method is to load the configuration
	
	@BeforeTest
	public void loadConfig() {
		

 		try {
 			prop = new Properties();
 			System.out.println("Super invoked constructor");
 			FileInputStream ip = new FileInputStream(
 					System.getProperty("user.dir") + "\\Configuration\\Config.properties");
 			prop.load(ip);

 		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
 	}
 	
 	

 	public static void launchApp() {
 		
 		WebDriverManager.chromedriver().setup();
 		String browserName = prop.getProperty("browser");
 		System.setProperty("webdriver.chrome.silentOutput","true");
 		if (browserName.equalsIgnoreCase("Chrome")) {
 			driver = new ChromeDriver();
 		} else if (browserName.equalsIgnoreCase("FireFox")) {
 			
			driver = new FirefoxDriver();
 		} else if (browserName.equalsIgnoreCase("IE")) {
 			
 			driver = new InternetExplorerDriver();
 		}
 		 
 		 driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
 		//Action.implicitWait(driver, 60);
 		//Action.pageLoadTimeOut(driver, 60);
 		driver.get(prop.getProperty("url"));
 		
 	}		

}
