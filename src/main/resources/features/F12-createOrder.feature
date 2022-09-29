@regression

Feature: Create successful Order

  Background: user opens chrome browser.
    #logged user start from home page directly

  # Test Scenario 14
  Scenario: logged user could add products to shopping cart then create successful order.
    When user selects Electronics category from home page.
    And user selects cell phones as sub-Category.
    And user clicks on add to cart button for the first product.
  # Expected Result
    Then the message of adding to cart will appear.

    And user clicks on shopping cart button.
  # Expected Result
    Then user returned to shopping cart page.

    And user marks the checkbox of agreement.
    And user clicks on checkout button.
  # Expected Result
    Then user returned to checkout page.

    And user enters his country.
    And user enters his city.
    And user enters his address.
    And user enters zip or postal code.
    And user enters his phone number.
    And user clicks on continue button at billing address.
    And user clicks on continue button at shipping method.
    And user clicks on continue button at payment method.
    And user clicks on continue button at payment information.
    And user clicks on confirm button.
  # Expected Result
    Then user returned to checkout completed page.
    And creating order successfully message appears.