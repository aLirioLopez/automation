@add_feature
Feature: Add to cart functions
	Check if user is able to add one product to cart

  Background:
    Given user is on homepage
    When user go to product page

  @Add_to_cart
  Scenario: Add to cart
    And user clicks on add to cart
    Then one product is added to cart

  @Add_to_cart_plus
  Scenario: Add to cart plus one
    And user clicks on add a unit
    And user clicks on add to cart
    Then multiple units are added to cart

  @Add_to_cart_minus
  Scenario: Add to cart minus one
    And user clicks on subtract a unit
    And user clicks on add a unit
    And user clicks on add to cart
    Then one product is added to cart

  @Quantity_field_function
  Scenario Outline: Test quantity field with valid and invalid data
    And user enter "<quantity>" units on quantity field
    And user clicks on add to cart
    Then the "<result>" is displayed on screen
    Examples:
      | quantity  | result    |
      | 0         | Error     |
      | 10        | OK        |

  @Add_to_cart_changing_size
  Scenario Outline: Add to cart changing size
    And user select different "<size>" from combo
    And user clicks on add to cart
    Then one product is added to cart
    Examples:
      |size |
      |S    |
      |M    |
      |L    |

  @Add_to_cart_changing_color
  Scenario Outline: Add to cart changing color
    And user select different "<color>"
    And user clicks on add to cart
    Then one product is added to cart
    Examples:
      |color     |
      |orange    |
      |blue      |