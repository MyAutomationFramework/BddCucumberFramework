package com.talktotreat.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.talktotreat.base.JavaBase;
import com.talktotreat.util.PropertyReader;

public class NavBaarLinksPage {
	
	
   public WebDriver driver;
	
	By menubaarLinks = By.xpath("//ul[@id='navbarCollapse']/li/a");
	By menubaarLinkss = By.xpath("//ul[@id='navbarCollapse']/li[3]/a"); //  specifice index link  xpath 
	
	
	//li[@class='list-inline-item']/a
	                               
	         By footersScoalMedia = By.xpath("//li[@class='list-inline-item']/a");
	//ul[@id='navbarCollapse']/li[2]/a
	public NavBaarLinksPage(WebDriver driver) {
		this .driver=driver;
	} 
	
	public void openUrl() {
		driver.get(PropertyReader.getDataProperty("mainUrl"));
	}
	

     public void printli_navBaar(){
			
    	 // JavaBase.print_menubaarLinks(menubaarLinkss); //  working spacific link click--------> mun passand link ko click kurvaoo 
    	// JavaBase.print_menubaarLinks(footersScoalMedia);//working  click you need validate with current  url  and explicit  wait one bt one 
			//JavaBase.Print_navBaarLinks(menubaarLinks); // working  need validate expect result ------->link are present tescaSE 
		  }
		   
		   
	
	 
	 
	 
	 
				
	
	 }// end class

