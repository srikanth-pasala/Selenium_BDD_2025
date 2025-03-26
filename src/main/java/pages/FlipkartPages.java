package pages;

import org.openqa.selenium.By;
import utils.GenericMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FlipkartPages {

    private final GenericMethods genericMethods;
    private static Properties properties;

    // Static block to load properties only once
    static {
        try {
            properties = new Properties();
            FileInputStream file = new FileInputStream("src/main/resources/locators/Flipkart.properties");
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load Flipkart properties file", e);
        }
    }

    public FlipkartPages() {
        this.genericMethods = GenericMethods.getInstance();
    }

    // Generic method to get locator from properties
    private By getLocator(String key) {
        return By.xpath(properties.getProperty(key));
    }

    public void searchTextInSearchBar(String text) {
        genericMethods.enterText(getLocator("searchBar"), text);
    }

    public void becomeASeller() {
        genericMethods.clickElement(getLocator("becomeASeller"));
    }

    public void sellOnline() {
        genericMethods.clickElement(getLocator("sellonline"));
    }

    public String getCurrentPageTitle() {
        return genericMethods.getTitle();
    }

    public void clickOnFirstResultsOfSearch() {
        genericMethods.clickElement(getLocator("firstProductInSearchResultsForMobiles"));
    }

    public boolean verifySpecifications() {
        By specHeader = getLocator("specifications_header");
        genericMethods.scrollToElement(specHeader);
        return genericMethods.isElementVisible(specHeader);
    }

    public void clickOnGoToCart() {
        genericMethods.clickElement(getLocator("GoToCart_button"));
    }

    public void verifyUserInMyCartPage() {
        // Implement verification logic if needed
    }

    public void clickOnBuyNowButton() {
        genericMethods.clickElement(getLocator("PlaceOrder_button"));
    }
}
