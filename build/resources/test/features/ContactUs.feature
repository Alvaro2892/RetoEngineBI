Feature: As a user interested in EngineBI services
  I want to access the companys website and fill out the contact us form
  to verify if this flow is functional

  Scenario: Fill out the contact us form on the EngineBI website
    Given that the user is on the EngineBI homepage
    When the user selects the contact us option, they should be able to fill out the form
      | firstName | lastName       | reason             | email         |
      | Test      | test last name | Become An Employee | test@test.com |
    Then the user should see the confirmation message "Thanks for reaching out!"