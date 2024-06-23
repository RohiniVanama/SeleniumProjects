#Author: RohiniVanama
@tag
Feature: Testing HomePage of amazon.in

  @Smoke
  Scenario: Verify if user is able to load website of Amazon successfully
    When I launch URL for amazon
    Then I verify the title of page is displayed as expected
    Then I Verify if SignIn Link is displayed
    Then I calculate total number of links present on the webpage
    Then I Verify if default language is English
    Then I Verify the logo text present on homepage is as expected
    
  
    

 