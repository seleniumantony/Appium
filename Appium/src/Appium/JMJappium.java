package Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class JMJappium {
	@Test
	public void test1() throws MalformedURLException{
	 
	// Create object of  DesiredCapabilities class and specify android platform
	DesiredCapabilities capabilities=DesiredCapabilities.android();
	 
	 
	// set the capability to execute test in chrome browser
	 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
	 
	// set the capability to execute our test in Android Platform
	   capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
	 
	// we need to define platform name
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	 
	// Set the device name as well (you can give any name)
	 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"ANTHONY");

	 // set the android version as well 
	   capabilities.setCapability(MobileCapabilityType.VERSION,"9.1.0");
	 
	 // Create object of URL class and specify the appium server address
	 URL url= new URL("http://127.0.0.1:4723/wd/hub");
	 System.setProperty("webdriver.chrome.driver", "D:\\Antony\\Appium\\Eclipse Appium storage\\Appium\\Resource\\chromedriver.exe");

	// Create object of  AndroidDriver class and pass the url and capability that we created
	 WebDriver driver = new AndroidDriver(url, capabilities);
 

	 
	 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	 ChromeOptions options=new ChromeOptions();
	 options.setExperimentalOption("androidPackage", "com.android.chrome");
	 capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	 capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	 driver.get("https://www.google.com/");
	 
		driver = new RemoteWebDriver(url,capabilities);
		driver.get("https://www.inviul.com");
		System.out.println("Appium Test Started");
		String title = driver.getTitle();
		System.out.println("Title is- "+title); 
	 
	 
	}
	 
	}