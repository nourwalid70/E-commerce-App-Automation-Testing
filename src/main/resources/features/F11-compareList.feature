@regression

Feature: Logged user could add different products to compare list

  Background: user opens chrome browser.
    #logged user start from home page directly

  # Test Scenario 13
  Scenario: logged user could add products to compare list and start to compare between them.
    When user selects Electronics category from home page.
    And user selects cell phones as sub-Category.
    And user clicks on add to compare list button for the first product.
  # Expected Result
    Then the message of adding to compare list will appear.

    And user clicks on add to compare list button for the second product.
  # Expected Result
    Then the message of adding to compare list will appear.

    And user clicks on product comparison button in appearing message.
  # Expected Result
    Then user returned to compare list page.
    And products will exist.

    And user clicks on clear list button.
  # Expected Result
    Then the list of products will be empty.
