package stepDifinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.talktotreat.base.JavaBase;
import com.talktotreat.base.ValidateMethods;
import com.talktotreat.pages.CheckColorWithMouseHoverPage;
import com.talktotreat.pages.MenuBaarDropdownLinkPage;
import com.talktotreat.util.PropertyReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuBaarDropDownLinkExcution {
	public WebDriver driver;
	public MenuBaarDropdownLinkPage objDrodownLinkrPage	;
	
	@Given("User open application")
	public void user_open_application() {
		 driver  =JavaBase.getDriver();
		  objDrodownLinkrPage	 =  PageFactory.initElements(driver, MenuBaarDropdownLinkPage.class);
	       objDrodownLinkrPage.openUrl();
	}

	@Then("Validate homePage url")
	public void validate_home_page_url() {
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("mainUrl"));
	}

	@When("user mouse hover on Treament dropdown link in menu baar")
	public void user_mouse_hover_on_treament_dropdown_link_in_menu_baar() {
	           objDrodownLinkrPage.Treatment_DropDownHandle();
	}

	@Then("Validate sub menu links name and size")
	public void validate_sub_menu_links_name_and_size() {
	   
	}

	
	
	
//	@Then("Validate dropdown links present and check link size")
//	public void Validate_dropdown_links_present_and_check_link_size() {
//		
//	}
//		
//	
	
	
	



}
