package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

public class ParallelTest1{
    public WebDriver driver;


    @Test
    public void logoTest() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement logo = driver.findElement(By.cssSelector("#divLogo"));

        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(3000);
    }

    @Test
    public void homePageTitle() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Thread.sleep(3000);
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
