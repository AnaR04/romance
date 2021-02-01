import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrl;
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    String expectedUrlMedia = "https://romanceabroad.com/media/index";
    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    By LINK_SING_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    By TEXT_FEILD_EMAIL =By.cssSelector("input#email");
    By TEXT_FEILD_PASSWORD =By.cssSelector("input#email");
    int indexSignIn =0;
    String email = "1113333@gmail.com";
    String password = "#*83#52";
    String expectedUrlHowWorks = "https://romanceabroad.com/content/view/how-it-works";
    String expectedUrlStore = "https://romanceabroad.com/store/category-sweets";
    String expectedUrlStoreSweets = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    By LINK_STORE = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    By LINK_STORE_SWEETS = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    String expectedUrlContent = "https://romanceabroad.com/content/view/blog";
    By LINK_CONTENT = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");



    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @Test
    public void testSearchPage() {
        driver.findElement(LINK_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlSearch);

    }

    @Test
    public void testMediaPage() {
        driver.findElement(LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlMedia);

    }

    @Test
    public void testSignIn() {
        driver.findElements(LINK_SING_IN).get(indexSignIn).click();

    }

    @Test
    public void testRegistration() {
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(TEXT_FEILD_EMAIL).sendKeys(email);
        driver.findElement(TEXT_FEILD_PASSWORD).sendKeys(password);
        driver.findElement(BUTTON_NEXT).click();






    }

    @Test
    public void testStorePage() {
        driver.findElement(LINK_STORE).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlStore);
        
    }

    @Test
    public void testStoreSweets() {
        driver.findElement(LINK_STORE_SWEETS).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlStoreSweets);

    }

    @Test
    public void testContent() {
        driver.findElement(LINK_CONTENT).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlContent);

    }

    @Test
    public void testMainPage7() {



    }
    

    @AfterMethod
    public void afterActions() {

      driver.quit();
    }


}
