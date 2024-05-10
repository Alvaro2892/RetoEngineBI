Feature: As a user of the page
  I want to obtain a free account
  to test the services offered

  Scenario: Get a free account on EngineBI
    Given that the user is on the EngineBI homepage
    When the user goes to the free account and fills out the form
      | firstName | lastName       | email          | phone      |
      | TestCom   | test last name | test5@test.com | 2223222222 |
    Then the user should see the next confirmation message "Your 30 Day Free Trial subscription has been successfully completed!"
