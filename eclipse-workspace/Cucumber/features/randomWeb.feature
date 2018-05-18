#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: I should be able to sign in to website

  
  Scenario: Go on to website and look for elements
    Given find the path 
    When I go onto orange website
    And I will then add username and password inputs
    | Admin | admin |
    And I will then click the sign in button 
    Then I will click the pim button to add employees
    And I will add firstname and last name
    | big | daddy |
    Then I will click save button
    Then I will click the edit button
		And I will add extra infomation 
		Then I will make sure logo is dispayed
		Then I will add screenshots
 