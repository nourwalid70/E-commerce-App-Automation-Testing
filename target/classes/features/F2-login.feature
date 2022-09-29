@regression

Feature: User could log in with valid email and password

  Background: user opens chrome browser.
    And navigates to login page.

  # Test Scenario 2 >> positive scenario
  Scenario: user login with valid email and password
    When user enters Email "tester55@yahoo.com"
    And  user enters password "1203@N"
    And user clicks on log in button.
  # Expected Result
    Then user could login successfully.
    And user returned to home page.


  # Test Scenario 3 >> negative scenario
  Scenario: user login with invalid email and password
    When user enters Email "tester@gmail.com"
    And  user enters password "1234@n"
    And user clicks on log in button.
  # Expected Result
    Then user could not login successfully.