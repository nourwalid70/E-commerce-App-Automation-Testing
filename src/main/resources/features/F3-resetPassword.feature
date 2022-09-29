@regression

Feature: User could reset his/her password successfully

  Background: user opens chrome browser.
    And navigates to forget password page.

  # Test Scenario 4 >> positive scenario
  Scenario: user tries to reset the password from a valid email
    When user enters a valid Email.
    And user clicks on recover button.
  # Expected Result
    Then user could reset password successfully.


  # Test Scenario 5 >> negative scenario
  Scenario: user tries to reset the password from an invalid email
    When user enters an invalid Email.
    And user clicks on recover button.
  # Expected Result
    Then user could not reset password successfully.