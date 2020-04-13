package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddAddress {

	protected WebDriver driver;
	@FindBy(xpath="//a[text()='Addresses']") WebElement address;
	@FindBy(xpath="//input[@type='button'][@value='Add new']") WebElement addnew;
	@FindBy(id="Address_FirstName") WebElement fn;
	@FindBy(name="Address.LastName") WebElement ln;
	@FindBy(id="Address_Email") WebElement email;
	@FindBy(name="Address.Company") WebElement company;
	@FindBy(id="Address_City") WebElement city;
	@FindBy(id="Address_Address1") WebElement add1;
	@FindBy(id="Address_ZipPostalCode") WebElement zip;
	@FindBy(id="Address_PhoneNumber") WebElement phn;
	@FindBy(xpath="//*[@type='submit'][@value='Save']") WebElement btn;
	
public  AddAddress(WebDriver driver) {
		//Initiating the web elements using page factory
		PageFactory.initElements(driver,this);
	this.driver=driver;   
	}

//method to add address
public void addaddress() {
	
	address.click();
	addnew.click();
	fn.sendKeys("Hima");
	ln.sendKeys("Bindu");
	email.sendKeys("himabindhu980@gmail.com");
	company.sendKeys("cts");
	Select country=new Select(driver.findElement(By.id("Address_CountryId")));
	country.selectByVisibleText("India");
	city.sendKeys("vijayawada");
	add1.sendKeys("Vemevarappadu");
	zip.sendKeys("521343");
	phn.sendKeys("7896542450");
	btn.click();
	
	
	
}
	
}
