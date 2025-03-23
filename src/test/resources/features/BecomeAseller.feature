Feature: Validate become a seller functionality

  Background:
    Given I have logged in to the flipkart application

  @Become_a_Seller
  Scenario: Verifying the functionalities of seller

    When i clicked on Become a seller
    Then i should see a title displayed as sell online with flipkart
    When i selected sell online
    Then i should be able to select help and support
    When i clicked on Help and support
    Then i should navigate to help and support section




