import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage{
    WebDriverWait wait;
    @FindBy(linkText = "Samsung galaxy s6")
    WebElement samsungS6;
    @FindBy(css = ".btn.btn-success.btn-lg")
    WebElement addToCart;

    public IndexPage(ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickSamsungS6()
    {
        samsungS6.click();
    }
    public void addToCartSamsungS6()
    {
        addToCart.click();

    }
}
