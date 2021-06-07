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
@Login
Feature: Login feature
  As a User I want to login to eCharta system
  So that I can chcek the system
  @Valid
  Scenario Outline: Login with valid credentials
    Given I navigate to the system
    When I enter <Username> and <Password>
    And I click <Login> button
    Then I should be able to login successfully

    Examples: 
      |   Username     | Password  |
      |   LGulawani    | Speak2me#2|
      