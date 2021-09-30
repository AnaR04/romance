package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchTests extends BaseUI {
    String currentUrl;

    public static final boolean testCase11 = true;
    public static final boolean testCase12 = true;
    public static final boolean testCase13 = true;



    @Test(priority = 2, enabled = testCase12, groups = {"user", "admin"})
    public void testSearchPageTestCase12() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        searchPage.clickPrettyWomen();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        //   Assert.assertEquals(currentUrl, com.romanceabroad.ui.Data.expectedUrlSearch);


        softAssert.assertEquals(currentUrl, Data.expectedUrlSearch, "Url is wrong");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy,"date_created");
        softAssert.assertAll();


    }



    @Test(priority = 1, enabled = testCase11, groups = {"user", "admin"})
    public void selectRandomDropDownListOnSearchPageTestCase11() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        searchPage.clickPrettyWomen();
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGES);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGES, "Sort by");
            mainPage.javaWaitSec(3);
        }


    }


    @Test(dataProvider = "Search", dataProviderClass = DataProviders.class, priority = 3, enabled = testCase13, groups = {"user", "admin"})
    public void searchDifferentResults13(String minAge, String maxAge, String sortBy) {
        int min = Integer.parseInt(minAge);
        int max = Integer.parseInt(maxAge);
        System.out.println(min);
        System.out.println(max);


        searchPage.clickPrettyWomen();
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_MIN_AGES), minAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_MAX_AGES), maxAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY), sortBy);
        searchPage.clickSearchButton();


        List<WebElement> infoAboutUser = driver.findElements(By.xpath("//div[@class='text-overflow']"));
        mainPage.javaWait(3000);
        for (int i = 0; i < infoAboutUser.size(); i++) {
            if(i % 2 == 0) {
                mainPage.javaWait(1000);
                WebElement text = infoAboutUser.get(i);
                String info = text.getText();
                System.out.println(info);
                String [] splitedPhrase = info.split(",");
                String age = splitedPhrase[1];
                System.out.println(age);
            }

            infoAboutUser = driver.findElements(By.xpath("//div[@class='text-overflow']"));
            
        }




    }


}
