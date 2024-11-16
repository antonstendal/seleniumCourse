import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitTest {

    WebDriver driver;

    @Test
    public void waitTest() {
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        driver.findElement(By.tagName("button")).click();
        //Thread.sleep(5000);

        FluentWait <WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("p")));

        driver.findElement(By.cssSelector("p"));
        waitElementToExist(By.cssSelector("p"));

    }

    public void waitElementToExist(By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));

//        wait.until(new Function<WebDriver, Boolean>() {
//            @Override
//            public Boolean apply(WebDriver webDriver) {
//                List<WebElement> elements = driver.findElements(By.cssSelector("p"));
//                if (elements.size() > 0) {
//                    System.out.println("Elements is on Page");
//                    return true;
//                } else {
//                    System.out.println("Elements is not on Page");
//                    return false;
//                }
//            }
//        });

        wait.until((driver) -> {
            List<WebElement> elements = driver.findElements(By.cssSelector("p"));
            if (elements.size() > 0) {
                System.out.println("Elements is on Page");
                return true;
            } else {
                System.out.println("Elements is not on Page");
                return false;
            }

        });



    }
}
