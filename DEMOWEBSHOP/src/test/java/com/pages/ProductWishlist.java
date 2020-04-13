package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductWishlist {
	
	protected WebDriver driver;
	
	
	@FindBy(xpath="//a[contains(text(),'Books')]")
	WebElement book;
	@FindBy(xpath="//a[text()='Health Book']")
	WebElement healthbook;
	@FindBy(id="add-to-wishlist-button-22")
	WebElement wishlist1;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")
	WebElement jewelry;
	@FindBy(xpath="//a[text()='Black & White Diamond Heart']")
	WebElement chain;
	@FindBy(id="add-to-wishlist-button-14")
	WebElement wishlist2;
	@FindBy(linkText="Apparel & Shoes")
	WebElement cloth;
	
	@FindBy(xpath="//a[text()='Recently viewed products']")
	WebElement rvp;
	
	
public  ProductWishlist(WebDriver driver) {
		//Initiating the web elements using page factory
		PageFactory.initElements(driver,this);
	this.driver=driver;   
	}
	
//method to add the products to wish list
	public void wishlist() {
		
		book.click();
		healthbook.click();
		wishlist1.click();
		jewelry.click();
		chain.click();
		wishlist2.click();
		cloth.click();
		
			
	}
	
	//method to check the recently viewed products
	public void recently_viewed() {
		rvp.click();
		
	}

}
