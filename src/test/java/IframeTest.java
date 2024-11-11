import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class IframeTest {

    @Test
    public void testNewWindow() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        WebElement iFrame = driver.findElement(By.cssSelector("[src='basics.html']"));

        driver.switchTo().frame(iFrame);
        driver.findElement(By.cssSelector("#fname")).sendKeys("Mark");
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h1")).getText());



    }
}
