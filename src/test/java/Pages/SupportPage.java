package Pages;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SupportPage extends LoadableComponent<SupportPage> {
    private WebDriver driver;

    @FindBy(xpath = "//div/label[text()='One-time payment ($)']")
    WebElement oneTimePayment;

    @FindBy(xpath = "//div/label[text()='Monthly support ($5/month)']")
    WebElement monthlysupport;

    @FindBy(xpath = "//*[@id='trigger-pro']")
    WebElement upgradeBtn;


    public SupportPage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    public String verifyRadioButton(String btnName) {

        String text ="";
        if(btnName.equals("One-time payment ($)"))
            text = oneTimePayment.getText();
        else if(btnName.equals("Monthly support ($5/month)")){
            text = monthlysupport.getText();
        }
        return text;
    }

    public String verifyButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(upgradeBtn));
        return upgradeBtn.getText();
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }
}
