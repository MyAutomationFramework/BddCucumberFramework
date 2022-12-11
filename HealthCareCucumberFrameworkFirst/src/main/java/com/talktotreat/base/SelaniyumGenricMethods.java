package com.talktotreat.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SelaniyumGenricMethods extends  JavaBase {

	private static WebElement element_withWait2;

	// sendkeys  genric
	 public static void sendkeys(WebDriver driver ,WebElement element,int timeout,String value) {
		   WebElement element_withWait=   new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		                 element_withWait.sendKeys(value);

	 }


 public static void maxmizeWindow() {
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}



	// click



	 // drag and drop






}
