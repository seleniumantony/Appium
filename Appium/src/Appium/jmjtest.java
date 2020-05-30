package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class jmjtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the Desired Capabilities
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("deviceName", "My Phone");
				caps.setCapability("udid", "SFD3Y18519024249"); //Give Device ID of your mobile phone
				caps.setCapability("platformName", "Android");
				caps.setCapability("platformVersion", "6.0");
				//caps.setCapability("appPackage", "com.netflix.Speedtest");
				//caps.setCapability("appActivity", "com.netflix.Speedtest.MainActivity");
				//caps.setCapability("noReset", "true");
				 
				//caps.setCapability("app", app.getAbsolutePath());
				caps.setCapability("appPackage", "in.amazon.mShop.android.shopping");
				caps.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
				
				
				//Instantiate Appium Driver
				try {
						AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
						 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
						 try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				driver.findElement(By.id("in.amazon.mShop.android.shopping:id/new_user")).click();
				//driver.findElement(By.id("ap_customer_name")).sendKeys(Keys.TAB);

				//driver.findElement(locator).sendKeys(Keys.ENTER);
				  driver.findElement(By.id("ap_customer_name")).setValue("JMJ");
				
				//driver.findElement(By.id("ap_customer_name")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"jmj");
				//driver.findElement(By.id("ap_customer_name")).sendKeys("JMJ ");
				driver.findElement(By.id("ap_phone_number")).setValue("94457");
				driver.findElement(By.id("ap_email")).setValue("A@com");
				driver.findElement(By.id("ap_password")).setValue("Test");
				driver.findElement(By.id("continue")).click();
				} catch (MalformedURLException e) {
					System.out.println(e.getMessage());
				}
			}
		 
		}