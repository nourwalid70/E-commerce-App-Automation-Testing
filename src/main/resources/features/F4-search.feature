@regression

Feature: Logged User could search for any product

  Background: user opens chrome browser.
    #logged user start from home page directly

  # Test Scenario 6
  Scenario: logged user tries to search about any product
    When user enters a search words in the search text field.
    And user clicks on search button.
  # Expected Result
    Then user returned to search page.
