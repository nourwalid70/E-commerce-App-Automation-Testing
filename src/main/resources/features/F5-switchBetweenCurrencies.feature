@regression

Feature: Logged User could switch between currencies US-Euro

  Background: user opens chrome browser.
    #logged user start from home page directly

  # Test Scenario 7
  Scenario: logged user tries to switch between currencies US-Euro after searching about any product
    When user enters a search words in the search text field.
    And user clicks on search button.
    And user click on the list of currencies.
    And user chooses Euro currency.
  # Expected Result
    Then the price of products changes to Euros.

    And user click on the list of currencies.
    And user chooses US Dollar currency.

  # Expected Result
    Then the price of products changes to US Dollar.