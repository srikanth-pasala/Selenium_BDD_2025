@regression
Feature: Flipkart


  @positive @sanity @smoke
  Scenario: Validate and verify the buying mobile phone
    Given I have logged in to the flipkart application
    When I searched for the "mobiles" in search bar
    Then I should see the search results as per my request with title "Mobiles" of the page
    When I selected the first mobile in search results
    Then I should see specifications to the selected mobile
    When I add the mobile to my cart
    Then I should see the mobile added to my cart
    When I clicked on Buy now button to buy the product
    Then I should the see the payment window with total payable amount and mutiple payment options
    When I click on pay now and completed the payment.
    Then I should see payment successful and order confirmed message
    And  I quit the browser


  @smoke
  Scenario: Validate and verify the buying washing machine
    Given I have logged in to the flipkart application
    When I searched for the Washing machine in search bar
    Then I should see the search results as per my request with title "Washing Machine" of the page
    When I selected the first Washing machine in search results
    Then I should see specifications to the selected Washing machine
    When I add the Washing machine to my card
    Then I should see the Washing machine added to my cart
    When I clicked on Buy now button to buy the product
    Then I should the see the payment window with total payable amount and mutiple payment options
    When I click on pay now and completed the payment.
    Then I should see payment successful and order confirmed message
    And  I quit the browser
