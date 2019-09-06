Feature: Login

  Scenario Outline: Login
   Given the logi display
   Then user enters th usrname "<username>" 
   Then user enters th pswrd "<password>" 
   Then click logi
    Examples: 
      | username | password    | 
      | Lalitha  | password123 | 
    
