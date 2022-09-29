@regression

Feature: Logged user could add different products to Shopping cart

  Background: user opens chrome browser.
    #logged user start from home page directly

  # Test Scenario 11
  Scenario: logged user could add products to shopping cart and remove them if want.
    When user selects Electronics category from home page.
    And user selects cell phones as sub-Category.
    And user clicks on add to cart button for the first product.
  # Expected Result
    Then the message of adding to cart will appear.

    And user clicks on shopping cart button.
    # Expected Result
    Then user returned to shopping cart page.
    And added products to shopping cart will exist.

    Then user clicks on remove button for existing product.
    And the number of products in cart will be zero.

