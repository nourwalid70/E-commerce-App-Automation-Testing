@regression

Feature: Logged user could select different tags

  Background: user opens chrome browser.
    #logged user start from home page directly

  # Test Scenario 10
  Scenario: logged user could select different tags after choosing Category
    When user selects Electronics category from home page.
    And user selects a compact tag.
  # Expected Result
    Then user returned to products with compact tag.
    And products tagged with compact title will be appeared.