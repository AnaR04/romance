import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTests extends BaseUI {
    String currentUrl;

    public static final boolean testCase11 = false;
    public static final boolean testCase12 = true;
    public static final boolean testCase13 = true;


    @Test(priority = 2, enabled = testCase12, groups = {"user", "admin"})
    public void testSearchPageTestCase12() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_SEARCH).click();



        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        //   Assert.assertEquals(currentUrl, Data.expectedUrlSearch);


        softAssert.assertEquals(currentUrl, Data.expectedUrlSearch, "Url is wrong");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy,"date_created");
        softAssert.assertAll();


    }

    @Test(priority = 3, enabled = testCase13, groups = {"user", "admin"})
    public void verificationsTestCase13() {
        Assert.assertEquals("Web", "Web");
        // Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(),"Element is not displayed");

        // Assert.fail("Element is not displayed");

    }

    @Test(priority = 1, enabled = testCase11, groups = {"user", "admin"})
    public void selectRandomDropDownListOnSearchPageTestCase11() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(Locators.LINK_SEARCH).click();
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGES);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGES, "Sort by");
            mainPage.javaWaitSec(3);
        }


    }


}
