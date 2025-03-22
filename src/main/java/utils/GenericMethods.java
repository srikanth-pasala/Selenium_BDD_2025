package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class GenericMethods {

    private WebDriver driver;
    private WebDriverWait wait;

    public GenericMethods() {
        BrowserFactory browserFactory=new BrowserFactory();
        this.driver = browserFactory.launchBrowser();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Default wait time
    }

    /** Click an element */
    public void clickElement(By locator) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        } catch (TimeoutException e) {
            throw new RuntimeException("Element not clickable: " + locator, e);
        }
    }

    /** Enter text into an input field */
    public void enterText(By locator, String text) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.clear();
            element.sendKeys(text);
        } catch (TimeoutException e) {
            throw new RuntimeException("Unable to enter text in: " + locator, e);
        }
    }

    /** Get text from an element */
    public String getText(By locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        } catch (TimeoutException e) {
            throw new RuntimeException("Unable to get text from: " + locator, e);
        }
    }

    /** Check if an element is visible */
    public boolean isElementVisible(By locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    /** Select a value from a dropdown */
    public void selectFromDropdown(By locator, String value) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(locator));
        dropdown.sendKeys(value);
    }

    /** Get a list of WebElements */
    public List<WebElement> getElements(By locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    /** Scroll to an element */
    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /** Take a screenshot */
    public void takeScreenshot(String filename) {
        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("screenshots/" + filename + ".png");
            srcFile.renameTo(destFile);
            System.out.println("Screenshot saved: " + destFile.getAbsolutePath());
        } catch (Exception e) {
            throw new RuntimeException("Failed to take screenshot", e);
        }
    }

    /** Switch to a new tab */
    public void switchToNewTab() {
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
    }

    /** Close the current tab */
    public void closeCurrentTab() {
        driver.close();
    }

    /** Accept an alert */
    public void acceptAlert() {
        try {
            wait.until(ExpectedConditions.alertIsPresent()).accept();
        } catch (TimeoutException e) {
            throw new RuntimeException("No alert found to accept", e);
        }
    }

    /** Dismiss an alert */
    public void dismissAlert() {
        try {
            wait.until(ExpectedConditions.alertIsPresent()).dismiss();
        } catch (TimeoutException e) {
            throw new RuntimeException("No alert found to dismiss", e);
        }
    }

}
