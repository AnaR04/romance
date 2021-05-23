package com.romanceabroad.ui;

import com.romanceabroad.ui.BaseUI;
import com.romanceabroad.ui.Data;
import com.romanceabroad.ui.Locators;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContentTests extends BaseUI {
    String currentUrl;


    @Test
    public void testContent() {
        driver.findElement(Locators.LINK_CONTENT).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlContent);


    }
}