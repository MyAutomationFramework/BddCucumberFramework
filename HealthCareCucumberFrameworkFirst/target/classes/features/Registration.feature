Feature: Verify Registration Functionality

  Scenario: Verify  registration  form with  valid TestData
    #Given User open browzer
    And User open url
    Then validate url open
    And User click on maxmize icon
    When User click on registerLink
    Then User should redirect to registrationPage
    When User enter name
    And User enter mobileNo
    And User enter email
    And User enter patientage
    And User select country
    And User enter password
    And User enter confirmPassword
    And User enter medicalProblem
    And scrollbaar  down
    And User click on RegisterBtn
  #  Then validate loginRed button present on the page
   # And page should redirected to confirmationPage
