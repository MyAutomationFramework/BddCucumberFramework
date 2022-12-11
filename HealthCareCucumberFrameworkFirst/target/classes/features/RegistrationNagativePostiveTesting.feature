
Feature: Negative positve Functional testing  for ragistration 
  
Scenario Outline: Verify registration functinality with valid testdataonal
Given User launch browzer and navigate to the application
Then User can see homepage
When User click on Registration link
Then Validate Registratiob page url
 When User enter "<name>" and "<mobileNumber>" and "<email>"
 And User enter "<age>"
 And User Select country "<>"
 And User enter password "<password>" and "<confirmPassword>"
 And User  enter medical problem
 And User click on Registration button 
 Then Validate successful registation message
 And validate page??????????????
 
 
Scenario:Check country dropdown value and size

Scenario: Verify error message with empty field 

Scenario: Verify error message with invalid email id 







  