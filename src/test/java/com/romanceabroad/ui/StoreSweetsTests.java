package com.romanceabroad.ui;

import com.romanceabroad.ui.BaseUI;
import com.romanceabroad.ui.Data;
import com.romanceabroad.ui.Locators;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreSweetsTests extends BaseUI {
    String currentUrl;


    @Test
    public void testStoreSweets() {
        driver.findElement(Locators.LINK_STORE_SWEETS).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlStoreSweets);

    }


}
