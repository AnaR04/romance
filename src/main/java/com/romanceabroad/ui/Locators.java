package com.romanceabroad.ui;

import org.openqa.selenium.By;

public class Locators {

    public static final By H1_TITLE = By.xpath("//h1");

    public static final By MAIN_URL = By.xpath("https://romanceabroad.com/");

    //Photos page
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    public static final By LINK_TAB_USER_PROFILE = By.xpath("//ul[@id='gallery_filters']//a");

    //Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TOOLTIP_ERROR = By.xpath("//div[@class='tooltip']");
    public static final By TEXT_FIELD_EMAIL =By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD =By.cssSelector("input#password");
    public static final By TEXT_FIELD_NICKNAME =By.cssSelector("#nickname");
    public static final By TEXT_FIELD_PHONE =By.cssSelector("input[name='data[phone]']");
    public static final By LIST_DAYS =By.cssSelector("#daySelect");
    public static final By LIST_VALUE_DAY =By.xpath("//li[@data-handler='selectDay']");
    public static final By LIST_MONTHS =By.cssSelector("#monthSelect");
    public static final By LIST_VALUE_MONTH =By.xpath("//li[@data-handler='selectMonth']");
    public static final By LIST_YEARS =By.cssSelector("#yearSelect");
    public static final By LIST_VALUE_YEAR =By.xpath("//li[@data-handler='selectYear']");
    public static final By CHECKBOX_CONFIRMATION =By.cssSelector("input#confirmation");
    public static final By AUTOFILLING_FORM_LOCATION =By.xpath("//input[@name='region_name']");
    public static final By LIST_VALUE_LOCATION =By.xpath("//div[@class='dropdown dropdown_location']//ul//li");


    //Search
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_LIST_AGES = By.xpath("//div[@class='short']//select[@id='age_min']//option[text()='25']");
    public static final By DROP_DOWN_LIST_MAX_AGES = By.xpath("//div[@class='short']//select[@id='age_max']//option[text()='50']");
    public static final By DROP_DOWN_MAX_AGES = By.cssSelector("select#age_max");
    public static final By DROP_DOWN_MIN_AGES = By.cssSelector("select#age_min");
    public static final By BUTTON_SEARCH = By.cssSelector("#main_search_button_user_advanced");
    public static final By TEXT_USER_INFO = By.xpath("//div[@class='text-overflow']");
    public static final By TITLE_OF_PAGE =By.xpath("//h1");
    public static final By IMAGES =By.xpath("//a[@class='g-pic-border g-rounded']");



    //Store
    public static final By LINK_STORE = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");


    //StoreSweets
    public static final By LINK_STORE_SWEETS = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");


    //Content
    public static final By LINK_CONTENT = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");


    //Main page tests
    public static final By IFRAME = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By BUTTON_ROMANCE_ABROAD = By.xpath("//button[@class='ytp-large-play-button ytp-button']");
    public static final By LINK_OF_MAIN_PAGE = By.xpath("//ul[@class='navbar-nav']//li");


    //Blog page
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINKS_OF_ARTICLES = By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//li");













}
