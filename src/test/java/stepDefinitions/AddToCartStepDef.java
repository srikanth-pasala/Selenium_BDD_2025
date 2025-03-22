package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FlipkartPages;

import java.io.IOException;

public class AddToCartStepDef {

    public FlipkartPages flipkartPages;
    public AddToCartStepDef() throws IOException {
        flipkartPages=new FlipkartPages();
    }
    @When("Enter the Flipkart URL in the Chrome Browser and hit Enter")
    public void enterTheFlipkartURL(){


    }

    @Then("Flipkart window will be opened in the Browser")
    public void flipkartWindowWillBeOpenedInTheBrowser() {

    }

    @When("Click on the Login Button in the top of the page")
    public void clickOnTheLoginButtonInTheTopOfThePage() {

    }

    @Then("Page will be redirected to the login screen")
    public void pageWillBeRedirectedToTheLoginScreen() {
    }

    @When("Click on Request OTP")
    public void clickOnRequestOTP() {
    }

    @When("Enter the received OTP")
    public void enterTheReceivedOTP() {
    }

    @Then("You will be redirected to the flipkart home screen showing your name beside the profile icon")
    public void youWillBeRedirectedToTheFlipkartHomeScreenShowingYourNameBesideTheProfileIcon() {
    }

    @When("Click on the search and enter the product you are looking")
    public void clickOnTheSearchAndEnterTheProductYouAreLooking() {
    }

    @When("Enter the Apple Mobile in the search bar")
    public void enterTheAppleMobileInTheSearchBar() {
    }

    @Then("Multiple Apple Products with different configurations displayed")
    public void multipleAppleProductsWithDifferentConfigurationsDisplayed() {
    }

    @When("Click on the Mobile Looking for")
    public void clickOnTheMobileLookingFor() {
    }

    @When("Clicked on the Apple IPhone {int} \\(Black{double}Gb)")
    public void clickedOnTheAppleIPhoneBlackGb(int arg0, int arg1) {
    }

    @Then("New Tab will be opened by displaying the Mobile Selected")
    public void newTabWillBeOpenedByDisplayingTheMobileSelected() {
    }

    @Then("Scroll Down the page until bottom to verify the features of the mobile")
    public void scrollDownThePageUntilBottomToVerifyTheFeaturesOfTheMobile() {
    }

    @When("Click on the Add to cart Button")
    public void clickOnTheAddToCartButton() {
    }

    @Then("Mobile will be added to the cart")
    public void mobileWillBeAddedToTheCart() {
    }

    @When("Once the account is created give the Mobile Email to login")
    public void onceTheAccountIsCreatedGiveTheMobileEmailToLogin() {
    }
}
