@complete_process
Feature: Complete purchase process

  Background:
    Given user go to summary cart page with products
    And user clicks on continue to checkout button
    And user go to login page

  @purchase_one_product
  Scenario Outline: Purchase one product
    And user creates or login with "<account>"
    Then user should see the addresses page
    And update or create a new "<address>"
    When user go to shipping page accepting the shipping conditions
    And go to payment page selecting "<payment_method>"
    And confirm the order
    Then a success purchase message should be displayed
    Examples:
      |account|address|payment_method|
      |new    |new    |bank          |
      |login  |update |check         |


