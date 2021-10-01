package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhotosPage extends BaseActions {

    public PhotosPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);
    }

    public void completeFirstPartOfSearch(){
        driver.findElement(Locators.LINK_SEARCH).click();

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
        getDropDownListByValue(dropDownListSortBy,  "date_created");


    }
    public void clickSearchAgesButton(){
        driver.findElement(Locators.DROP_DOWN_LIST_AGES).click();
        driver.findElement(Locators.DROP_DOWN_LIST_MAX_AGES).click();


    }

    public void clickPhotosTab(){

        driver.findElement(Locators.LINK_MEDIA).click();


    }





}
