package ec.com.ucuenca.bdd.google.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;


/**
 * Created by santteegt on 24/07/2017.
 */
@DefaultUrl("http://google.com")
public class GoogleDashboard extends PageObject {

    public GoogleDashboard(WebDriver driver) {
        super(driver);
    }
}

