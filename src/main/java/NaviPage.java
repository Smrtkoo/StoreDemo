import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaviPage extends BasePage{

    @FindBy(linkText = "Home ")
    WebElement home;

    @FindBy(linkText = "Contact")
    WebElement contact;

    @FindBy(linkText = "About us")
    WebElement aboutUs;

    @FindBy(id = "cartur")
    WebElement cart;

    public NaviPage(ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
