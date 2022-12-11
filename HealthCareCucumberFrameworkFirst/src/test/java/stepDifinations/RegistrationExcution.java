package stepDifinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.talktotreat.base.JavaBase;
import com.talktotreat.base.ValidateMethods;
import com.talktotreat.pages.RegistrationPage;
import com.talktotreat.util.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationExcution {
//	public WebDriver driver;
//	public static RegistrationPage registrationPageObj;
//
//////	@Given("User open browzer")
//////	public void user_open_browzer() {
//////		driver = JavaBase.getDriver();
//////
//////	}
////
//	@Before(order=0)
//	public void BrowserSetUp() {
//		driver = JavaBase.getDriver();
//	}
//	
//	@Before(order=1)
//	public void databaseConection() {
//		System.out.println("database conection stablishhhhhhhhhhhhhhhhhhh");
//	}
//	@And("User open url")
//	public void user_open_url() {
//		registrationPageObj = PageFactory.initElements(driver, RegistrationPage.class);
//		registrationPageObj.openUrl();
//
//	}
//
//	@Then("validate url open")
//	public void validate_url_open() {
//		registrationPageObj.validate_mainUrl();
//	}
//
//	@Then("User click on maxmize icon")
//	public void user_click_on_maxmize_icon() {
//		JavaBase.maxmizeWindow();
//	}
//
//	@When("User click on registerLink")
//	public void User_click_on_registerLink() {
//		registrationPageObj.click_registrationLink();
//	}
//
//	@Then("User should redirect to registrationPage")
//	public void User_should_redirect_to_registrationPage() {
//		registrationPageObj.validate_registrationPageUrl();
//	}
//
//	@When("User enter name")
//	public void user_enter_name() {  // parameterzie method in Registration page 
//		registrationPageObj.enter_Name(PropertyReader.getDataProperty("name"));
//
//	}
//
//	@And("User enter mobileNo")
//	public void user_enter_mobile_no() {
//		registrationPageObj.enter_MobileNo();
//	}
//
//	@And("User enter email")
//	public void User_enter_email() {
//		registrationPageObj.enter_Email();
//	}
//
//	@And("User enter patientage")
//	public void user_enter_patientage() {
//		registrationPageObj.enter_PatientAge();
//	}
//
//	@And("User select country")
//	public void user_select_country() {
//
//		registrationPageObj.select_country();
//
//	}
//
//	@And("User enter password")
//	public void user_enter_password() {
//		registrationPageObj.enter_Password();
//	}
//
//	@And("User enter confirmPassword")
//	public void user_enter_confirm_password() {
//		registrationPageObj.enter_confrimPassword();
//	}
//
//	@And("User enter medicalProblem")
//	public void user_enter_medical_problem() {
//		registrationPageObj.enter_medicalProlem();
//	}
//
//	@And("scrollbaar  down")
//	public void scrollbaar_down() {
//		JavaBase.scrollDown(70);
//
//	}
//
//	@And("User click on RegisterBtn")
//	public void user_click_on_RegisterBtn() {
//		registrationPageObj.clickOn_RegisterBtn();
//	}
//
////	@Then("validate loginRed button present on the page")
////	public void validate_loginRed_button_present_on_the_page() {
////		//registrationPageObj.validateRedButton(); method banay hain registration page main  -- yaha call kiya 
////		ValidateMethods.validateElement_IsDisplay(registrationPageObj.loginBtn, 30);// direct validatemethod class vaha say call and passing webelment , public kiya 
////	}
////
////	@And("page should redirected to confirmationPage")
////	public void page_should_redirected_to_confirmation_page() {
////		registrationPageObj.validate_ConfirmationPageUrl(); // call kiya hain regisgration page , vaha pur call kiya hain validagemethod ko 
////		System.out.println("Confirmation url done ");
////	}
//
//	
//
//	
//	@AfterStep
//	public void addScreenshot(Scenario scenario){
//
//		//if(scenario.isFailed())
//		//{
//		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//		//attach image file report(data, media type, name of the attachment)
//		scenario.attach(screenshot, "image/png", scenario.getName());
//		}
//	//}
}
	
//	
//

