package com.talktotreat.base;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.talktotreat.util.PropertyReader;
//import static org.assertj.core.api.Assertions.assertThat;

//import org.junit.Assert;

public class ValidateMethods extends JavaBase {
	public static SoftAssert soft;

	public static void validateUrl(String expectUrl) {
		String saveCurrentUrl = driver.getCurrentUrl();
		
	SoftAssert	soft = new SoftAssert();
		soft.assertEquals(saveCurrentUrl, expectUrl);
		soft.assertAll();
		
		System.out.println("print expectUrl ----> " + expectUrl);
		System.out.println("print  currentUrl ----> " + saveCurrentUrl);
		
	}

	public static void validateTitle(String expectTitle) {
		String savetitle = driver.getTitle();
		soft.assertEquals(savetitle, expectTitle, "actual and expect title is not matched");
		soft.assertAll();
		System.out.println(savetitle);
	}

	// logo , text ,button ,link id display ,login wingdow
	// you need just pass xpath .
	public static void validateElement_IsDisplay(WebElement anyElement, int timeout) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(anyElement));
		System.out.println(anyElement);
		SoftAssert  sofObj = new SoftAssert();
		boolean savereturn_trureOrFalse = anyElement.isDisplayed();
		           
		        sofObj.assertTrue(savereturn_trureOrFalse);
		    
		//soft.assertTrue(anyElement.isDisplayed());////we call call driectly or 59 number line
		sofObj.assertAll();
		System.out.println("print element  is displayuuuuuuuu----->" + savereturn_trureOrFalse);
		System.out.println("print element  get text UI----->" + element_withWait.getText());
	}

	
	public static void validate_buttonEnable(WebElement elementbutton,int timeout) {
		WebElement elementButton_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(elementbutton));
		boolean trueOrFalse = elementbutton.isEnabled();
		System.out.println(trueOrFalse);
		soft.assertTrue(elementbutton.isEnabled());
		soft.assertAll();
		System.out.println("print button name----->"+elementButton_withWait.getText());
	}

	
	// checkbox radio button
		public static void validate_elementSelectable(WebElement checkkBoxButton,int timeout) {
			WebElement elementchekboxButton_withWait = new WebDriverWait(driver, timeout)
					.until(ExpectedConditions.visibilityOf(checkkBoxButton));
			
			//Boolean trueOrFalse = elementchekboxButton_withWait.isSelected();
			
			soft.assertTrue(elementchekboxButton_withWait.isSelected());
			soft.assertAll();
			System.out.println("print button name----->"+elementchekboxButton_withWait.getText());
		}

	
	
	
	

	public static void validate_ElementPresent() {

		
	}


	// ******** return ask sir************
	public  static String curretnUrl() {
		String url=driver.getCurrentUrl();
		return url;
	}

}
