package hooks;

import io.cucumber.java.After;
import utils.BrowserFactory;

public class Hooks {

    private BrowserFactory browserFactory = new BrowserFactory();

    @After
    public void tearDownScenario() {
        browserFactory.quitDriver();
        System.out.println("WebDriver closed after scenario execution.");
    }
}
