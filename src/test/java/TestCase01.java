import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.LiveGuruPage;

import static org.testng.Assert.assertEquals;

/**
 * Created by diana.uzun on 04.05.2017.
 */
public class TestCase01 {

    static WebDriver driver = null;
    private LiveGuruPage liveGuruPage;

    private String expectedTitleOfPage;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("http://live.guru99.com/");
    }

    @Test(priority = 0)
    public void verifyTitleOfPage() {
        expectedTitleOfPage = "Home page";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitleOfPage, actualTitle);
    }

    @Test(priority = 1)
    public void clickMobileItemMenu() {
        liveGuruPage = new LiveGuruPage(driver);
        liveGuruPage.clickOnMobileMenu();
    }

    @Test(priority = 2)
    public void verifyTitleOfPageAfterClickOnMenu() {
        expectedTitleOfPage = "Mobile";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitleOfPage, actualTitle);
    }

    @Test(priority = 3)
    public void selectSortByName() {
        liveGuruPage = new LiveGuruPage(driver);
        liveGuruPage.clickOnSortBySelect();

        expectedTitleOfPage = "Mobile";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitleOfPage, actualTitle);
    }

    //TODO verifyAll3ProductByName

    @AfterTest
    public void closeBrowser() {
        if (driver != null)
            driver.quit();
    }
}
