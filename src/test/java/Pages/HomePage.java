package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserManager;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type=\"search\"][1]")
    private WebElement TypeSearchPage;
    //starbharatsearchpage
    @FindBy(xpath = "//input[@value=\"Dare to Dance\"]")
    private WebElement TypeStarBhartSearchPage;

    public WebElement getTypeStarBhartSearchPage() {
        return TypeStarBhartSearchPage;
    }

    //enter to hotstarspecials
    @FindBy(xpath = "//a[@to=\"/in/channels/hotstar-specials\"]")
    private WebElement TypehotstarPage;

    public WebElement getTypehotstarPage() {
        return TypehotstarPage;
    }
    @FindBy(xpath = "//a[@to=\"/in/channels/star-bharat\"][1]")
    private WebElement TypeDarePage;

    public WebElement getTypeDarePage() {
        return TypeDarePage;
    }
    @FindBy(xpath = "//div[@class=\"action-play\"]")
    private WebElement TypeplayPage;

    @FindBy(xpath = " //a[@to=\"/in/channels/star-maa\"][1]")
    private WebElement TypeMaaPage;

    public WebElement getTypeMaaPausePage() {
        return TypeMaaPausePage;
    }

    //starmaa
    @FindBy(xpath = " //div[@class=\"ad-timer-position \"][1]")
    private WebElement TypeMaaPausePage;

    public WebElement getTypeMaaPage() {
        return TypeMaaPage;
    }

    public WebElement getTypeplayPage() {
        return TypeplayPage;
    }

    //video
    @FindBy(xpath = "//div[@class=\"title\"][1]")
     WebElement TypevideoPage;

   @FindBy(xpath = "//span[@class=\"player-icon-title\"]")
    WebElement TypePausePage;

   //Starpage pause
   @FindBy(xpath = "//div[@class=\"bottom-left-panel\"]")
   WebElement TypeStarpagePausePage;

   //starBharpause
   @FindBy(xpath = "//div[@class=\"watch-area\"]")
   WebElement TypeStarBharatPausePage;



    public WebElement getTypeStarpagePausePage() {
        return TypeStarpagePausePage;
    }

    @FindBy(xpath = "//div[@class=\"master-container\"]")
    WebElement TypeStopPage;

    public WebElement getTypeStopPage() {
        return TypeStopPage;

    }
    @FindBy(xpath = "//a[@to=\"/tv\"]")
    private WebElement TypeTvPage;



    //Danceto dare video
    @FindBy(xpath = "//div[@class=\"action-play\"]")
    private WebElement TypeDanceVideoplayPage;

    public WebElement getTypeDanceVideoplayPage() {
        return TypeDanceVideoplayPage;
    }

    public WebElement getTypeTvPage () {
        return TypeTvPage;
    }

//for star maa
    @FindBy(xpath = "//div[@class=\"ad-cta-overlay\"]")
    WebElement TypAssertPage;

    //search hotstarspecials chennel
    @FindBy(xpath = "//a[@to=\"/in/channels/hotstar-specials\"]")
    WebElement TypeenterPage;

    //jansi viseo
    @FindBy(xpath = "//div[@class=\"search-wrap hide-on-expand\"][1]")
    WebElement TypeHotstarSplVideoPage;
    //jhansi pause
    @FindBy(xpath = "//div[@class=\"watch-area\"]")
    WebElement TypeHotstarSplPausePage;

    public WebElement getTypeHotstarSplPausePage() {
        return TypeHotstarSplPausePage;
    }

    public WebElement getTypeHotstarSplVideoPage() {
        return TypeHotstarSplVideoPage;
    }

    //searchpage for hotstarspecials
    @FindBy(xpath = "//input[@id=\"searchField\"]")
    WebElement TypeHotstarsplSearchPage;


//-->
//    @FindBy(xpath = "//input[@id=\"searchField\"]")
//    WebElement TypeHotstarsplSearchPage;

    public WebElement getTypeHotstarsplSearchPage() {
        return TypeHotstarsplSearchPage;
    }

    public WebElement getTypeenterPage() {
        return TypeenterPage;
    }

    //starBharatAssert
    @FindBy(xpath = "//div[@class=\"master-container-inner\"]")
    WebElement TypeStarBharatAssertPage;
    //jhansi assert page
    @FindBy(xpath = "//div[@class=\"subtitle-container\"]")
    WebElement TypeHotStarSplAssertPage;

    //search rakshibandan
    @FindBy(xpath = "//input[@id=\"searchField\"]")
    WebElement TypeStarJalsaSearchPage;






    public WebElement getTypeStarJalsaAssertPage() {
        return TypeStarJalsaAssertPage;
    }

    //outlineassert
    @FindBy(xpath = "//div[@class=\"col-xs-12 content-holder\"]")
    WebElement TypeStarJalsaAssertPage;

    //last invalid
    @FindBy(xpath = "//h3[@class=\"title\"]")
    WebElement TypeInvalidPage;

    public WebElement getTypeInvalidPage() {
        return TypeInvalidPage;
    }

    //jalsa rakhibandan
    @FindBy(xpath = "//input[@value=\"Rakhi Bandhan\"]")
    WebElement TypeStarJalsaRakhiSearchPage;

    public WebElement getTypeVijaySearchPage() {
        return TypeVijaySearchPage;
    }

    //vijay search page
    @FindBy(xpath = "//input[@id=\"searchField\"]")
    WebElement TypeVijaySearchPage;

    public WebElement getTypeStarJalsaRakhiSearchPage() {
        return TypeStarJalsaRakhiSearchPage;
    }

    public WebElement getTypeVijayPage() {
        return TypeVijayPage;
    }

    @FindBy(xpath = "//a[@to=\"/in/channels/star-vijay\"][1]")
    private WebElement TypeVijayPage;

    public WebElement getTypeStarJalsaMahaSearchPage() {
        return TypeStarJalsaMahaSearchPage;
    }

    //jalsa mahabarat
    @FindBy(xpath = "//input[@value=\"Mahabharat Bangla\"]")
    WebElement TypeStarJalsaMahaSearchPage;

    public WebElement getTypeStarJalsaSearchPage() {
        return TypeStarJalsaSearchPage;
    }

    public WebElement getTypeJalsaPage() {
        return TypeJalsaPage;
    }


    @FindBy(xpath = "//a[@to=\"/in/channels/star-jalsha\"][1]")
    private WebElement TypeJalsaPage;

    public WebElement getTypeHotStarSplAssertPage() {
        return TypeHotStarSplAssertPage;
    }

    public WebElement getTypeStarBharatPausePage() {
        return TypeStarBharatPausePage;
    }

    public WebElement getTypeStarBharatAssertPage() {
        return TypeStarBharatAssertPage;
    }

    public WebElement getTypAssertPage() {
        return TypAssertPage;
    }

    public WebElement getTypePausePage() {
        return TypePausePage;
    }

    public WebDriver getDriver() {
        return driver;
    }
    public WebElement getTypeSearchPage() {
        return TypeSearchPage;
    }

    public WebElement getTypevideoPage() {
        return TypevideoPage;
    }
    @FindBy(xpath = "//div[@class=\"detail-page\"]")
    private   WebElement TypeAssertPage;

    public WebElement getTypeAssertPage() {
        return TypeAssertPage;
    }
}

