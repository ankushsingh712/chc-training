package com.wipro.practice.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class is to show how to handle drop down menu
 * @author KU395948
 *
 */

public class PracticeTest {
	
	public static void main(String[] args){
		 System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("disable-infobars");
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 ChromeDriver driver = new ChromeDriver(capabilities);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("http://store.demoqa.com/");
		 WebElement prodCategoryMenu = driver.findElement(By.xpath("//a[contains(.,'Product Category')]"));
		 WebDriverWait webDriverWait = new WebDriverWait(driver,5);
		 webDriverWait.pollingEvery(2, TimeUnit.SECONDS).until(ExpectedConditions.elementToBeClickable(prodCategoryMenu));
		 Actions action = new Actions(driver);
		 action.moveToElement(prodCategoryMenu).perform();
		 WebElement iPhoneSubmenu = driver.findElement(By.xpath("//a[contains(.,'iPhones')]"));
		 webDriverWait.pollingEvery(2, TimeUnit.SECONDS).until(ExpectedConditions.visibilityOf(iPhoneSubmenu));
		 iPhoneSubmenu.click();
		 /**
		  * below code to handle alert pop up
		 */
		 
		 driver.get("file:///C:/Users/KU395948/Desktop/Alert.html");
		 WebElement btnTryIt = driver.findElement(By.xpath("//button[contains(.,'Try it KSaurav')]"));
		 btnTryIt.click();
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 Alert alert = driver.switchTo().alert();
		 String alertMsg = alert.getText();
		 System.out.println(alertMsg);
		 //alert.accept();
		 alert.dismiss();
		 
	}

}
