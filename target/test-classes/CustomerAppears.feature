Feature: TC-2

  Scenario: Does customer appear in customer list
    Given I launch XYZ Bank website
    When I click Bank Manager Login
    And I click Customers button
    And I scroll to the bottom of the page
    Then I confirm John Doe is in the list of customers
