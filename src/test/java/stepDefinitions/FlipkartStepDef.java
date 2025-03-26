package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.FlipkartPages;
import utils.BrowserFactory;
import utils.GenericMethods;

public class FlipkartStepDef {
    private final GenericMethods genericMethods;
    private final FlipkartPages flipkartPages;
    private final BrowserFactory browserFactory;

    public FlipkartStepDef() {
        this.browserFactory = BrowserFactory.getInstance();
        this.genericMethods = new GenericMethods();
        this.flipkartPages = new FlipkartPages();
    }

    @Given("I have logged in to the flipkart application")
    public void logInToTheFlipkart() {
        BrowserFactory.launchBrowser();
        browserFactory.goToUrl("https://www.flipkart.com/");
    }

    @When("I searched for the {string} in search bar")
    public void iSearchedForTheMobilesInSearchBar(String text) {
        flipkartPages.searchTextInSearchBar(text);
    }

    @Then("I should see the search results as per my request with title {string} of the page")
    public void iShouldSeeTheSearchResultsAsPerMyRequest(String title) {
        String actualTitle = flipkartPages.getCurrentPageTitle();
        Assert.assertTrue(actualTitle.contains(title), "Expected title to contain: " + title + " but found: " + actualTitle);
    }

    @When("I selected the first mobile in search results")
    public void iSelectedTheFirstMobileInSearchResults() {
        flipkartPages.clickOnFirstResultsOfSearch();
    }

    @Then("I should see specifications to the selected mobile")
    public void iShouldSeeSpecificationsToTheSelectedMobile() {
        Assert.assertTrue(flipkartPages.verifySpecifications(), "Specifications not displayed.");
    }

    @When("I add the mobile to my cart")
    public void iAddTheMobileToMyCart() {
        flipkartPages.clickOnGoToCart();
    }

    @Then("I should see the mobile added to my cart")
    public void iShouldSeeTheMobileAddedToMyCart() {
        Assert.assertTrue(flipkartPages.getCurrentPageTitle().contains("Shopping Cart"),
                "Expected Shopping Cart page but found: " + flipkartPages.getCurrentPageTitle());
        flipkartPages.verifyUserInMyCartPage();
    }

    @When("I clicked on Buy now button to buy the product")
    public void iClickedOnBuyNowButtonToBuyTheProduct() {
        flipkartPages.clickOnBuyNowButton();
    }

    @Then("I should see the payment window with total payable amount and multiple payment options")
    public void iShouldSeeThePaymentWindowWithTotalPayableAmountAndMultiplePaymentOptions() {
        // Implement validation for the payment window
    }

    @When("I click on pay now and completed the payment.")
    public void iClickOnPayNowAndCompletedThePayment() {
        // Implement payment logic
    }

    @Then("I should see payment successful and order confirmed message")
    public void iShouldSeePaymentSuccessfulAndOrderConfirmedMessage() {
        // Implement order confirmation validation
    }

    @When("I searched for the Washing machine in search bar")
    public void iSearchedForTheWashingMachineInSearchBar() {
        flipkartPages.searchTextInSearchBar("Washing Machine");
    }

    @When("I selected the first Washing machine in search results")
    public void iSelectedTheFirstWashingMachineInSearchResults() {
        flipkartPages.clickOnFirstResultsOfSearch();
    }

    @When("I add the Washing machine to my cart")
    public void iAddTheWashingMachineToMyCart() {
        flipkartPages.clickOnGoToCart();
    }

    @Then("I should see the Washing machine added to my cart")
    public void iShouldSeeTheWashingMachineAddedToMyCart() {
        Assert.assertTrue(flipkartPages.getCurrentPageTitle().contains("Shopping Cart"),
                "Expected Shopping Cart page but found: " + flipkartPages.getCurrentPageTitle());
        flipkartPages.verifyUserInMyCartPage();
    }
}
