@regression
Feature: flipkart - Search and Buy Toy

  Background:
    Given I have logged in to the flipkart application

  @positive @smoke @sanity
  Scenario: Validate and verify the buying toy

    When I searched for a toy in the search bar
    Then I should see the search results as per my request
    When I selected the first toy in search results
    Then I should see specifications of the selected toy
    When I add the toy to my cart
    Then I should see the toy added to my cart
    When I clicked on the Buy Now button to buy the product
    Then I should see the payment window with total payable amount and multiple payment options
    When I click on Pay Now and complete the payment
    Then I should see a payment successful and order confirmed message
