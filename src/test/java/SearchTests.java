import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {
    String currentUrl;



    @Test
    public void testSearchPage() {
        searchPage.completeFirstPartOfSearch();


        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlSearch);


          WebElement dropDownListSortBy =driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByIndex(dropDownListSortBy, 3);
        searchPage.getDropDownListByText(dropDownListSortBy,  "Views");
        searchPage.getDropDownListByValue(dropDownListSortBy,  "date_created");

        searchPage.clickSearchAgesButton();





    }



}
