Feature: Automation Practice End to End Test automation scenario
This feature file includes



Scenario: Verify whether user has valid login credentials
Given User hit the Automation practice website	
When User click on Signin button in Header

And User enter the email id 'jaisampathkumar94@gmail.com' in the login page
And User enter the Password 'jaikumar' in the login page
 Then User verifies the email id entered
 And User verifies the password entered
 Then User click on Login Button in the Login Page
 And User verifies Login Button clicked in Login Page
 Then User verifies the Username 'jaikumar' present in the header of main Page 
 
 

