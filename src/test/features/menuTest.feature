Feature: Verify Menu

  As a user
  I should get redirected appropriately

  @menu @regression
  Scenario Outline: Verify menu redirection
    Given I am on Home Page "https://www.johnlewis.com/" with title ""
    When I click Menu option "<Menu>"
    Then I should get redirected to appropriate product page with heading "<Page Heading>"

    Examples:

      | Menu               | Page Heading       |
      | Home & Garden      | HOME & GARDEN      |
      | Furniture & Lights | FURNITURE & LIGHTS |
      | Electricals        | ELECTRICALS        |
      | Women              | WOMEN              |
      | Men                | MEN                |

  @submenu
  Scenario Outline: Verify sub menu redirection

    Given I am on Home Page "https://www.johnlewis.com/" with title ""
    When I click mouseover menu "<Menu>"
    And I click on Submenu option "<SubMenu>"
    Then I should get redirected to appropriate product page with heading "<Page Heading>"

    Examples:
      | Menu               | SubMenu           | Page Heading      |
      | Home & Garden      | Living Room       | Living Room       |
      | Home & Garden      | Dining Room       | Dining Room       |
      | Furniture & Lights | Sofas & Armchairs | Sofas & Armchairs |