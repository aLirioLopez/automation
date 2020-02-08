@summary_cart_functions
Feature: Summary cart options
  Check the summary cart page options

  Background:
    Given user go to summary cart page with products

  @Continue_shopping
  Scenario: Continue shopping
    When user clicks on continue shopping button
    Then the user go back to previous page

  @Continue_to_checkout
  Scenario: Continue to checkout
    When user clicks on continue to checkout button
    Then user go to login page

  @Add_one_unit_to_product
  Scenario: Add one unit to product
    When user clicks on plus button
    Then the product quantity increases by one

  @Subtract_one_unit_to_product
  Scenario: Subtract one unit to product
    And the product have more than one unit
    When user clicks on minus button
    Then the product quantity decreases by one

  @Add_units_to_product_manually
  Scenario Outline: Add one unit to product manually
    When user enter "<quantity>" units on quantity field
    Then the product quantity increases to "<result>"
    Examples:
    |quantity |result |
    |1        |2      |
    |10       |11     |

  @Subtract_units_to_product_manually
  Scenario Outline: Subtract one unit to product manually
    And the product have "<units>" unit
    When user enter "<quantity>" units on quantity field
    Then the product quantity decreases to "<result>"
    Examples:
      |units|quantity |result |
      |2    |1        |1      |
      |12   |10       |2      |

  @Enter_zero_units
  Scenario: Enter zero units manually
    When user enter zero units to quantity field
    And the product is deleted
    Then a message is displayed indicating that the car is empty

  @Delete_product_from_cart
  Scenario: Delete item from cart
    When user clicks on delete button
    And the product is deleted
    Then a message is displayed indicating that the car is empty