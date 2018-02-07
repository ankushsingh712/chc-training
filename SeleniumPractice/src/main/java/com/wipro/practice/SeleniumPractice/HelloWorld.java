package com.wipro.practice.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * print hello world
 */
public class HelloWorld {

    /**
     * method to return hello world
     * @return "Hello World!"
     */
    public String execute(){
    	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://google.co.in");
    	driver.quit();
        return "Hello World!";
        
    }
}
