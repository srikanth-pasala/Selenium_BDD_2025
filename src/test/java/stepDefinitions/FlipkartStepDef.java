package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BrowserFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FlipkartStepDef {
    public BrowserFactory browserFactory;
    public FlipkartStepDef() throws IOException {
        browserFactory=new BrowserFactory();

    }


    @Given("I have logged in to the flipkart application")
    public void logInToTheFlipkart()  {
        //open the browser first
        // navigate flipkart url
        // login to application
        // We will write selenium java code to login to application

        browserFactory.launchBrowser();
        browserFactory.goToUrl("https://www.flipkart.com/");
        //enter credentials
        //click on login button
    }

    @Then("I should see specifications to the selected Washing machine")
    public void iShouldSeeSpecificationsToTheSelectedWashingMachine()  {

    }

    @When("I searched for the mobiles in search bar")
    public void iSearchedForTheMobilesInSearchBar() {

    }

    @Then("I should see the search results as per my request")
    public void iShouldSeeTheSearchResultsAsPerMyRequest() {
    }

    @When("I selected the first mobile in search results")
    public void iSelectedTheFirstMobileInSearchResults() {

    }

    @Then("I should see specifications to the selected mobile")
    public void iShouldSeeSpecificationsToTheSelectedMobile() {

    }

    @When("I add the mobile to my cart")
    public void iAddTheMobileToMyCart() {
    }

    @Then("I should see the mobile added to my cart")
    public void iShouldSeeTheMobileAddedToMyCart() {
    }

    @When("I clicked on Buy now button to buy the product")
    public void iClickedOnBuyNowButtonToBuyTheProduct() {
    }

    @Then("I should the see the payment window with total payable amount and mutiple payment options")
    public void iShouldTheSeeThePaymentWindowWithTotalPayableAmountAndMutiplePaymentOptions() {
    }

    @When("I click on pay now and completed the payment.")
    public void iClickOnPayNowAndCompletedThePayment() {
    }

    @Then("I should see payment successful and order confirmed message")
    public void iShouldSeePaymentSuccessfulAndOrderConfirmedMessage() {
    }

    @When("I searched for the Washing machine in search bar")
    public void iSearchedForTheWashingMachineInSearchBar() {
    }

    @When("I selected the first Washing machine in search results")
    public void iSelectedTheFirstWashingMachineInSearchResults() {
    }

    @When("I add the Washing machine to my card")
    public void iAddTheWashingMachineToMyCard() {
    }

    @Then("I should see the Washing machine added to my cart")
    public void iShouldSeeTheWashingMachineAddedToMyCart() {
    }
}
