package com.talktotreat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.talktotreat.base.JavaBase;
import com.talktotreat.base.ValidateMethods;
import com.talktotreat.util.PropertyReader;

import stepDifinations.RegistrationExcution;

public class LoginPage {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='btn btn-warning ornagebutton']")
	WebElement loginbutton;

	@FindBy(name = "EmailId")
	WebElement emailId;

	@FindBy(name = "Password")
	WebElement password;

	@FindBy(xpath = "//button[@id='SignIn']")
	WebElement signBtn;

	@FindBy(xpath = "//h3[text()='Treatment Packages']")
	WebElement validateTextTreamtmentPackage;

	// when login done
	@FindBy(xpath="//span[@class='pro-user-name ml-1']")
	WebElement username;

	@FindBy(xpath="//a[@href=\"/Login/Logout\"]")
	WebElement logout;
//validate 
	@FindBy(xpath="//a[@id='navLogin']")
	WebElement logintext;
        
	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public void click_LoginBtn() {

		JavaBase.clickOn1(loginbutton, 30);

	}

	public void validate_loginUrl() {
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("loginUrl"));
		System.out.println("login url done ");
	}

	public void enter_EmaiId() {
	

	//  JavaBase.sendkeys(emailId, 0, PropertyReader.getDataProperty("email"));// simple call
	  String randomEmail   =JavaBase.get_registredRandomeEmail(); // step 1 random call 
	
	  JavaBase.sendkeys(emailId, 0, randomEmail);// step-2
	 
		
	}

	public void enter_Password() {
		JavaBase.sendkeys(password, 10, PropertyReader.getDataProperty("password"));

	}

	public void click_SignBtn() {

		JavaBase.clickOn(signBtn, 0);
	}

	public void validateHomePageUrl() {
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("mainUrl"));
	}

	public void validate_treatmentPackage() {
		  ValidateMethods.validateElement_IsDisplay(validateTextTreamtmentPackage, 0);
	}

   public void validate_username() {
	   ValidateMethods.validateElement_IsDisplay(username, 0);
	 
	String text  =username.getText();
	System.out.println(" print usename------>"+text);
	
	  
   }

   public void mouseHoverOnElement() {
	 JavaBase.mouseHover(username, 10);
		   
   }
   
   public void click_logout() {
	   JavaBase.clickOn(logout, 20);
   }
   
   public void verify_loginText() {
	   ValidateMethods.validateElement_IsDisplay(logintext, 10);
	         String  text  =logintext.getText();
	         System.out.println("print login text----->"+text);
   }
   
   
   
}
