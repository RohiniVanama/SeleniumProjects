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
@tag
Feature: Title of your feature
  I want to use this template for my feature file

   @Smoke
  Scenario Outline: Verify if error is displayed when user tries to login with invalid userid
    Given I launch URL for amazon
    When I Click on Signin
    Then I login with incorrect "<userid>" and verify if expected "<error>" is displayed

    Examples: 
      |userid|   |error| 
      |admin|   |Invalid email address.| 
      |1234|    |Invalid mobile number|
 