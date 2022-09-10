Feature: TC-1

  Scenario: Add a new customer
    Given I launch XYZ Bank website
    When I click Bank Manager Login
    And I click Add Customer
    And I enter First Name
    And I enter Last Name
    And I enter Post Code
    And I confirm Add Customer
