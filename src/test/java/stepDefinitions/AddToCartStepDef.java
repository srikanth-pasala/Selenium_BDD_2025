package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FlipkartPages;

import java.io.IOException;

public class AddToCartStepDef {

    public FlipkartPages flipkartPages;
    public AddToCartStepDef() throws IOException {
        flipkartPages=new FlipkartPages();
    }

    @When("Click on the Mobiles at the top of the page")
    public void clickOnTheMobilesAtTheTopOfThePage() {
    }

    @Then("You will be redirected to the Mobiles page")
    public void youWillBeRedirectedToTHEMobilePage() {

    }

    @When("Click on the Apple Check box in the filter")
    public void clickOnTheAppleCheckBoxInTheFilter() {

    }


    @And("Click on the customer ratings {int}&Above in the filter")
    public void clickOnTheCustomerRatingsAboveInTheFilter(int arg0) {

    }


    @Then("Apple products with Customer ratings {int}&Above will be displayed in the page")
    public void appleProductsWithCustomerRatingsAboveWillBeDisplayedInThePage(int arg0) {

    }

    @When("Click on the Apple {int} Blue{double}Gb")
    public void clickOnTheAppleBlueGb(int arg0, int arg1) {
    }

    @Then("New Tab will be opened by displaying the Mobile Selected")
    public void newTabWillBeOpenedByDisplayingTheMobileSelected() {
    }

    @When("Scroll Down the page until bottom to verify the features of the mobile")
    public void scrollDownThePageUntilBottomToVerifyTheFeaturesOfTheMobile() {
    }

    @And("Click on the Add to cart Button")
    public void clickOnTheAddToCartButton() {
    }

    @Then("Mobile will be added to the cart")
    public void mobileWillBeAddedToTheCart() {
    }

    @When("To Re-check the items, Click on the cart symbol at the top right of the page")
    public void toReCheckTheItemsClickOnTheCartSymbolAtTheTopRightOfThePage() {
    }

    @Then("Items added in the cart will be displayed")
    public void itemsAddedInTheCartWillBeDisplayed() {
    }
}
