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

        //find all elements Page
        By all = By.cssSelector("*");
        driver.findElements(all);

        By ulInDiv = By.cssSelector("div ul");
        By ulInTable = By.cssSelector("table tr");
        By trInBody = By.cssSelector("tbody tr");

        driver.findElements(ulInDiv);
        driver.findElements(ulInTable);
        driver.findElements(trInBody);

        By firstChildULInDiv = By.cssSelector("div > ul");
        By firstChildTrInTbody = By.cssSelector("tbody > tr");
        driver.findElements(firstChildTrInTbody);
        driver.findElements(firstChildULInDiv);

        By firstFormAfterLabel = By.cssSelector("label + form");
        By allFormsAfterLabel = By.cssSelector("label ~ form");
        driver.findElements(firstFormAfterLabel);
        driver.findElements(allFormsAfterLabel);

        By attrTag = By.cssSelector("input[name='fname']");
        By attrContains = By.cssSelector("[name *='name']");
        By attrStarts = By.cssSelector("[name^='f']");
        By attrEnds = By.cssSelector("[name$='me']");

        driver.findElements(attrTag);
        driver.findElements(attrContains);
        driver.findElements(attrStarts);
        driver.findElements(attrEnds);

        By firstChild = By.cssSelector("li:first-child");
        By lastChild = By.cssSelector("li:last-child");
        By thirdChild = By.cssSelector("li:nth-child(3)"); // start from 1, not 0

        driver.findElements(firstChild);
        driver.findElements(lastChild);
        driver.findElements(thirdChild);
    }
}
