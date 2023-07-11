import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    ChromeDriver driver;
    public ChromeDriver openBrowser()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.demoblaze.com/");
        return driver;
    }
}
