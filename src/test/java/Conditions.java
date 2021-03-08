import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {

    @Test
    public void test1(){

        String fruit1 = "kiwi";
        String fruit2 = "kiwi";

        if(fruit2.contains("kiwi") || fruit1.contains("orange")){
            System.out.println("We can find our fruit 1!");

        }

        else{
            Assert.fail("We can't find our fruit");
        }
    }

    @Test
    public void test2(){
        int number = 10;
        int sum;

        if(number==10 +5){
            sum = 95 + 100;
        }


        else {
            sum = 100 -95;

        }
        System.out.println(sum);


    }
    @Test
    public void test3(){
        boolean requirement = false;

        if(!requirement){
            System.out.println("Boolean is true!");

        }else
            {
            Assert.fail("Boolean is false");


        }

    }

    @Test
    public void test4(){
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();




        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);

        if (!checkboxConfirmation.isSelected()){
            checkboxConfirmation.click();
            System.out.println("Checkbox is selected");


        }



    }


    @Test
    public void test5 (){
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 18));
        int sum = crunchifyList1.get(1) + crunchifyList1.get(2);
        System.out.println(sum);

       }

    @Test
    public void test6 (){
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());

        for (int i = 0; i <links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);

            links.get(i).click();
            driver.get(mainUrl);
            links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));


        }

    }
    @Test
    public void test7(){

        String flower1 = "rose";
        String flower2 = "rose";

        if (flower1.contains("rose") || flower2.contains("chamomile")){
            System.out.println("We can find our flower1");

        }else {
            Assert.fail("We can't find a flower");

        }

    }

    @Test
    public void test8(){
        WebElement linkMedia = driver.findElement(Locators.LINK_MEDIA);

        if (linkMedia.isDisplayed()){
            linkMedia.click();
        }else {
            Assert.fail("We can't find Photos link");
        }



    }
    @Test
    public void Test9(){
        for (int i = 0; i <4; i++) {
            System.out.println("Hello World!");
            

        }


    }





    }




