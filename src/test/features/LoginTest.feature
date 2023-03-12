Feature: Login Test

  @loginTest
  Scenario: Verify login with valid username and password combination

    Given I am on HomePage "https://www.saucedemo.com" with title "Swag Labs"
    When I do login with username "standard_user" and password "secret_sauce"
    Then I should land on products page with heading "Products"