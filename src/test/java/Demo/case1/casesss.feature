Feature: add to cart


  Scenario Outline: adding to cart 
    Given user in login page 
    When user clicks signin
    And user enter un "<username>" 
    And user enter pass "<password>" 
    And user clicks login page
    When user search "<product>" 
    Then click search button

    Examples: 
      | username  | password | product  |
      | Lalitha |     Password123 | hand |
     
