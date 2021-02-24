import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class MainPageTests extends BaseUI {






  @Test
    public void test2() throws InterruptedException {
        Thread.sleep(5000);
        WebElement ele = driver.findElement(Locators.IFRAME);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.BUTTON_ROMANCE_ABROAD).click();




    }
}