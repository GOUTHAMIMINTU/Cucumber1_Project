package Pages;

import lombok.Getter;
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
    @Getter
    WebElement TypeSearchPage;
    //starbharatsearchpage
    @FindBy(xpath = "//input[@value=\"Dare to Dance\"]")
    @Getter
    WebElement TypeStarBhartSearchPage;
    //enter to hotstarspecials
    @FindBy(xpath = "//a[@to=\"/in/channels/hotstar-specials\"]")
    @Getter
    WebElement TypehotstarPage;
    @FindBy(xpath = "//a[@to=\"/in/channels/star-bharat\"]")
    @Getter
    WebElement TypeStarBharatPage;

    @FindBy(xpath = "//div[@class=\"search-wrap hide-on-expand\"]")
    @Getter
    WebElement TypeJhansivideoPage;
    @FindBy(xpath = "//div[@class=\"action-play\"]")
    @Getter
    WebElement TypeplayPage;

    @FindBy(xpath = " //a[@to=\"/in/channels/star-maa\"][1]")
    @Getter
    WebElement TypeMaaPage;
    //starmaa
    @FindBy(xpath = " //div[@class=\"ad-timer-position \"][1]")
    @Getter
    WebElement TypeMaaPausePage;
    //Starpage pause
   @FindBy(xpath = "//div[@class=\"bottom-left-panel\"]")
   @Getter
   WebElement TypeStarpagePausePage;

    @FindBy(xpath = "//div[@class=\"master-container\"]")
    @Getter
    WebElement TypeStopPage;
    @FindBy(xpath = "//a[@class=\"nav-link\"][1]")////a[@to="/tv"]
    @Getter
    WebElement TypeTvPage;
    //Danceto dare video
    @FindBy(xpath = "//div[@class=\"action-play\"]")
    @Getter
    WebElement TypeDanceVideoplayPage;



//for star maa
    @FindBy(xpath = "//div[@class=\"master-container-inner\"]")
    @Getter
     WebElement TypAssertPage;



    @FindBy(xpath = "//div[@class=\"master-container-inner\"]")
    @Getter
    WebElement TypeStarMaaAssertPage;

    //search hotstarspecials chennel
    @FindBy(xpath = "//a[@to=\"/in/channels/hotstar-specials\"]")
    @Getter
    WebElement TypeenterPage;

    //jansi viseo
    @FindBy(xpath = "//div[@class=\"search-wrap hide-on-expand\"][1]")
    @Getter
    WebElement TypeHotstarSplVideoPage;
    //jhansi pause
    @FindBy(xpath = "//div[@class=\"master-container-inner\"]")
    @Getter
    WebElement TypeHotstarSplPausePage;
    //searchpage for hotstarspecials
    @FindBy(xpath = "//input[@id=\"searchField\"]")
    @Getter
    WebElement TypeHotstarsplSearchPage;
    //starBharatAssert
    @FindBy(xpath = "//div[@class=\"master-container-inner\"]")
    @Getter
    WebElement TypeStarBharatAssertPage;
    //jhansi assert page
    @FindBy(xpath = "//div[@class=\"subtitle-container\"]")
    @Getter
    WebElement TypeHotStarSplAssertPage;

    //search rakshibandan
    @FindBy(xpath = "//input[@id=\"searchField\"]")
    @Getter
    WebElement TypeStarJalsaSearchPage;
    //outlineassert
    @FindBy(xpath = "//div[@class=\"col-xs-12 content-holder\"]")
    @Getter
    WebElement TypeStarJalsaAssertPage;
    @FindBy(xpath = "//div[@class=\"play-btn no-badges\"]")
    @Getter
    WebElement TypeStarMaaplayPage;
    //last invalid
    @FindBy(xpath = "//h3[@class=\"title\"]")
    @Getter
    WebElement TypeInvalidPage;
    //jalsa rakhibandan
    @FindBy(xpath = "//input[@value=\"Rakhi Bandhan\"]")
    @Getter
    WebElement TypeStarJalsaRakhiSearchPage;
    //vijay search page
    @FindBy(xpath = "//input[@id=\"searchField\"]")
    @Getter
    WebElement TypeVijaySearchPage;
    @FindBy(xpath = "//a[@to=\"/in/channels/star-vijay\"][1]")
    @Getter
    WebElement TypeVijayPage;
    //jalsa mahabarat
    @FindBy(xpath = "//input[@value=\"Mahabharat Bangla\"]")
    @Getter
    WebElement TypeStarJalsaMahaSearchPage;
    @FindBy(xpath = "//a[@to=\"/in/channels/star-jalsha\"][1]")
    @Getter
    WebElement TypeJalsaPage;
    @FindBy(xpath = "//div[@class=\"detail-page\"]")
    @Getter
    WebElement TypeAssertPage;


}

