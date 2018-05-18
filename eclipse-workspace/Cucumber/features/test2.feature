

 Feature: As a valid user when i enter my credentials, u should be able to login
  Scenario: As an editor i should be able to login to the app
    Given I have opera browser running 
    When I go to the website facebook
    And i enter valid username facebook
    And I enter valid password facebook
    When I click on the login button facebook
    Then I should see a logout link facebook

  