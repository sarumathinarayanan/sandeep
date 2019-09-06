Feature:check


  @tag2
  Scenario Outline: checking
   Given use in login page
    When use search "<product>" 
    Then click searchh button
    And click addtocart button
    Then login page should display
    
    Examples: 
      | product |
      | hand |
      
