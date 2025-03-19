package stepdefs;

import Pages.HomePage;
import Pages.SupportPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import driver.DriverFactory;
import driver.SharedDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.Library;

import java.io.IOException;


public class glueCode {
    private HomePage homePage;
    private SupportPage supportPage;
    Library library = new Library();

    WebDriver driver;
    public glueCode(SharedDriver driver, HomePage homePage, SupportPage supportPage) {
        this.homePage = homePage;
        this.supportPage = supportPage;
        this.driver = DriverFactory.getDriver();
    }


    @Given("^I am on the Home page$")
    public void getHomePage()  {
        homePage.get();
    }

    @When("I click on the {string} method button")
    public void i_click_on_the_method(String buttonMethodName) throws IOException {
        homePage.clickOnButton(buttonMethodName);
    }

    @When("I should see {string} End Point")
    public void i_should_see_a_endpoint(String endpoint) {
        Assert.assertEquals(homePage.verifyEndPoint(), endpoint);
    }

    @When("I should see {string} Response")
    public void i_should_see_a_response(String responseCode) throws InterruptedException {
        Assert.assertEquals(homePage.verifyResponse(), responseCode);
    }

    @When("I should see {string} button")
    public void i_should_see_a_button(String btnName) {
        Assert.assertEquals(homePage.verifyButton(), btnName);
    }

    @When("I click on the {string} button")
    public void i_click_on_the_button(String btnName) throws IOException {
        homePage.clickOnButton(btnName);
    }

    @When("I should see {string} Option")
    public void i_should_see_a_Option(String OptName) {
        Assert.assertEquals(supportPage.verifyRadioButton(OptName), OptName);
    }

    @When("I should see Support {string} button")
    public void i_should_see_a_support_button(String btnName) {
        Assert.assertEquals(supportPage.verifyButton(), btnName);
    }

//    -------------- ETL Processing

    @When("I upload the file {string} to Database")
    public void i_upload_the_file_to_database (String fileName)  {
        library.readCsvValues(fileName);
    }

    @When("I generate the PositionReport from after processing")
    public void i_generate_the_PositionReport_from_database () {
        library.transformNGenerateReport();
    }

}