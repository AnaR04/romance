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
    public static final By TEXT_FIELD_PHONE =By.cssSelector("input[name='data[phone]']");


    //Search
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");

    //Store
    public static final By LINK_STORE = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");


    //StoreSweets
    public static final By LINK_STORE_SWEETS = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");


    //Content
    public static final By LINK_CONTENT = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");







}
