import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTests extends BaseUI{
    String currentUrl;





    @Test
    public void testStorePage() {
        driver.findElement(Locators.LINK_STORE).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlStore);

    }



}
