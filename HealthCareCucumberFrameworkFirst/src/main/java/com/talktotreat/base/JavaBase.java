package com.talktotreat.base;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.talktotreat.util.PropertyReader;

public class JavaBase {
	public static WebDriver driver;
	public static String browzersave;
//	public static WebElement element_withWait;
	public static JavascriptExecutor js;
	public static String email_withRandom;

	public static WebDriver getDriver() {
		browzersave = PropertyReader.getConfigProperty("BrowserName"); // calling browzename

		if (browzersave.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browzersave.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browzersave.equalsIgnoreCase("Safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}

		else {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		return driver;

	}// end method
//	
	// singleton
//	public static WebDriver getDriver() {
//		if (driver == null) {
//
//			browzersave = PropertyReader.getConfigProperty("BrowserName"); // calling browzename
//
//			if (browzersave.equalsIgnoreCase("chrome")) {
//				WebDriverManager.chromedriver().setup();
//				driver = new ChromeDriver();
//			}
//
//			else if (browzersave.equalsIgnoreCase("edge")) {
//				WebDriverManager.edgedriver().setup();
//				driver = new EdgeDriver();
//			}
//
//			else if (browzersave.equalsIgnoreCase("Firefox")) {
//				WebDriverManager.firefoxdriver().setup();
//				driver = new FirefoxDriver();
//			}
//
//			else if (browzersave.equalsIgnoreCase("Safari")) {
//				WebDriverManager.safaridriver().setup();
//				driver = new SafariDriver();
//			}
//
//			else {
//
//				WebDriverManager.chromedriver().setup();
//				driver = new ChromeDriver();
//			}
//
//			return driver;
//		} else {
//			return driver;
//		}
//	}

	public static void teardown() {
		driver.quit();
	}

	// trial
	// window maxmize
	public static void maxmizeWindow() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	// send keys
	public static void sendkeys(WebElement element, int timeout, String value) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		element_withWait.sendKeys(value);

	}

	// Randome email -method one -- onle genrate kay leeay retuen --- we use in
	// Registration page for email

	public static String random_EmailId2() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);// gentrate digit
		System.out.println("random values are  " + randomInt);
		email_withRandom = randomInt + PropertyReader.getDataProperty("email");// global
		return email_withRandom;

	}

	// return -genrated randome email return - for login page
	public static String get_registredRandomeEmail() {
		return email_withRandom;
	}

	// mouseHover
	public static void mouseHover(WebElement element, int timeout) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		Actions actObj = new Actions(driver);
		actObj.moveToElement(element_withWait).perform();// for mouse hover action

	}
	

	//mouse hover1
	public static void mousekHover1(WebElement element, int timeout) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
			.until(ExpectedConditions.visibilityOf(element));
		Actions actObj = new Actions(driver);
		actObj.moveToElement(element_withWait).perform();// for mouse hover action
		 System.out.println("print   element   get text  UI UI UI -----> "+element_withWait.getText());
		}
	


	// click
	public static void clickOn(WebElement element, int timeout) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.elementToBeClickable(element));
		element_withWait.click();

	}

	public static void clickOn1(WebElement element, int timeout) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		element_withWait.click();

	}

	// click with java excuter
	public static void clickBy_javaExcutu(WebElement element, int timeout) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element_withWait);
	}

	public static void scrollDown(int position) {
		js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,200)");
		js.executeScript("window.scrollBy(0,'" + position + "')");

	}

	// Dropdown without method visible , value ,visibletext -----
	public static void selectOptionFromDropdown(WebElement element, int timeout, String value) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		Select dropdown = new Select(element_withWait);
		List<WebElement> allOptions = dropdown.getOptions();

		for (WebElement options : allOptions) {
			if (options.getText().equals(value)) {
				options.click();
				break;
			}
		}
	}

	// yesterday genric method one by one click on menu baar drop down link —java
	// base

	public static void click_dropdownLinks(By menubaarDropdownLink) throws InterruptedException {

		List<WebElement> saveElements = driver.findElements(menubaarDropdownLink);
		System.out.println("save elementssssssssssssssssss" + saveElements);
		for (WebElement saveElements2 : saveElements) {
			// mouseHover(saveElements2, 10);
			// aseertion
			ValidateMethods.validateElement_IsDisplay(saveElements2, 10);

			// System.out.println(element_withWait.getText()+" "+element_withWait);
			// System.out.println("pritttttttttttttttttt xapth "+saveElements2);
			System.out.println("print get texttttttt      link name" + saveElements2.getText());

			Thread.sleep(2000);
		}
	}
	
	
							// genric method for css value

	// pehaly ess method ko call karo ----before mouse hover >phir mouse hover   you can pass value and expected resultttt
	// ko-----> phir again ess ko after mouse hover
	public static void cssbeforeAndAfter_mousehoverColor(WebElement element, int timeout, String whichcssValue,
			String expectHexcolorValue) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));// step -one

		String regbaColor = element_withWait.getCssValue(whichcssValue); // step-2 link color background ,height we need
																			// pass

		System.out.println("print rgba color----->before mouse hover" + regbaColor);
		// convert regba colour into hex color-----call color class anme from string
		// method
		String savehexColorActual = Color.fromString(regbaColor).asHex();
		System.out.println(" hex color actual ----->" + savehexColorActual);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(savehexColorActual, expectHexcolorValue, "both color not matched ");
				soft.assertAll();

	}
	
	
				// non geric one by one drop down mose hover or click rupaliiiii
	
	
	             // make genric task      
	
//	public void click_dropdownLinks() throws InterruptedException{
//	// List<WebElement>  saveElements = driver.findElements(By.xpath("//li[@class='nav-item dropdown position-static']"));
//	 List<WebElement>  saveElements  = driver.findElements(menubaarDropdownLink);
//	 
//	 for(  WebElement saveElements2 :saveElements) {
//		  System.out.println(" element  xapth----->"+saveElements2);       // all three xpath 
//		 System.out.println("link name---->"+saveElements2.getText());      // giving name link
//		 System.out.println("sub menu name------>"+saveElements); 
//		 boolean   value	 = saveElements2.isDisplayed();
//	System.out.println("valueeeeee------>"+value);
//		  
//	       saveElements2.click();
//		       Thread.sleep(2000);
// }
//	 
//	 }
//
	
	
	
	
	
	
	
	
	
	
	
	
	
			// did not use these methods 
	// drop down using select class method- working-- did not use
	
	
	//Action-double click
			public static void doubleClick(WebElement element, int timeout) {
				WebElement element_withWait = new WebDriverWait(driver, timeout)
					.until(ExpectedConditions.visibilityOf(element));
				Actions actObj = new Actions(driver);
				actObj.doubleClick(element_withWait).perform();// for mouse hover action
	              System.out.println("print   element   get text UI  UI----> "+element_withWait.getText());
				}
		
			//Action-right click  checkjjjjjjjj is rith methid context method call 
					public static void rightClick(WebElement element, int timeout) {
						WebElement element_withWait = new WebDriverWait(driver, timeout)
							.until(ExpectedConditions.visibilityOf(element));
						Actions actObj = new Actions(driver);
						actObj.contextClick(element_withWait).perform();// for mouse hover action
			              System.out.println("print   element   get text  UI  UI -----> "+element_withWait.getText());
						}

	
	

	public static void dropDown_select(WebElement element, String type, int timeout, String value) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		Select dropDown = new Select(element_withWait);

		switch (type) {

		case "index":
			dropDown.selectByIndex(Integer.parseInt(value));
			break;

		case "value":
			dropDown.selectByValue(value);
			break;

		case "visibletext":
			dropDown.selectByVisibleText(value);
			break;

		default:
			break;

		}// Switch

	}

	// dropdown with methods and if else=not working--- didinot use
	public static void dropdown2(WebElement element, String type, int timeout, String value1) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		Select dropdown = new Select(element_withWait);
		if (type.equals("index")) {
			dropdown.selectByIndex(Integer.parseInt(value1));
		}

		else if (type.equals("value")) {
			dropdown.selectByValue(value1);
		}

		else if (type.equals("visibletext")) {
			dropdown.selectByVisibleText(value1);
		}

		else {
			System.out.println("pls check spelling");
		}

	}
					// genric method for li element ----fooorter
	 public  static void print_menubaarLinks(By element)  {
		    List<WebElement> Actual_saveNavBaarLinks = driver.findElements(element);
		               // System.out.println(Actual_saveNavBaarLinks.);
		
		   for(WebElement Navlinks : Actual_saveNavBaarLinks) {
			 // System.out.println( "Print NavBaar Link  for each loop ----->"+Navlinks.getText()+" ");//////
		         Navlinks.click();
		        //  System.out.println("get textttttttt"+Navlinks.getText());
		         System.out.println("url link before back------->"+driver.getCurrentUrl());
		            
		         driver.navigate().back();
		      
		        System.out.println("url link after back  ------->"+driver.getCurrentUrl());
		            
		    }// end for each loop
//		
	
	 }	
	 
	 // multiple element click
	 public  static void li_Click(By element)  {
		    List<WebElement> Actual_saveNavBaarLinks = driver.findElements(element);
		            
		
		   for(WebElement Navlinks : Actual_saveNavBaarLinks) {
			
		         Navlinks.click();
		      
		         System.out.println("url link before back------->"+driver.getCurrentUrl());
		            
		         driver.navigate().back();
		      
		        System.out.println("url link after back  ------->"+driver.getCurrentUrl());
		        }
		            
		    }// end for each loop
		
		   public  static void Print_navBaarLinks(By element)  {
			    List<WebElement> Actual_saveNavBaarLinks = driver.findElements(element);
			            
			
			   for(WebElement Navlinks : Actual_saveNavBaarLinks) {
				
			        System.out.println(Navlinks.getText());
			      
			         System.out.println("url link------->"+driver.getCurrentUrl());
			            
			       }// end for each loop
			
	 }	
	 
	 
	
}
// end class
