import org.openqa.selenium.By;

public class Locators {

    //Media page
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");

    //Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_EMAIL =By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD =By.cssSelector("input#password");
    public static final By TEXT_FIELD_NICKNAME =By.cssSelector("#nickname");
    public static final By BUTTON_BIRTH_DATE_DAY =By.cssSelector("#daySelect");
    public static final By DROP_DOWN_LIST_DAY =By.xpath("//li[@data-handler='selectDay']//a[text()='2']");
    public static final By BUTTON_BIRTH_DATE_MONTH =By.cssSelector("#monthSelect");
    public static final By DROP_DOWN_LIST_MONTH =By.xpath("//li[@data-handler='selectMonth']//a[text()='May']");
    public static final By BUTTON_BIRTH_DATE_YEAR =By.cssSelector("#yearSelect");
    public static final By DROP_DOWN_LIST_YEAR =By.xpath("//li[@data-handler='selectYear']//a[text()='2001']");
    public static final By TEXT_FIELD_PHONE =By.cssSelector("input[name='data[phone]']");
    public static final By CHECKBOX_CONFIRMATION =By.cssSelector("input#confirmation");


    //Search
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_LIST_AGES = By.xpath("//div[@class='short']//select[@id='age_min']//option[text()='25']");
    public static final By DROP_DOWN_LIST_MAX_AGES = By.xpath("//div[@class='short']//select[@id='age_max']//option[text()='50']");


    //Store
    public static final By LINK_STORE = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");


    //StoreSweets
    public static final By LINK_STORE_SWEETS = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");


    //Content
    public static final By LINK_CONTENT = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");


    //Main page tests
    public static final By IFRAME =By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By BUTTON_ROMANCE_ABROAD =By.xpath("//button[@class='ytp-large-play-button ytp-button']");



    public static final By TITLE_OF_PAGE =By.xpath("//h1");
    public static final By LINK_OF_MAIN_PAGE =By.xpath("//ul[@class='navbar-nav']//li");







}
