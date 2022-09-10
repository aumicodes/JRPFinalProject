Feature: TC-3

  Scenario: Does customer appear in customer list
    Given I launch XYZ Bank website
    When I click Bank Manager Login
    And I click Open Account
    And I click Customer dropdown
    And I select John Doe
    And I click Currency dropdown
    And I select Dollar
    And I click Process button

