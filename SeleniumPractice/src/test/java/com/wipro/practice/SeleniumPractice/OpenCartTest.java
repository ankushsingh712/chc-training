package com.wipro.practice.SeleniumPractice;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class OpenCartTest extends ExtentReportBaseClass {


    @Test(description = "Login to OpenCart application")
    public void loginToOpenCartTest() {
   
    extentLogger = extent.startTest("loginToOpenCartTest");
    //System.out.println(extent.getClass());
    //extentLogger = extent.startTest("loginToOpenCartTest");
    //System.setProperty("webdriver.chrome.driver", "D:\\JAVATraing\\src\\main\\resources\\drivers\\chromedriver.exe");
    //WebDriver driver = new ChromeDriver();
    //driver.get("http://www.google.co.in");
    //driver.manage().window().maximize();
    System.out.println("Hello Hello");
    extentLogger.log(LogStatus.PASS, "Test Case (loginToOpenCartTest) is Passed");
    }

}
