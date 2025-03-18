package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserFactory {

    public WebDriver driver;
    public Properties properties;
    public BrowserFactory() throws IOException {
        properties =new Properties();
        FileInputStream file = new FileInputStream("src/main/resources/config.properties");
        properties.load(file);
    }


    public WebDriver launchBrowser(){
        String browser=properties.getProperty("browser");
        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public void goToUrl(String url){
        driver.get(url);
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
    }
    public void refresh(){
        driver.navigate().refresh();
    }


    public void quitDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
