	 Feature: Verify menubar drop down  link are presenrt and check sub menu list name and size
	  
	 
#Scenario: Verify  manubar  links are present
#Given I start application
#Then Validate links present and check link size

 
	    #  Treamant drop down 
Scenario: Verify Treatment dropdown sub menu links name and size
Given User open application
Then Validate homePage url
When user mouse hover on Treament dropdown link in menu baar
Then Validate sub menu links name and size






#Scenario: Verify Treatment dropdown  sub menu links not broken
#Scenario: Verify user able to click any specific  sub menu link 
#  
