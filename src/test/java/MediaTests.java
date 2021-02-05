import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI {

    String currentUrl;


    @Test
    public void testMediaPage() {
        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);

    }


}
