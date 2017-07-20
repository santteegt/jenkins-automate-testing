package ec.com.ucuenca;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

/**
 * Created by santteegt on 20/07/2017.
 */
public class SeleniumTest {

    private WebDriver driver;

    @Test
    public void testEasy() {
        driver.get("http://demo.guru99.com/selenium/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("========>>>>" + System.getProperty("webdriver.chrome.driver"));
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }


}
