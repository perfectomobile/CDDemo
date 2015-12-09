package test.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.perfectomobile.selenium.api.IMobileDevice;
import com.perfectomobile.selenium.api.IMobileWebDriver;
import com.perfectomobile.selenium.options.visual.text.MobileTextMatchMode;

public class verifyAppTest {


	public String verifyAppTest(IMobileDevice device)
	{
		String text="PASS" ;
		try
		{
			device.open();
			//device.home();

			// Define to types of web driver 
			// 1. DOM - standard web webdriver works with the DOM objects
			// 2. Visual Driver - allows to validate that text appear on the screen using visual analysis (OCR).
			//    This validation is very important and simulate the real user experience.

			IMobileWebDriver  webDriver = device.getDOMDriver ("www.united.com");
			WebDriver visualDriver = device.getVisualDriver();

			webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			visualDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   		visualDriver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);


			visualDriver.findElement(By.linkText("Flight Status"));
	
		}catch (Exception e)
		{
			return "error";
		}
		return  text;
		
	

	}
}
