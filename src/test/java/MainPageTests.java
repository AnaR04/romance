import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class MainPageTests extends BaseUI {






  @Test
    public void test2() {


        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement ele = driver.findElement(Locators.IFRAME);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.BUTTON_ROMANCE_ABROAD).click();




    }
}