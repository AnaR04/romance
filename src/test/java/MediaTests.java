import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI {

    String currentUrl;


    @Test
    public void testMediaPage() {
        Assert.assertTrue(driver.findElement(Locators.LINK_MEDIA).isDisplayed(), "Element is not displayed");

        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
       // Assert.assertEquals(currentUrl, Data.expectedUrlMedia);

        softAssert.assertEquals(currentUrl, Data.expectedUrlMedia, "Url is wrong");
        softAssert.assertEquals(currentUrl, Data.expectedUrlMedia, "Url is wrong");
        softAssert.assertAll();

    }


        public void validateAssertions(){
            Assert.assertEquals("Web", "Web is ");

            Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(), "Element is not displayed");

            Assert.fail("Element is not displayed");

        }



    }



