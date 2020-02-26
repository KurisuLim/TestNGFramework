import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {
    WebDriver driver;

    @Test
    public void doubleClick(){
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#double-click"));

        Action mouseOverHome = builder.doubleClick(element).build();
        mouseOverHome.perform();
    }

}
