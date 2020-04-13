
Feature: DemoWebShop
 
 @TC01
 Scenario: Registration  
  Given user launched webshop page
  When user entered required details
  Then user registered successfully
    
@TC02_Login
Scenario: Login successfully
 Given User launches demowebshop page
 When User enters valid credentials "<email>" and "<password>"
 Then User can login successfully
  
  
 @TC03_AddtoCart
 Scenario: Product search and AddtoCart
 Given the user launches the chrome application
 When the user logged into the home page
 Then the user search the product
 Then the user give the specifications
 Then the user adds the product to the cart
 
@TC04_Wishlist 
Scenario: Wishlish and recently viewed products
 Given the user launches  chrome 
 When the user navigated into the home page
 Then the user adds some products to wishlist
 And the user checks the recently viewed products
 
 
 @Tc05_Address
 Scenario: Add Address
 Given user launches to chrome page
 When user logged into the home page
 Then the user can add the address
 
 
 @TC06_ChangePassword
 Scenario Outline: Change Password
 Given The user launches  the chrome 
 When  The user login  to the site
 Then  The user enters "<old password>" and "<new password>" and "<confirm password>"
 
 Examples:
 |  old password  |  new password  |  confirm password  |
 |  12345678      |   23245890     |   23245890         |
 |  23245890      |   demonew      |   demonew          |