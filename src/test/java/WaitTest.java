import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitTest {

    WebDriver driver;

    @Test
    public void waitTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        driver.findElement(By.tagName("button")).click();
        //Thread.sleep(5000);
        driver.findElement(By.cssSelector("p"));

    }
}
