Feature: addToCart

  Background:
    Given I have logged in to the flipkart application

    @Positive
    Scenario: Validate and Verify add to cart
      When Enter the Flipkart URL in the Chrome Browser and hit Enter
      Then Flipkart window will be opened in the Browser
      When Click on the Login Button in the top of the page
      Then Page will be redirected to the login screen
      When Once the account is created give the Mobile/Email to login
      When Click on Request OTP
      When Enter the recieved OTP
      Then You will be redirected to the flipart home screen showing your name beside the profile icon
      When Click on the search and enter the product you are looking
      When Enter the Apple Mobile in the serach bar
      Then Multiple Apple Products with different configurations dispalyed
      When Click on the Mobile Looking for
      When Clicked on the Apple IPhone 13 (Black,128Gb)
      Then New Tab will be opened by displaying the Mobile Selected
      Then Scroll Down the page until bottom to verify the features of the mobile
      When Click on the Add to cart Button
      Then Mobile will be added to the cart