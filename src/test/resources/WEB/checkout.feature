@checkout
Feature: Checkout

  @successful-checkout
  Scenario: User successfully checkout their items
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is directed to homepage
    And user click an item
    And user click add to cart
    And user click the cart button
    When user click the checkout button
    Then user is directed to the checkout page with title "Checkout: Your Information"
    And user input the first name with "Randy"
    And user input the last name with "Julian"
    And user input the zip code with "12345"
    When user click the continue button
    Then user is directed to the overview page with title "Checkout: Overview"
    When user click the finish button
    Then user should see confirmation message "Thank you for your order!"

  @unsuccessful-checkout
  Scenario: User unsuccessfully checkout their items because missing fields
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is directed to homepage
    And user click an item
    And user click add to cart
    And user click the cart button
    When user click the checkout button
    Then user is directed to the checkout page with title "Checkout: Your Information"
    And user input the first name with "Randy"
    And user input the last name with "Julian"
    And user input the zip code with ""
    When user click the continue button
    Then user see error message "Error: Postal Code is required"


