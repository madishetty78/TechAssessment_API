package Pages;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Library;

import java.io.IOException;
import java.time.Duration;


public class HomePage extends LoadableComponent<HomePage> {
    Library library = new Library();
    private WebDriver driver;


    @FindBy(xpath = "//div/ul/li[@data-id='users']")
    WebElement getUsers;

    @FindBy(xpath = "//div/ul/li[@data-id='users-single']")
    WebElement getSingleUser;

    @FindBy(xpath = "//div/ul/li[@data-id='users-single-not-found']")
    WebElement getSingleUserNotFound;

    @FindBy(xpath = "//div/ul/li[@data-id='post']")
    WebElement postCreate;

    @FindBy(xpath = "//div/ul/li[@data-id='put']")
    WebElement put;

    @FindBy(xpath = "//div/ul/li[@data-id='patch']")
    WebElement patch;

    @FindBy(xpath = "//div/ul/li[@data-id='delete']")
    WebElement delete;

    @FindBy(xpath = "//div/p/strong/a")
    WebElement reqEndPoint;

    @FindBy(xpath = "//*[@id='console']/div[2]/div[2]/p/strong/span")
    WebElement reqResponse;

    @FindBy(xpath = "//div/button/a[text()='Support ReqRes']")
    WebElement supportBtn;

    public HomePage() throws IOException {
        this.driver = DriverFactory.getDriver();
        driver.get(library.getDetailsFromProperty("app.url"));
        PageFactory.initElements(driver, this);
    }

    public void clickOnButton(String btnName) throws IOException {

        if(btnName.equals("GET LIST USERS")) {
            getUsers.click();
        }
        else if(btnName.equals("GET SINGLE USER")){
            getSingleUser.click();
        }else if(btnName.equals("GET SINGLE USER NOT FOUND")){
            driver.navigate().refresh();
            getSingleUserNotFound.click();
        }else if(btnName.equals("POST CREATE")){
            postCreate.click();
        }else if(btnName.equals("PUT")){
            put.click();
        }else if(btnName.equals("PATCH")){
            patch.click();
        }else if(btnName.equals("DELETE")){
            delete.click();
        }else if(btnName.equals("SUPPORT REQRES")){
            supportBtn.click();
        }
    }

    public String verifyEndPoint() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(reqEndPoint));
        return reqEndPoint.getAttribute("href");
    }

    public String verifyResponse() throws InterruptedException {
        Thread.sleep(500);
        return reqResponse.getText();
    }

    public String verifyButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(supportBtn));
        return supportBtn.getText();
    }


    @Override
    protected void load() {
    }

    @Override
    protected void isLoaded() throws Error {
    }
}
