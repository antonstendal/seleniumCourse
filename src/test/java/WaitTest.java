import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTest {

    WebDriver driver;

    @Test
    public void waitTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("p"));

    }
}
