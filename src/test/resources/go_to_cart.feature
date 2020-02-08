@go_to_cart_feature
Feature: Go to cart options
  Check the user options to go to cart from homepage

  Background:
    Given user is on homepage

  @Go_to_cart_with_no_products
  Scenario: Go to cart with no products
    And the cart is empty
    When user clicks on cart
    And user is on summary cart page
    Then a message is displayed indicating that the car is empty

  @Go_to_cart_with_products
  Scenario: Go to cart with products
    And the cart have products
    When user clicks on cart
    And user is on summary cart page
    Then there are products in summary cart