Feature: addToCart

  Background:
    Given I have logged in to the flipkart application

    @Positive
    Scenario: Validate and Verify add to cart
      When Click on the Mobiles at the top of the page
      Then You will be redirected to the Mobiles page
      When Click on the Apple Check box in the filter
      And Click on the customer ratings 4&Above in the filter
      Then Apple products with Customer ratings 4&Above will be displayed in the page
      When Click on the Apple 13 Blue,128Gb
      Then New Tab will be opened by displaying the Mobile Selected
      When Scroll Down the page until bottom to verify the features of the mobile
      And Click on the Add to cart Button
      Then Mobile will be added to the cart
      When To Re-check the items, Click on the cart symbol at the top right of the page
      Then Items added in the cart will be displayed
