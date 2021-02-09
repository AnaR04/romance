import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {
    String currentUrl;



    @Test
    public void testSearchPage() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*Select select =new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByValue("date_created");*/


          WebElement dropDownListSortBy =driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        getDropDownListByIndex(dropDownListSortBy, 3);
        getDropDownListByText(dropDownListSortBy,  "Views");
        getDropDownlistByValue(dropDownListSortBy,  "date_created");

    }



    public void getDropDownListByIndex(WebElement element, int index){
        Select select =new Select(element);
        select.selectByIndex(index);
    }

    public void getDropDownListByText(WebElement element, String text){
        Select select =new Select(element);
        select.selectByVisibleText(text);
    }

    public void getDropDownlistByValue(WebElement element, String value){
        Select select =new Select(element);
        select.deselectByValue(value);
    }
}
