@regression

Feature: Logged user could add different products to Wishlist

  Background: user opens chrome browser.
    #logged user start from home page directly

  # Test Scenario 12
  Scenario: logged user could add products to wishlist and update quantity if want.
    When user selects Electronics category from home page.
    And user selects cell phones as sub-Category.
    And user clicks on add to wishlist button for the first product.
  # Expected Result
    Then the message of adding to wishlist will appear.

    And user clicks on wishlist button.
    # Expected Result
    Then user returned to wishlist page.
    And added products to wishlist will exist.
    Then user changes quantity to 3 items.
    And user clicks on update wishlist button.
    And the number of products in wishlist will be three.