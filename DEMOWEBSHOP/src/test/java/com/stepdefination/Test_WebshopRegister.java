package com.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.baseclass.BaseClass;
import com.pages.Webshop_Register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_WebshopRegister extends BaseClass {
	
	private static Logger logger=(Logger)LogManager.getLogger(Test_WebshopRegister.class);
	Webshop_Register lp;
	
	   @Given("user launched webshop page")
	    public void user_launched_webshop_page() { // to launch the website
		   launchApp("chrome");
			logger.debug("Chrome Launched and navigated to website");
	    }

	    @When("user entered required details")     //to register the details
	    public void user_entered_required_details() {
	    	lp=new Webshop_Register(driver);
		    lp.Register();
		    logger.info("Required details for registration were entered");
	    }

	    @Then("user registered successfully")
	    public void user_registered_successfully() throws Throwable {
	    	logger.warn("You entered an existed email id");
			logger.error("the registration is not successful");
			screenshot("src/main/resources/Screenshots/Register.png");
			driver.quit();
		
	    }




}
