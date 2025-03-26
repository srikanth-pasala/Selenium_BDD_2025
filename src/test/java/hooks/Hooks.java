package hooks;

import io.cucumber.java.After;
import utils.BrowserFactory;

public class Hooks {

    @After
    public void tearDownScenario() {
        try {
            BrowserFactory.getInstance().quitDriver();
            System.out.println("WebDriver closed after scenario execution.");
        } catch (Exception e) {
            System.err.println("Error while closing WebDriver: " + e.getMessage());
        }
    }
}
