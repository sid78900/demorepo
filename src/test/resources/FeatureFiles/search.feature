Feature: functionality of search scenario

  @Search @one
  Scenario: verify weather the user is able to search for products
    Given I launch the the application
    When I search for a product "samsung syncmaster 941bw"
    Then I should see the product in the search results
    
@Search @two
  Scenario: verify weather the user is informed when the product being searched is not avilable
    Given I launch the the application
    When I search for a product "Apple iphone"
    Then I should see a message informing "your shopping card is empty" 
    