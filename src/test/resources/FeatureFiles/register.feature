Feature: Registration functonality scenario

  @Register @one
  Scenario: varify registrtion
    Given launch the application
    And navigate to registrtion page
    When when i fill below all valid details
      | FirstName | Ravi           |
      | LastName  | kiran          |
      | Email     | ravi@gmail.com |
      | telephone |      123467965 |
      | password  | ssdssc65       |
    And select privacy policy
    And click on continue button
    Then I should see that the user account has been create succesfully

  @Register @Two
  Scenario: Verify whether the user is not allowed to register on skipping mandatory fields
    Given I launch the application
    And I navigate to Account Registration page
    When I click on Continue button
    Then I should see that the User Account is not created
    And I should see the error messages informing the user to fill the mandatory fields

  @Register @Three
  Scenario: Verify whether the user is able to register into the application by opting for Newsletter subscription
    Given I launch the application
    And I navigate to Account Registration page
    When when i fill below all valid details
      | FirstName | Ravi           |
      | LastName  | kiran          |
      | Email     | ravi@gmail.com |
      | telephone |      123467965 |
      | password  | ssdssc65       |
    And I subscrib to Newsletter
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see that the User Account has successfully created
