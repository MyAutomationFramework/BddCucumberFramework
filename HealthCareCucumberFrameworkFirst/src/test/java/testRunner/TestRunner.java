package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
							// integrate full registration and login 
		features = 	//{"src/test/resource/features/Registration.feature","src/test/resource/features/login.feature"},
					         // onle registration
    		 		//{"src/test/resource/features/Registration.feature"},
		 					 // colcor	
						//{"src/test/resource/features/checkColor.feature"},
						
						//{"src/test/resource/features/menuBaarDropDownLinks.feature"},
		
			//{"src/test/resource/features/loginPositiveNegativeTesting.feature"},
						{"src/test/resource/features/navBaarLinks.feature"},
		 // glue={"stepDifinations"},
						glue= {"step"},
         
			
        plugin={
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-jason-reports/Cucumber.json",
                "html:target/cucumber-html-reports/cucumber.html",
                 "junit:target/cucumber-xml-reports/Cucumber.xml",
                "json:target/cucumber.json"},
        
        dryRun = false,
        monochrome = true
)
public class TestRunner {

}
//"json:target/cucumber.json"
// "json:target/cucumber-jason-reports/Cucumber.json" ,
  //"html:target/cucumber-html-reports/cucumber.html",
 // "junit:target/cucumber-xml-reports/Cucumber.xml",
 
  
//features = {"src/test/resource/features/Registration.feature","src/test/resource/features/login.feature"},