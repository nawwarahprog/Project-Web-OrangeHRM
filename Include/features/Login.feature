Feature: Login test
  
  Scenario Outline: Login with valid credentials
    Given User navigates to login page 
    When User enters <username> and <password> 
    And Click on login button
    Then User is navigated to homepage

    Examples: 
      | username  | password | 
      | Admin     | admin123 |
  
  Scenario Outline: Login with invalid credentials
    Given User navigates to login page 
    When User enters <username> and <password> 
    And Click on login button
    Then Alert user Invalid Account 

    Examples: 
      | username  | password | 
      | Test      | test123  |
  