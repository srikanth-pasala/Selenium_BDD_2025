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

    private WebDriver driver;
    private Properties properties;

    public BrowserFactory() {
        try {
            properties = new Properties();
            FileInputStream file = new FileInputStream("src/main/resources/config.properties");
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties file", e);
        }
    }


    public WebDriver launchBrowser() {
        if (driver == null) {
            String browser = properties.getProperty("browser").toLowerCase();

            switch (browser) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported browser: " + browser);
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Optional implicit wait
        }
        return driver;
    }

    public void goToUrl(String url) {
        if (driver != null) {
            driver.get(url);
        } else {
            throw new IllegalStateException("WebDriver is not initialized. Call launchBrowser() first.");
        }
    }

    public void navigateTo(String url) {
        if (driver != null) {
            driver.navigate().to(url);
        } else {
            throw new IllegalStateException("WebDriver is not initialized. Call launchBrowser() first.");
        }
    }

    public void refresh() {
        if (driver != null) {
            driver.navigate().refresh();
        } else {
            throw new IllegalStateException("WebDriver is not initialized. Call launchBrowser() first.");
        }
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Resetting driver to avoid reuse of a closed session
        }
    }
}
