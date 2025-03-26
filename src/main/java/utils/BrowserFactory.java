package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserFactory {

    private static BrowserFactory instance;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static Properties properties;

    /** Private constructor to prevent instantiation */
    private BrowserFactory() {
        try {
            properties = new Properties();
            FileInputStream file = new FileInputStream("src/main/resources/config.properties");
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties file", e);
        }
    }

    /** Singleton instance getter */
    public static BrowserFactory getInstance() {
        if (instance == null) {
            synchronized (BrowserFactory.class) {
                if (instance == null) {
                    instance = new BrowserFactory();
                }
            }
        }
        return instance;
    }

    /** Launch Browser */
    public static void launchBrowser() {
        if (driver.get() == null) {
            String browser = properties.getProperty("browser").toLowerCase();

            switch (browser) {
                case "chrome":
                    driver.set(new ChromeDriver());
                    break;
                case "edge":
                    driver.set(new EdgeDriver());
                    break;
                case "firefox":
                    driver.set(new FirefoxDriver());
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported browser: " + browser);
            }

            WebDriver webDriver = driver.get();
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

    /** Get WebDriver instance */
    public static WebDriver getDriver() {
        if (driver.get() == null) {
            launchBrowser();
        }
        return driver.get();
    }

    /** Open a URL */
    public void goToUrl(String url) {
        getDriver().get(url);
    }

    /** Navigate to a URL */
    public void navigateTo(String url) {
        getDriver().navigate().to(url);
    }

    /** Refresh page */
    public void refresh() {
        getDriver().navigate().refresh();
    }

    /** Quit WebDriver */
    public void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove(); // Ensure clean-up
        }
    }
}
