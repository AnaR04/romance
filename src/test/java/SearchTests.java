import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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

    public void validateAssertions(){
    Assert.assertEquals("Web", "Web is ");

    Assert.assertTrue(driver.findElement(By.xpath("//a")).isDisplayed(), "Element is not displayed");

    Assert.fail("Element is not displayed");
    }



}
