import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class KeysExample {
    WebDriver driver;

    @Test
    public void keys(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        //initiate action class
        Actions builder = new Actions(driver);

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement element =  driver.findElement(By.id("txtUsername"));



        Action seriesOfActions = (Action) builder
                .moveToElement(element)
                .click()
                .keyDown(element, Keys.SHIFT)
                .sendKeys(element,"hello")
                .keyUp(element, Keys.SHIFT)
                .doubleClick(element)
                .contextClick()
                .build();


        seriesOfActions.perform();

    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
