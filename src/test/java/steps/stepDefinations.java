package steps;

import Pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import utils.BrowserManager;
import utils.ClickUtils;
import utils.QAprops;
import utils.TestDataReader;

import javax.swing.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class stepDefinations {

    private WebDriver driver;

HashMap<String,String> data;
    Scenario scenario;

   String url;
    public stepDefinations(BrowserManager browserManager) {
        this.driver = browserManager.getDriver();
    }
        @Before(order = 1)
        public void before(Scenario scenario){
         this.scenario = scenario;

    }
    @Given("user navigates to the homepage")
    public void user_navigates_to_the_homepage() {
       // data = TestDataReader.getData(scenario.getName());
        url=QAprops.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("the user enter the channel name")
    public void the_user_enter_the_channel_name() {
        data = TestDataReader.getData(scenario.getName());
        HomePage homePage=new HomePage(driver);
//        homePage.getTypeTvPage().click();
//        homePage.getTypehotstarPage().click();
        ClickUtils.click(driver,homePage.getTypeTvPage());
        ClickUtils.click(driver,homePage.getTypehotstarPage());

        homePage.getTypeSearchPage().sendKeys(data.get("Search_Type"));
        //homePage.getTypevideoPage().click();
    }
    @Then("the channel should be displayed")
    public void the_channel_should_be_displayed()  {
        Actions action= new Actions(driver);
        HomePage homePage=new HomePage(driver);
        action.moveToElement(homePage.getTypeStopPage()).build().perform();
        //action.moveToElement(homePage.getTypePausePage()).build().perform();
        Assert.assertTrue(homePage.getTypAssertPage().isDisplayed());
    }

//    @And("user enter {string} and {string}")
//    public void userEnterAnd(String arg0, String arg1) {
//
//    }
//
//    @Given("user is on homepage")
//    public void userIsOnHomepage() {
//    }
//
//    @When("user navitage to homepage")
//    public void userNavitageToHomepage() {
//    }
//
//    @Given("User is on Home Page")
//    public void userIsOnHomePage() {
//    }
//
//    @When("User Navigate to LogIn Page")
//    public void userNavigateToLogInPage() {
//    }
//
//    @And("User enters {string} and {string}")
//    public void userEntersAnd(String arg0, String arg1) {
//    }
//
//    @Then("Message displayed Login Successfully")
//    public void messageDisplayedLoginSuccessfully() {
//    }
    //HostStarSpecials

    @Given("user navigates to the TV page")
    public void user_navigates_to_the_tv_page() {
        url=QAprops.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("the user enter the HotstarSpecials")
    public void the_user_enter_the_hotstar_specials() {
        HomePage homePage=new HomePage(driver);
       // homePage.getTypeTvPage().click();
        //homePage.getTypeenterPage().click();
        ClickUtils.click(driver,homePage.getTypeTvPage());
        ClickUtils.click(driver,homePage.getTypeenterPage());
        data = TestDataReader.getData(scenario.getName());
        homePage.getTypeHotstarsplSearchPage().sendKeys(data.get("Search_Type"));
    }
    @Then("the Jhansi S2 video should be displayed")
    public void the_jhansi_s2_videp_should_be_displayed()  {
        data = TestDataReader.getData(scenario.getName());
        HomePage homePage=new HomePage(driver);
        Actions action= new Actions(driver);
        //homePage.getTypeJhansivideoPage().click();
       ClickUtils.click(driver,homePage.getTypeJhansivideoPage());
        Assert.assertTrue(homePage.getTypeHotStarSplAssertPage() .isDisplayed());

    }


    @Given("user entered in to channel")
    public void userEnteredInToChannel() {
        System.out.println("from Background");
    }
//StarBharat

    @Given("user navigates to the Tv page")
    public void userNavigatesToTheTvPage() {
        url=QAprops.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("the user enter the StarBharat")
    public void the_user_enter_the_star_bharat() {
        HomePage homePage=new HomePage(driver);
        //homePage.getTypeTvPage().click();
        ClickUtils.click(driver,homePage.getTypeTvPage());
       // homePage.getTypeStarBharatPage().click();
       ClickUtils.click(driver,homePage.getTypeStarBharatPage());
        data = TestDataReader.getData(scenario.getName());
        homePage.getTypeSearchPage().sendKeys(data.get("Search_Type"));
    }

    @Then("the Dance to Dare video  should be played")
    public void theDanceToDareVideoShouldBePlayed() {
        data = TestDataReader.getData(scenario.getName());
        HomePage homePage=new HomePage(driver);
        Actions action= new Actions(driver);
        //homePage.getTypevideoPage().click();
        Assert.assertTrue(homePage.getTypeStarBharatAssertPage() .isDisplayed());
    }
    //StarMaa
    @Given("user navigate to the Tv page")
    public void user_navigate_to_the_tv_page() {
        // Write code here that turns the phrase above into concrete actions
        url=QAprops.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("user enter the StarMaa")
    public void user_enter_the_star_maa() {
        HomePage homePage=new HomePage(driver);
       // homePage.getTypeTvPage().click();
      //  homePage.getTypeMaaPage().click();
        ClickUtils.click(driver,homePage.getTypeTvPage());
        ClickUtils.click(driver,homePage.getTypeMaaPage());
        data = TestDataReader.getData(scenario.getName());
       homePage.getTypeSearchPage().sendKeys(data.get("Search_Type"));
    }
    @Then("the BB Jodi should be played")
    public void the_bb_jodi_should_be_played() {
        data = TestDataReader.getData(scenario.getName());
        HomePage homePage=new HomePage(driver);
        Actions action= new Actions(driver);
       // homePage.getTypevideoPage().click();
       Assert.assertTrue(homePage.getTypeStarMaaAssertPage().isDisplayed());
    }

    //star Jalsha
   @Given("User navigate to the tV page")
   public void user_navigate_to_the_t_v_page() {
       url=QAprops.getValue("url");
       driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("User able to {string} video")
   public void user_able_to_video(String search)  {
        HomePage  homePage= new HomePage(driver);
//        Wait wait1 = new FluentWait(driver)
//                .withTimeout(10, TimeUnit.SECONDS)
//                .pollingEvery(2, TimeUnit.SECONDS)
//                .ignoring(Exception.class);
        //homePage.getTypeTvPage().click();
        ClickUtils.click(driver,homePage.getTypeTvPage());
      // homePage.getTypeStarJalsaSearchPage().click();
        ClickUtils.click(driver,homePage.getTypeStarJalsaSearchPage());
       WebElement Input=homePage.getTypeStarJalsaSearchPage();
        Input.sendKeys(search);}
    @And("User can click on enter")
    public void user_can_click_on_enter()  {
        HomePage homePage=new HomePage(driver);
         homePage.getTypeStarJalsaSearchPage().sendKeys(Keys.ENTER);
    }
    @Then("User redirected to the relavant page")
    public void user_redirected_to_the_relavant_page() {
        HomePage homePage=new HomePage(driver);
        Assert.assertTrue(homePage. getTypeStarJalsaAssertPage().isDisplayed());
    }
    //star vijay
    @Given("user navigate to the tv's page")
    public void user_navigate_to_the_tv_s_page() {
        url=QAprops.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("the user enter the StarVijay")
    public void the_user_enter_the_star_vijay()  {
        HomePage homePage=new HomePage(driver);
        //homePage.getTypeTvPage().click();
        //homePage.getTypeVijayPage().click();
        ClickUtils.click(driver,homePage.getTypeTvPage());
        ClickUtils.click(driver,homePage.getTypeVijayPage());

        data = TestDataReader.getData(scenario.getName());
        homePage.getTypeVijaySearchPage().sendKeys(data.get("Search_Type"));
        homePage.getTypeVijaySearchPage().sendKeys(Keys.ENTER);
    }
    @Then("the xyijklopmn video  should be played")
    public void the_xyijklopmn_video_should_be_played() {
        data = TestDataReader.getData(scenario.getName());
        HomePage homePage=new HomePage(driver);

        Assert.assertTrue(homePage.getTypeInvalidPage() .isDisplayed());

    }



}
