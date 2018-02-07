package com.wipro.practice.SeleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.wipro.practice.SeleniumPractice.HelloWorld;

/**
 * created to show functionality of test NG
 */
public class HelloWorldTest extends ExtentReportBaseClass {
	 public HelloWorld helloWorld;

	    /**
	     * below methods to test execute method of hello world
	     */
	    @Test
	    @Parameters({"expected"})
	    public void testExecute(String expected) {
	    	extentLogger = extent.startTest("testExecute","Verify actual and expected value");
	    	helloWorld = new HelloWorld();
	        String result = helloWorld.execute();
	        Assert.assertEquals(result, expected);
	        extentLogger.log(LogStatus.PASS, "Test Case (testExecute) is Passed");
	    }
	    
	    /**
	     * below methods to test execute method of hello world
	     */
	    @Test
	    public void testExecute1() {
	    	extentLogger = extent.startTest("testExecute1","Verify actual and expected value");
	        System.out.println("this is testexecute1 method");
	        extentLogger.log(LogStatus.PASS, "Test Case (testExecute1) is Passed");
	    }

}
