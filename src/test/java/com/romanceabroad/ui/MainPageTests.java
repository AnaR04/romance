package com.romanceabroad.ui;

import com.romanceabroad.ui.BaseUI;
import com.romanceabroad.ui.Data;
import com.romanceabroad.ui.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class MainPageTests extends BaseUI {






  @Test
    public void test2() {


        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement ele = driver.findElement(Locators.IFRAME);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.BUTTON_ROMANCE_ABROAD).click();

    }
    @Test
    public void testLinksOnMainPage(){
      mainPage.checkLinksOnWebPage("//a", "href");
      mainPage.checkLinksOnWebPage("img", "src");
      driver.findElement(Locators.LINK_SEARCH);
      mainPage.checkLinksOnWebPage("//a", "href");
      mainPage.checkLinksOnWebPage("img", "src");

    }

    @Test
    public void smokeTestMainPage(){
        List<WebElement> mainTabs = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li/a"));
        for (int i = 0; i <mainTabs.size() ; i++) {
            mainTabs.get(i).click();
            driver.get(Data.mainUrl);
            mainTabs = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li/a"));
            
        }



    }


    @Test

    public void print () {
      searchPage.javaWait(5000);


    }




}