@regression

Feature: Logged user could select different Categories

  Background: user opens chrome browser.
    #logged user start from home page directly

  # Test Scenario 8
  Scenario: logged user could select random category then sub-Category
    When user selects Electronics category from home page.
    And user selects cell phones as sub-Category.
  # Expected Result
    Then user returned to subcategory page.
    And subcategory page shows a cell phones.
