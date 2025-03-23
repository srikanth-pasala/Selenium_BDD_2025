package pages;

import org.openqa.selenium.By;
import utils.GenericMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FlipkartPages {

    public static java.lang.Object becomeAseller;
    private GenericMethods genericMethods;
    private Properties properties;
    public FlipkartPages() throws IOException {
        FileInputStream file = new FileInputStream("src/main/resources/config.properties");
        properties.load(file);
        genericMethods=new GenericMethods();
    }
    public void searchTextInSearchBar(String text){
        genericMethods.enterText(By.xpath(properties.getProperty("searchBar")),text);
    }
public void becomeASeller(String text){
        genericMethods.clickElement(By.xpath(properties.getProperty("becomeASeller")));

}

public void sellonline(String text)
    genericMethods.clickElement(By.xapth(properties.getProperty("sellonline")));


}
