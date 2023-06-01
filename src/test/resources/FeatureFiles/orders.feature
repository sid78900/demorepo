Feature: End to end scenarios for placing order
 Scenario: varify weather user is able to place order
 Given I login to the application
     When I add a product to bag and checkout
     And I place order
     Then I should see order placed succesully 
     
