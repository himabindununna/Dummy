package com.testrunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 
    
@RunWith(Cucumber.class)     
@CucumberOptions(  
     features="src/main/resources/DemoWebShop/DemoWebShop.feature",
     glue = "com.stepdefination",
     
     plugin = {"pretty","html:reports/cucumber-html-report",
    		 "json:target/cucumber.json",
    		 "junit:target/cucumber.xml"},
     //"com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html"},
    		
     monochrome = true
    		     
     //strict=true
        	)  

@SuiteClasses({})
public class TestRunner {

	
	/*@AfterClass
	  public static void extendReport() {
	     


		Reporter.loadXMLConfig("src/test/resources/testreport.xml");
	      Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	      Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	      Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	      Reporter.setSystemInfo("Selenium", "3.141.59");
	      Reporter.setSystemInfo("Maven", "4.0.0");
	      Reporter.setSystemInfo("Java Version", "1.8.0_131");
	}*/

}