import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class AssertionsExample {

    public WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    public void setup(String browser, String app){

        if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            System.setProperty("webdriver.chrome.silentOutput", "true");
            java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
            driver = new ChromeDriver();
//          driver.manage().window().fullscreen();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "geckodriver");
            System.setProperty("webdriver.gecko.silentOutput", "true");
            java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
            driver = new FirefoxDriver();
//          driver.manage().window().fullscreen();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        driver.get(app);

    }

    @Test(priority = 1)
    public void logoTest(){
        WebElement logo;
        logo = driver.findElement(By.cssSelector("#divLogo"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
    }

    @Test(priority = 2)
    public void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", title, "Title is not matched");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
