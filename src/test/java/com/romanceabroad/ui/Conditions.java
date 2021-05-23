package com.romanceabroad.ui;

import com.romanceabroad.ui.BaseUI;
import com.romanceabroad.ui.Data;
import com.romanceabroad.ui.Locators;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {

    @Test
    public void test1() {

        String fruit1 = "kiwi";
        String fruit2 = "kiwi";

        if (fruit2.contains("kiwi") || fruit1.contains("orange")) {
            System.out.println("We can find our fruit 1!");

        } else {
            Assert.fail("We can't find our fruit");
        }
    }

    @Test
    public void test2() {
        int number = 10;
        int sum;

        if (number == 10 + 5) {
            sum = 95 + 100;
        } else {
            sum = 100 - 95;

        }
        System.out.println(sum);


    }

    @Test
    public void test3() {
        boolean requirement = false;

        if (!requirement) {
            System.out.println("Boolean is true!");

        } else {
            Assert.fail("Boolean is false");


        }

    }

    @Test
    public void test4() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(Data.email1, Data.password);
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5), Data.phone,
                Data.month, Data.day, Data.year, Data.city, Data.location);


        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);

        if (!checkboxConfirmation.isSelected()) {
            checkboxConfirmation.click();
            System.out.println("Checkbox is selected");


        }


    }


    @Test
    public void test5() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 18));
        int sum = crunchifyList1.get(1) + crunchifyList1.get(2);
        System.out.println(sum);

    }

    @Test
    public void test6() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String expectedUrlPrettyWomen = "https://romanceabroad.com/users/search";
        String expectedTitleHowWeWork = "Ukrainian women for marriage";
        String expectedTitlePrettyWomen = "Single Ukrainian women online";
        List<WebElement> links = driver.findElements(Locators.LINK_OF_MAIN_PAGE);
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
           // links.get(i).click();
            mainPage.ajaxClick(links.get(i));

            if (info.contains("WORK")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(expectedTitleHowWeWork, actualTitle);
            }
            if (info.contains("PRETTY WOMEN")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePrettyWomen, actualTitle);
                Assert.assertEquals(actualUrlPrettyWomen, expectedUrlPrettyWomen, Data.expectedUrlSearch);
                driver.findElement(Locators.IMAGES).isDisplayed();
                if (actualUrlPrettyWomen.contains("#")){
                    Assert.fail("It contains restricted #");
                }else{
                    System.out.println("No special character. It is good url!!!");
                }


            }


            driver.get(Data.mainUrl);
            links = driver.findElements(Locators.LINK_OF_MAIN_PAGE);


        }
    }

    @Test
    public void test7() {

        String flower1 = "rose";
        String flower2 = "rose";

        if (flower1.contains("rose") || flower2.contains("chamomile")) {
            System.out.println("We can find our flower1");

        } else {
            Assert.fail("We can't find a flower");

        }

    }

    @Test
    public void test8() {
        WebElement linkMedia = driver.findElement(Locators.LINK_MEDIA);

        if (linkMedia.isDisplayed()) {
            linkMedia.click();
        } else {
            Assert.fail("We can't find Photos link");
        }


    }

    @Test
    public void Test9() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Hello World!");


        }


    }

    @Test
    public void test10() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        System.out.println(crunchifyList1.size());
        crunchifyList1.add(10);
        System.out.println(crunchifyList1.size());
        for (int i = 0; i < crunchifyList1.size(); i++) {
            int element = crunchifyList1.get(i);
            System.out.println(element);

        }
    }

    @Test
    public void test11() {
        String phrase = "Pion is inside the list";
        List<String> crunchifyList2 = new ArrayList<>(Arrays.asList("rose", "chamomile", phrase));

        crunchifyList2.add("pion");
        System.out.println(crunchifyList2);

        for (int i = 0; i < crunchifyList2.size(); i++) {
            String element = crunchifyList2.get(i);
            System.out.println(i + " iteration");



        }
    }

    @Test
    public void test12() {
        //mainPage.ajaxClick(com.romanceabroad.ui.Locators.LINK_OF_MAIN_PAGE, 3);
        mainPage.scrollToBottomPage();



    }


}




