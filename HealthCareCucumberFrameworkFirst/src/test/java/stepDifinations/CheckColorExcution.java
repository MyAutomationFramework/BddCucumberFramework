package stepDifinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.talktotreat.base.JavaBase;
import com.talktotreat.pages.CheckColorWithMouseHoverPage;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckColorExcution {
	public WebDriver driver;
	public CheckColorWithMouseHoverPage  objColorPage;
	
	@Given("I start application")
	//@Before
	public void I_started_application() {
		 driver  =JavaBase.getDriver();
         objColorPage	 =  PageFactory.initElements(driver, CheckColorWithMouseHoverPage.class);
         objColorPage.openUrl();
	}

	@Then("Validate register  link color is  black before moseHover")
	public void validate_register_link_color_is_black_before_mose_hover() {
	  objColorPage.validate_registerlinkBlack();
	}

	@When("I mouseHover on the link")
	public void i_mouse_hover_on_the_link() {
	   
	}

	@Then("Validate register  link color is  red after moseHover")
	public void validate_register_link_color_is_red_after_mose_hover() {
	   
	}
	
	
//	@AfterStep
//	public void addScreenshot(Scenario scenario){
//
//		//if(scenario.isFailed())
//		//{
//		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//		//attach image file report(data, media type, name of the attachment)
//		scenario.attach(screenshot, "image/png", scenario.getName());
//		}

}
