import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelektorTest {

    @Test
    public void findElements() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //by id
        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);

        //by class
        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        //By Tag
        By cssTag = By.cssSelector("input");
        driver.findElement(cssTag).sendKeys("Hello input");
        //By name
        By cssName = By.cssSelector("[name='fname']");
        driver.findElement(cssName);

        By cssNameValue = By.cssSelector("[class = 'topSecret']");
        driver.findElement(cssNameValue);
    }
}
