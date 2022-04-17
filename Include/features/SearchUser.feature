Feature: Search User Admin
  
  Scenario Outline: Search User Successfully
    Given User is at login page
    When User fills textbox with <username> and <password>
    And User clicks on login button
    When User navigate to homepage
    When User clicks Admin
    When User clicks Management 
    Then User is directed to Users page
    Then User Input Details with <usrname> and <employeeName> 
    Then User select option User Role and Status
    Then User clicks Search button

 Examples: 
      | username  | password | usrname       | employeeName | User Role | Status  |
      | Admin     | admin123 | AliyaY        | Aliya Yusof  | ESS       | Enabled |
      