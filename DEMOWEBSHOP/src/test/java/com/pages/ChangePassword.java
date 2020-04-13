package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword {

	protected WebDriver driver;
	
	@FindBy(xpath="//a[text()='My account']") WebElement myacc;
	@FindBy(xpath="//a[text()='Change password']") WebElement chnpwd;
	@FindBy(name="OldPassword") WebElement oldpwd;
	@FindBy(name="NewPassword") WebElement newpwd;
	@FindBy(name="ConfirmNewPassword") WebElement cnfrmpwd;
	@FindBy(xpath="//*[@type='submit'][@value='Change password']") WebElement btn;
	

public  ChangePassword(WebDriver driver) {
		
	//Initiating the web elements using page factory
	PageFactory.initElements(driver,this);
   this.driver=driver;  

}

//method to change the password
public void changepassword(String op,String np,String cp) {
	
	myacc.click();
	chnpwd.click();
	oldpwd.sendKeys(op);
	newpwd.sendKeys(np);
	cnfrmpwd.sendKeys(cp);
	btn.click();

}
}