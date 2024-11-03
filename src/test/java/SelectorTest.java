import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.DriverManager;

public class SelectorTest {

    @Test
    public void findElements() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");


        driver.findElement(By.id("clickOnMe"));

        //by name

        By firstName = By.name("fname");
        WebElement firstNameInput = driver.findElement(firstName);
        driver.findElement(By.name("fname"));
    }
}
