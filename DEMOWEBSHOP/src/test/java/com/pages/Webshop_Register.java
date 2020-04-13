package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webshop_Register {
	
//web elements required for registration 
	 protected WebDriver driver;
	@FindBy(xpath="//*[@class='ico-register']")
	WebElement register;
	@FindBy(id="gender-female")
	WebElement gender;
	@FindBy(name="FirstName")
	WebElement firstname;
	@FindBy(name="LastName")
	WebElement lastname;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(name="Password")
	WebElement password;
	@FindBy(name="ConfirmPassword")
	WebElement confrimpswd;
	@FindBy(id="register-button")
	WebElement regbtn;

	public   Webshop_Register(WebDriver driver) {
		PageFactory.initElements(driver,this);//Initiating the web elements using page factory
	this.driver=driver;   
	}

	public void Register() {//method to perform registration
		
		register.click();
		gender.click();
		firstname.sendKeys("hima bindu");
		lastname.sendKeys("nunna");
		email.sendKeys("himabindhu980@gmail.com");
		password.sendKeys("129dhh9");
		confrimpswd.sendKeys("129dhh9");
		regbtn.click();
		
	}
}
	
	

	
	
	   
	
	
	
	
	
	