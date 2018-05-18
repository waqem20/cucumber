 Feature: As a valid user when i enter my credentials, u should be able to login
   @Chrome
  Scenario: As an editor i should be able to login to the app
    Given I have chrome brows/er running 
    When I go to the website 
    And i enter valid username 
    And I enter valid password 
    When I wait before i login in 
    Then I click on the login button  
@Opera
  Scenario: As an editor i should be able to login to the app
    Given I have chrome browser running 
    When I go to the website 
    And i enter valid username 
    And I enter valid password 
    When I wait before i login in 
    Then I click on the login button  
  
