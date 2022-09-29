@regression

Feature: User could register with valid data

  Background: user opens chrome browser.
    And navigates to registration page.

  # Test Scenario 1
  Scenario: user registers with valid data.
    When user select gender type.
    And user enters valid firstName.
    And user enters valid lastName.
    And user select valid date of birth.
    And user enters valid Email.
    And user enters valid password.
    And user enters the same valid password again.
    And user clicks on register button.
  # Expected Result
    Then user could register successfully.
    And user returned to register result page.
