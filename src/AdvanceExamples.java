import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class AdvanceExamples {
    WebDriver driver;
    WebDriverWait wait;
    @Test
    public void multipleWindows() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
        //Remembers homepage window
        String homeWindow = driver.getWindowHandle();

        driver.get("https://opensource-demo.orangehrmlive.com/");


        driver.findElement(By.cssSelector("#footer a")).click();
        Thread.sleep(3000);
        //switched back to main window
        driver.switchTo().window(homeWindow);
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
