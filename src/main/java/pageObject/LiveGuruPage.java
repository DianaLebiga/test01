package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LiveGuruPage {

    @FindBy(xpath = "//a[text()='Mobile']")
    private WebElement menuMobileItem;

    @FindBy(xpath = "//select[@title='Sort By'][1]")
    private WebElement sortBySelect;

    public LiveGuruPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void clickOnMobileMenu() {
        menuMobileItem.click();
    }

    public void clickOnSortBySelect() {
        Select selectSortByName = new Select(sortBySelect);
        selectSortByName.selectByIndex(1);
    }
}
