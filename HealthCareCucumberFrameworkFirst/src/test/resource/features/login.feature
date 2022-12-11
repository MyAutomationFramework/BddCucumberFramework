Feature: Verify Login and Logout

  Scenario: Verify login with  valid credentials
    When User click on redlogin button
    Then validate login page url
    When User entered  emaili Id
    And User entered Password
    And User click on sign in button
    Then validate home page url
    And validate text Treament package
    And validate usename
    
    When mousehover on element
    And click on logout link
    Then  verify user should logout
    
