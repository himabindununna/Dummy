package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddtoCart {
	
	protected WebDriver driver;
	//Web elements for products to search and add to cart
	@FindBy(name="q")  WebElement searchbar;
	@FindBy(xpath="//*[@value='Search']") WebElement searchbtn;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/h2/a")
	WebElement product;
    
    @FindBy(id="addtocart_28_EnteredQuantity")
    WebElement qty;
    @FindBy(id="add-to-cart-button-28")
    WebElement cart;
    
    public AddtoCart(WebDriver driver) {
    	//Initiating the web elements using page factory
    	PageFactory.initElements(driver,this);
    	this.driver=driver;
    }
    
    //method to search the product
   public void Search() {
	   
	   searchbar.sendKeys("Blue and green Sneaker");
	   searchbtn.click();
	   product.click();
   }
   
   //method to give specifications to the product
   public void specifications() {
	   Select sizeSelect=new Select(driver.findElement(By.id("product_attribute_28_7_10")));
	   
	  sizeSelect.selectByVisibleText("10");
	  qty.clear();
	   qty.sendKeys("3");
	   
   } 
   
   //method to add a product to cart
   public void addtocart() {
	   
	   cart.click();
	   
	   
   }
   
 } 

