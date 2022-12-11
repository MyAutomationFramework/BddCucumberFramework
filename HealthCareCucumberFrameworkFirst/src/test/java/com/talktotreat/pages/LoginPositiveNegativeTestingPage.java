package com.talktotreat.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import com.talktotreat.base.JavaBase;
import com.talktotreat.base.ValidateMethods;
import com.talktotreat.util.PropertyReader;

public class LoginPositiveNegativeTestingPage {
	
	public WebDriver driver;

@FindBy(xpath = "//li[@class='nav-item dropdown position-static']")
By menubaarDropdownLink = By.xpath("//li[@class='nav-item dropdown position-static']");

	
	@FindBy(xpath="//a[@id='navLogin']")
	WebElement LoginLink;
	
	// linkText
	@FindBy(linkText="Login")
	WebElement Login;
	
	@FindBy(xpath="//a[@href=\"/Home/login\"]")
	WebElement loginAsUserLink;
	
	// linkText
	@FindBy(linkText="Login As User")
	WebElement LoginAsUSer;
	
	@FindBy(xpath="//input[@id=\"EmailId\"]")
	WebElement emailId;
	
	@FindBy(id="EmailId")
	WebElement eamaild1;
	
	@FindBy(id="Password")
	WebElement Password;
	
	
	@FindBy(id="SignIn")
	WebElement signBtn;
	
// validate text in login page 	
	@FindBy(xpath="//h3[text()='Sign In as user']")
	WebElement textSignAsUser;
	
	// validate after login 
	@FindBy(xpath="//span[@class='pro-user-name ml-1']")
	WebElement usenameText;
	
	//validate login screen
	@FindBy(xpath="//div[@class='col-md-5 text-left']")
	WebElement loginScreen;
	
	// LogOut
	@FindBy(linkText="Logout")
	WebElement logout;
	// validation message invalid credencial
	@FindBy(xpath="//b[text()='Incorrect userId or Password']")
	WebElement errorMessage;
	// error meesage empty fields
	
	@FindBy(xpath="//span[@id='EmailId-error']")
	WebElement emptyEmailError;
	
	@FindBy(xpath="//span[@id='Password-error']")
	WebElement emptyPassError;
	// construtor
	
	//WebElement 
	public   LoginPositiveNegativeTestingPage(WebDriver driver) {
		 this.driver=driver;
	}
		
	
	
	public void openUrl() {
		driver.get(PropertyReader.getConfigProperty("url"));
		
	}

	 public void validate_mainUrl() {
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("mainUrl"));
	 }
	
	public void mousehover() {
		//JavaBase.clickHover(Login, 10);
		 JavaBase.clickOn1(Login, 20);
	}
	
	
	public void click_LoginAsUserLink() {
		JavaBase.clickOn(loginAsUserLink, 0);
	}
	
	public void validate_loginscreen() {
		  ValidateMethods.validateElement_IsDisplay(loginScreen, 10);
	}
	public void validate_LoginUrl() {
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("loginUrl"));
	}
	
	public void validate_pageTitleText() {
		   ValidateMethods.validateElement_IsDisplay(textSignAsUser, 0);
	}
	
	public void enter_EmailAndPassword(String emailValue,String passValue) {
		 JavaBase.sendkeys(emailId, 0, emailValue);
		 JavaBase.sendkeys(Password, 0, passValue);
		
	}
	
	
	public void click_OnSignInBtn() {
		  JavaBase.clickOn(signBtn, 0);
	}
	
	public void validate_usenameText() {
		  ValidateMethods.validateElement_IsDisplay(usenameText, 10);
	}
	
	
	public void mousehover_usenameText() {
		//JavaBase.clickHover(usenameText, 10);
		JavaBase.clickOn1(usenameText, 0);
		
	}
	
	// errormessages
	
	
	public void validate_usnameNameOrErrormessage() {
				ValidateMethods.validateElement_IsDisplay(usenameText, 0);
				
	           }
	// logout
	
	public void click_username() {
		JavaBase.clickOn(usenameText, 10);
	}
	
	public void click_LogOut() {
		 JavaBase.clickBy_javaExcutu(logout, 10);
	}
	
	
	public void validate_LoginLink()
	{
		ValidateMethods.validateElement_IsDisplay(LoginLink, 20);		
			String text=LoginLink.getText();
			System.out.println("yes login is display");
				 System.out.println("printtttttt---->"+ text);
		}
		
		public void validate_errorMessage() {
			 ValidateMethods.validateElement_IsDisplay(errorMessage, 10);
		}
	
	  public void validate_errormessagesEmptyFields() {
		        ValidateMethods.validateElement_IsDisplay(emptyEmailError, 10);
		        ValidateMethods.validateElement_IsDisplay(emptyPassError, 10);
	  }

	 // call genric method
	  
	  public void cssValuBeforeMouseHoverLoginLink_AndValidation() throws InterruptedException {
		 JavaBase.cssbeforeAndAfter_mousehoverColor(Login, 10, "color", "#000606");// call genric css value method 
		 }
		 
 public void cssValueAfterMouseHoverLoginLink_AndValidation() {
	          JavaBase.mouseHover(Login, 10);
		  JavaBase.cssbeforeAndAfter_mousehoverColor(Login, 10, "color", "#df3631"); // call genric css value method 
		 
		  }
 
 }

	
 
						//********* non genriv  before  after *************
//public void colorBeforeMouseHover_loginLink() {
//	  
//String savecolorRgba    = Login.getCssValue("color");// login welelemnt ka color daykhna tha  . and css value 
//	     System.out.println("before mouse hover login rgba color------>"+savecolorRgba);
//	 String savehexColorActual   = Color.fromString(savecolorRgba).asHex();
//	     System.out.println("print hex color------->"+savehexColorActual);
//	        
//	     String expectcolor="#000606";
//	          SoftAssert soft=new SoftAssert();
//	           soft.assertEquals(savehexColorActual, expectcolor, " hexcolcoloractual and expexted color is not matched");
//              soft.assertAll();  
//	     
//	         
////	     if(savehexColorActual.equals("#000606")) {
////	    	 System.out.println(" Test Pass");
////	     }
////	     
////	     
////	     else {
////  	 System.out.println(" Test Failed");
////   }
//}
//                    //********* non genriv  before  after *************
//public void AftereMouseHover_loginLink() {
//	  JavaBase.mousekHover1(Login, 10);
//	              String savecoloraftermouse   =Login.getCssValue("color");
//	              System.out.println("print rgba color----->"+savecoloraftermouse);
//	              
//	              String savehexColorActual   = Color.fromString(savecoloraftermouse).asHex();
//	 		     System.out.println("print hex color------->"+savehexColorActual);
//	 		         String expectcolor="#df3631";
//	 		          SoftAssert soft=new SoftAssert();
//	 		           soft.assertEquals(savehexColorActual, expectcolor, " hexcolcoloractual and expexted color is not matched");
//	 		                soft.assertAll();  
//	 		      
//}	
//
//
//
//
 
		 	  


	


