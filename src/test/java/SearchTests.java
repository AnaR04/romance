import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTests extends BaseUI {
    String currentUrl;



    @Test
    public void testSearchPage() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(),"Element is not displayed");
        searchPage.completeFirstPartOfSearch();


        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
     //   Assert.assertEquals(currentUrl, Data.expectedUrlSearch);


        softAssert.assertEquals(currentUrl, Data.expectedUrlSearch, "Url is wrong");
        searchPage.clickSearchAgesButton();
        softAssert.assertAll();




    }
    @Test
    public void validateAssertions(){
    Assert.assertEquals("Web ", "Web ");

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a"))));

    Assert.assertTrue(driver.findElement(By.xpath("//a")).isDisplayed(),"Element is not displayed");


    Assert.fail("Element is not displayed");

    }

    @Test
    public void selectRandomDropDownList() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS) ;

        driver.findElement(Locators.LINK_SEARCH).click();
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGES);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i <sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGES, "Sort by");
            mainPage.javaWaitSec(3);
        }



    }



}
