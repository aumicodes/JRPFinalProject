Feature: TC-4

  Scenario: Does customer appear in customer list
    Given I launch XYZ Bank website
    When I click Bank Manager Login
    And I click Open Account
    And I click Customer dropdown
    And I select John Doe
    And I click Currency dropdown
    And I select Pound
    And I click Process button
    Then I confirm account successfully created
