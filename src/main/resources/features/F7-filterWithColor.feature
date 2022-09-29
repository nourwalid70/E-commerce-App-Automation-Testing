@regression

Feature: Logged user could filter with color

  Background: user opens chrome browser.
    #logged user start from home page directly

  # Test Scenario 9
  Scenario: logged user could filter with red color in shoes sub-Category
    When user selects Apparel category from home page.
    And user selects shoes as sub-Category.
    And user selects a red checkbox.
  # Expected Result
    Then shoes will be filtered by red color.