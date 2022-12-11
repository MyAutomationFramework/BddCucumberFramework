package stepDifinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.talktotreat.base.JavaBase;
import com.talktotreat.base.ValidateMethods;
import com.talktotreat.pages.LoginPositiveNegativeTestingPage;
import com.talktotreat.util.PropertyReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPositiveNegativeTestingExcution {
	
	
	    
	    public WebDriver driver;
	public  LoginPositiveNegativeTestingPage  obj;
	@Given("I have launch browzer and open url")
	public void i_have_launch_browzer_and_open_url() {
	  driver =JavaBase.getDriver();
	 obj  = PageFactory.initElements(driver,LoginPositiveNegativeTestingPage.class);
	  obj.openUrl();
	}
	
	@Then("validate homepage url")
	public void validate_homepage_url() {
	obj.validate_mainUrl();
	}
	
//	@When("I mousehover on Login link")
//	public void i_mousehover_on_login_link() {
//	   obj.mousehover();
//	}
//	
//	@When("I clicked on Login as user")
//	public void i_clicked_on_login_as_user() {
//	obj.click_LoginAsUserLink();
//	}
//	
//	@Then("I can see login screen")
//	public void i_can_see_login_screen() {
//	 obj.validate_loginscreen();
//	}
//
//	@Then("validate Login url")
//	public void validate_login_url() {
//		obj.validate_LoginUrl();
//	}
//
//	@When("I enter {string} and {string} to login page")
//	public void i_enter_and_to_login_page(String email, String pass) {
//	 obj.enter_EmailAndPassword(email, pass);
//	}
////
//
//	@When("I click on SignIn button")
//	public void i_click_on_sign_in_button() {
//	 obj.click_OnSignInBtn();
//	}
//	
//	@Then("I can see the login username")
//	public void i_can_see_the_login_username() {
//	     obj.validate_usenameText();
//	}
//	
//	@When("I mosehover on username")
//	public void i_mosehover_on_username()  {
//	  obj.mousehover_usenameText();
//		
//	 
//	}
//	
//	@When("click on log out link")
//	public void click_on_log_out_link() {
//	  obj.click_LogOut();
//	}
//	
//	@Then("I can should see login text and validate home page url")
//	public void i_can_should_see_login_text_and_validate_home_page_url() {
//	  obj.validate_LoginLink();
//	   ValidateMethods.validateUrl(PropertyReader.getDataProperty("mainUrl"));
//	}
//
//	@Then("Validate error message")
//	public void validate_error_message() {
//	    obj.validate_errorMessage();
//	      ValidateMethods.validateUrl("https://talktotreat.com/Home/Login?UserValid=Incorrect%20userId%20or%20Password");
//	}
//		
//		@When("I  did not enter {string} and {string} to login page")
//		public void i_did_not_enter_and_to_login_page(String email, String password) {
//		 obj.enter_EmailAndPassword(email, password);
//		}
//		@Then("Validate error message for email and password")
//		public void Validate_error_message_for_email_and_password() {
//			  obj.validate_errormessagesEmptyFields();
//		}
//	
	@Then("Verify login link is black before mouse hover")
	public void verify_login_link_is_black_before_mouse_hover() {
	   // obj.colorBeforeMouseHover_loginLink();
		//obj.cssValuBeforeMouseHoverLoginLink_AndValidation();
	}
	
	@When("I mouse hover on Login link color should change in red")
	public void i_mouse_hover_on_login_link_color_should_change_in_red() {
	       obj.cssValueAfterMouseHoverLoginLink_AndValidation();
	}
	

}
