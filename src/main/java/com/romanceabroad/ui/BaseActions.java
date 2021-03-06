package com.romanceabroad.ui;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.List;

public class BaseActions {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;


    }


    public static String generateNewNumber(String name, int length) {

        return name + RandomStringUtils.random(length, "172984757");


    }

    public void getDropDownListByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void getDropDownListByText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void getDropDownListByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void javaWait(int ms) {
        System.out.println("Parent!!!!");
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void javaWaitSec(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ajaxSendKeys(WebElement element, String text) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', '" + text + "')", element);
    }


    public void checkLinksOnWebPage(String typeElement, String attribute) {
        List<WebElement> links = driver.findElements(By.xpath(typeElement));

        System.out.println("I start taking attribute on page");
        for (int i = 0; i < links.size(); i++) {
            WebElement ele = links.get(i);
            String url = ele.getAttribute(attribute);
            verifyLinkActive(url);


        }
        System.out.println("Total links are " + links.size());
    }

    //Method for link verification
    public void verifyLinkActive(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(linkUrl + " - " + httpURLConnection.getResponseMessage());
            } else if (httpURLConnection.getResponseCode() >= 400 && httpURLConnection.getResponseCode() <= 504) {
                System.out.println(linkUrl + " - " + httpURLConnection.getResponseMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public int getSizeDropDownList(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            //((JavascriptExecutor) driver).executeScript("arguments[0],scrollIntoView(true);", element);
            Select select = new Select(driver.findElement(locator));
            return select.getOptions().size();
        } catch (NoSuchElementException e) {
            System.out.println("getSizedDropDownList error");
        }
        return 0;

    }

        //Method for random choice from dropdown list

        public void selectItemDropDownRandomOption (By locator, String dropDownName){
            try {
                WebElement element = driver.findElement(locator);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Select select = new Select(driver.findElement(locator));
                select.selectByIndex((int) (Math.random() * (select.getOptions().size() - 1)) + 1);
                System.out.println(dropDownName + ": " + select.getFirstSelectedOption().getText());
            } catch (NoSuchElementException e) {

            }
        }


        public void ajaxClick (WebElement element){
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        }

        public void ajaxClick (By by){
            wait.until(ExpectedConditions.elementToBeClickable(by));
            ajaxClick(driver.findElement(by));

        }

        public void ajaxClick (By by,int index){
            wait.until(ExpectedConditions.elementToBeClickable(by));
            ajaxClick(driver.findElements(by).get(index));


        }

        public void scrollToBottomPage () {
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight);");


        }

    public void clickValueOfLists(By locator, String text) {
        List<WebElement> elements = driver.findElements(locator);
        for (int i = 0; i < elements.size() ; i++) {
            WebElement elementOfList = elements.get(i);
            String value = elementOfList.getText();
            if (value.contains(text)){
                elementOfList.click();
            }

        }



    }

    public String getAnyTitle(){

       String title =  driver.findElement(Locators.H1_TITLE).getText();
       return title;
    }


    }
