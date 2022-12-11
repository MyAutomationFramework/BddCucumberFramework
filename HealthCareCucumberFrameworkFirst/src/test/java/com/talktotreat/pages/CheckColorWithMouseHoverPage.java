package com.talktotreat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import com.talktotreat.base.JavaBase;
import com.talktotreat.util.PropertyReader;

public class CheckColorWithMouseHoverPage {
	public WebDriver driver;

	@FindBy(xpath = "//a[text()='Register ']")
	WebElement registrationLink;

	public  CheckColorWithMouseHoverPage(WebDriver driver) {
		this.driver=driver;
	}
		     
	 

	public void openUrl() {
		driver.get(PropertyReader.getConfigProperty("url"));
	}

	public void validate_registerlinkBlack() {

		String savecolor = registrationLink.getCssValue("color"); // step -1 -- value get link css value in rgba

		String helcolorActual = Color.fromString(savecolor).asHex(); // covert rgba to hex jo ke string return kurtee
																		// hain
		System.out.println("css value in regbbbbbb----->" + savecolor);
		System.out.println("hex code color ttttt----->  " + helcolorActual);
		String expectcolorvalue = "#000606";

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(helcolorActual, expectcolorvalue, "color not match");

		soft.assertAll();

	}

	public void mouseHover_onregisterLink() {

		JavaBase.mouseHover(registrationLink, 0);

	}

	public void validate_registerLinkRed() {

	}

}
