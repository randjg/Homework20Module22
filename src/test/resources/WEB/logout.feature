@logout
Feature: Logout

  Scenario: User successfully logout from their account
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is directed to homepage
    When user click hamburger button
    Then user click logout button
    Then user is on login page
