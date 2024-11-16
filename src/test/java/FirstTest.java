import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FirstTest extends BaseTest {

    WebDriver driver;

    @Test
    public void firstTest() {
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.tagName("button")).click();
        waitElementToExist(By.cssSelector("p"));

        String paraText = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(paraText, "Dopiero się pojawiłem!");
        driver.quit();
    }

    @Test
    public void secondTest() {
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.tagName("button")).click();
        waitElementToExist(By.cssSelector("p"));

        String paraText = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(paraText, "Dopiero się pojawiłem!");
        driver.quit();
    }


    public void waitElementToExist(By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));


        wait.until((driver) -> {
            List<WebElement> elements = driver.findElements(By.cssSelector("p"));
            if (elements.size() > 0) {
                //System.out.println("Elements is on Page");
                return true;
            } else {
                //System.out.println("Elements is not on Page");
                return false;
            }
        });
    }
}
