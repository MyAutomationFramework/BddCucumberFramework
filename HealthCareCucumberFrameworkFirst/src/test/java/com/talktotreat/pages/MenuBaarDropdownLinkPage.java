package com.talktotreat.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.talktotreat.base.JavaBase;
import com.talktotreat.util.PropertyReader;

public class MenuBaarDropdownLinkPage {

	public WebDriver driver;

	@FindBy(xpath = "//li[@class='nav-item dropdown position-static']")
	By menubaarDropdownLink = By.xpath("//li[@class='nav-item dropdown position-static']");

	// Tretment  dropdown 
	
	@FindBy(xpath="(//a[@id='navbarDropdown'])[1]")
	 WebElement Treatment;
	
	
	@FindBy(xpath="//a[@class='float-left nav-link']")
	
	By subMenuHeader=By.xpath("//a[@class='float-left nav-link']");
	
	// construtor

	public MenuBaarDropdownLinkPage(WebDriver driver) {
		this.driver = driver;
	}

	public void openUrl() {
		// driver.get(PropertyReader.getConfigProperty("url"));
		driver.get(PropertyReader.getDataProperty("mainUrl"));
	}

	
	 public void Treatment_DropDownHandle() {
		 JavaBase.mouseHover(Treatment, 0);
		 
	 }
	
	 public void ValidatTreatment_dropdownSubmenu() {
		 // name and size 
		 List<WebElement>  saveElements  = driver.findElements(subMenuHeader);
		  
		 
	 }
	
	
	// non genric method   rupali 
		// make genric for when element in row   

//		public void click_dropdownLinks() throws InterruptedException{
//					// List<WebElement>  saveElements = driver.findElements(By.xpath("//li[@class='nav-item dropdown position-static']"));
//					 List<WebElement>  saveElements  = driver.findElements(menubaarDropdownLink);
//					 
//					 for(  WebElement saveElements2 :saveElements) {
//						  System.out.println(" element  xapth----->"+saveElements2);       // all three xpath 
//						 System.out.println("link name---->"+saveElements2.getText());      // giving name link
//						 System.out.println("sub menu name------>"+saveElements); 
//						 boolean   value	 = saveElements2.isDisplayed();
//					System.out.println("valueeeeee------>"+value);
//						  
//					       saveElements2.click();
//						       Thread.sleep(2000);
//				 }
//					 
//					 }
	//	
		
		
	        // today 
	

}
