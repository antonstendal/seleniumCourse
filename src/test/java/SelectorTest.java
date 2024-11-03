import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.DriverManager;
import java.util.List;

public class SelectorTest {

    @Test
    public void findElements() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //by id
        driver.findElement(By.id("clickOnMe"));

        //by name
        By firstName = By.name("fname");
        driver.findElement(firstName);

        //by className
        By paraHidden = By.className("topSecret");
        driver.findElement(paraHidden);

        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("First element");
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println(inputs.size());

    }
}
