package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProducts {

    @When("I searched for a toy in the search bar")
    public void searchToy(){

    }
    @When("I selected the first toy in search results")
    public void searchResults(){

    }
    @When("I should see specifications of the selected toy")
    public void selectedToy(){

    }

    @When("I add the toy to my cart")
    public void iAddTheToyToMyCart() {
    }

    @Then("I should see the toy added to my cart")
    public void iShouldSeeTheToyAddedToMyCart() {
    }

    @When("I clicked on the Buy Now button to buy the product")
    public void iClickedOnTheBuyNowButtonToBuyTheProduct() {
    }

    @When("I click on Pay Now and complete the payment")
    public void iClickOnPayNowAndCompleteThePayment() {
    }

    @Then("I should see a payment successful and order confirmed message")
    public void iShouldSeeAPaymentSuccessfulAndOrderConfirmedMessage() {
    }
}
