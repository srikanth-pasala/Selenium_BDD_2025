package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FlipkartPages;


public class BecomeASeller {
    @When("i clicked on Become a seller")
    public void iClickedOnBecomeASeller() {
        FlipkartPages.becomeAseller


    }

    @Then("i should see a title displayed as sell online with flipkart")
    public void iShouldSeeATitleDisplayedAsSellOnlineWithFlipkart() {
        FlipkartPages.sellonline

    }

    @When("i selected sell online")
    public void iSelectedSellOnline() {

    }

    @Then("i should be able to select help and support")
    public void iShouldBeAbleToSelectHelpAndSupport() {



    }

    @When("i clicked on Help and support")
    public void iClickedOnHelpAndSupport() {

    }

    @Then("i should navigate to help and support section")
    public void iShouldNavigateToHelpAndSupportSection() {

    }
}

