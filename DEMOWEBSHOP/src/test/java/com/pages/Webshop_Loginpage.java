package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webshop_Loginpage  {
	
	//web elements required for login to the site
   WebDriver driver; 
	@FindBy(xpath="//*[@class='ico-login']") WebElement login;
	@FindBy(name="Email") WebElement email;
	@FindBy(id="Password") WebElement password;
	@FindBy(xpath="//*[@class='button-1 login-button']")  WebElement loginbtn;
	
	public  Webshop_Loginpage(WebDriver driver) {
		//Initiating the web elements using page factory
		PageFactory.initElements(driver,this);
	this.driver=driver;   
	}
//methods to read the credentials from excel	
public void log() {
	login.click();
}
	public void email(String excel_email) {
		this.email.sendKeys(excel_email);
	}
	public void password(String excel_password) {
		this.password.sendKeys(excel_password);
	}
	public void logbtn() {
		loginbtn.click();
	}
	public void loginac() {//method to perform login 
		login.click();
		email.sendKeys("himabindhu980@gmail.com");
		password.sendKeys("bindu123");
		loginbtn.click();
	}
	

}
