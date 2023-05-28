Feature: login functinonality scenarios

  @Login @one
  Scenario: Verify weather user is able to login with valid credentials
    Given I launch the application
    And Navigate to account login page
    When I login to the application using Username "ravi.kiran1@gmail.com" and Password "rkiran"
    Then I should see that the User is able to successfully login

  @Login @Two
  Scenario: Verify that the User is not able to login with invalid credentials
    Given I launch the application
    And I naviage to Account Login page
    When I login to the application using Username "ravi.kiran99@gmail.com" and Password "rkiran99"
    Then I should see an error message informing the User about invalid credentials
