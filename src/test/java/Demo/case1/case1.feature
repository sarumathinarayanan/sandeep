
Feature: Register

  Scenario: Register the TestMeApp 
  Given User open the application
  When User click sign_up button to register
  And User enters the username as "saru1234567"
  And User enters first name as "sarumathi"
  And User enters last name as "naren"
  And User enters password as "sar3445"
  And User enters confirm password as "sar3445"
  And User enters gender as female
  And User enters email as "saru@gmail.com"
  And User enters mobile number as "9876645467"
  And User enters dob as "05/01/1998"
  And User enters address as "pudukkotai"
  And User enters security question
  And User enters answer as "chennai"
  And User click register button
  Then Login Page will display
  
  
 