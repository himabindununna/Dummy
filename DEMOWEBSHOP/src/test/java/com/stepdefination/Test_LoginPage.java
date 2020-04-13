package com.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.Excel_Utility.Excel_Utility;
import com.baseclass.BaseClass;
import com.pages.Webshop_Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Test_LoginPage extends BaseClass{
	
	Webshop_Loginpage lp;
	
	private static Logger logger = (Logger) LogManager.getLogger(Test_LoginPage.class);
	@Given("User launches demowebshop page")
	public void user_launches_demowebshop_page() throws Throwable {//to launch the website
		launchApp("chrome");
		lp = new Webshop_Loginpage(driver);
		lp.log();
		logger.debug("firefox launched and website opened");
	}
	@When("User enters valid credentials {string} and {string}")
	public void user_enters_valid_credentials_and(String email, String password) throws Throwable {//to enter the credentials
lp=new Webshop_Loginpage(driver);
		
		Excel_Utility excel_utility = new Excel_Utility();
	    lp.email(excel_utility.excel_email(1));
	    lp.password(excel_utility.excel_password(1));
	   
	    lp.logbtn();
	    logger.info("credentials entered");
	}
	
	@Then("User can login successfully")
	public void user_can_login_successfully() throws Throwable {
	   
	logger.info("login successfully");
	screenshot("src/main/resources/Screenshots/Login.png");
	
	driver.quit();
	}

}
