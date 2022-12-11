package stepDifinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.talktotreat.base.JavaBase;
import com.talktotreat.base.ValidateMethods;
import com.talktotreat.pages.LoginPage;
import com.talktotreat.pages.RegistrationPage;
import com.talktotreat.util.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginExcution {
	
	public static WebDriver driver;
	public LoginPage objLoginPage;
	
	@When("User click on redlogin button")
	public void User_click_on_redlogin_button() {
		   //call driver single ton
		driver=JavaBase.getDriver();// call driver and send in loginpage .
		System.out.println("prittttt"+driver);
		objLoginPage = PageFactory.initElements(driver,LoginPage.class);// page factory 
		objLoginPage.click_LoginBtn();
		 }
	@Then("validate login page url")
	public void validate_login_page_url() {
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("loginUrl"));
	}

	@When("User entered  emaili Id")
	public void user_entered_emaili_id() {
	   objLoginPage.enter_EmaiId();
	}

	@When("User entered Password")
	public void user_entered_password() {
	    objLoginPage.enter_Password();
	}

	@When("User click on sign in button")
	public void user_click_on_sign_in_button() {
	    objLoginPage.click_SignBtn();
	}

	@Then("validate home page url")
	public void validate_home_page_url() {
	    objLoginPage.validateHomePageUrl();
	}

	@And("validate text Treament package")
	public void validate_text_Treament_package() {
	        objLoginPage.validate_treatmentPackage();;
	}
	@And("validate usename")
  public void validate_username() {
	    objLoginPage.validate_username();
   }
	@When("mousehover on element")
	public void mousehover_on_element() {
		objLoginPage.mouseHoverOnElement();
	}
	@And("click on logout link")
	public void click_on_logout_link() {
		objLoginPage.click_logout();
	}
	@Then("verify user should logout")
	public void verify_user_should_logout() {
		objLoginPage.verify_loginText();
		System.out.println("logintext done");
	}
	
	
	
	
	
}
