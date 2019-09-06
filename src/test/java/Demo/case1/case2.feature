
Feature: Login

  Scenario Outline: login_test
    Given user in login pag 
    When  user clicks signin button
    And user enters una "<username>" 
    And user enters passwor "<password>" 
    Then click login
    
    Examples: 
      | username  | password | 
      | Lalitha |     password123 | 
    