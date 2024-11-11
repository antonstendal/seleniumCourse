import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class NewWindowTest {

    @Test
    public void testNewWindow() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();
        
        String currentWindow = driver.getWindowHandle();
        System.out.println(currentWindow);
        driver.findElement(By.cssSelector("#newPage")).click();
        Set<String> windowsNames = driver.getWindowHandles();
        System.out.println(windowsNames);
        for (String window : windowsNames) {
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }

        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.switchTo().window(currentWindow);
        driver.findElement(By.name("fname")).sendKeys("Anton");


    }
}
