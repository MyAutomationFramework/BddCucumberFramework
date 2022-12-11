package step;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.talktotreat.base.JavaBase;
import com.talktotreat.pages.NavBaarLinksPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NavBaarLinksNameExcution {
	// nav baar link size , name comapare, mouse hover function  validate with css , three link naviagation , three dropdoen  
	 // handel teamant drop down 
	// yadee mun chahay link put click kara ho tay kasay and validate randomely  by index ,by value 
	
	// make all methods genrick
	
	// two array list comaparesion 
	public WebDriver driver;
	public  NavBaarLinksPage   objNavBaar;
	
	@Given("I launch browzer and open url")
	public void i_launch_browzer_and_open_url() {
	     driver =JavaBase.getDriver();
	     objNavBaar = PageFactory.initElements(driver, NavBaarLinksPage.class);
	      objNavBaar.openUrl();
	     // JavaBase.maxmizeWindow();
	}

	@Then("Print all menu baar links")
	public void print_all_menu_baar_links() {
	objNavBaar.printli_navBaar();
	
	
	
	       // expect link ko Array list box main bharo
//	     List<String> expectlinkNames=new ArrayList<String>();
//	                     expectlinkNames.add("");
//	                   expectlinkNames.add("Home");
//	                   expectlinkNames.add("Doctors");
//	                   expectlinkNames.add("Hospitals");
//	                   expectlinkNames.add("Treatments");
//	                   expectlinkNames.add("Register");
//	                   expectlinkNames.add("Login");
//	                   expectlinkNames.add("Help");
//	                   
          
	                   }// end then
	 				
            

}
