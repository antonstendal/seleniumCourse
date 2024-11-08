import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class XpathTest {

    @Test
    public void findElements() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //by id
        driver.findElement(By.xpath("//button[@id='clickOnMe']"));

        //by name
        By firstName = By.xpath("//input[@name='fname']");
        driver.findElement(firstName);

        //by className
        By paraHidden = By.xpath("//p[@class='topSecret']");
        driver.findElement(paraHidden);

        //by tag name
        By inputLocator = By.xpath("//input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("First element");
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println(inputs.size());

        //By linkText
        By linkText = By.xpath("//a[text()='Visit W3Schools.com!']");
        WebElement schoolLink = driver.findElement(linkText);

        //By partialLinkText
        By partialLinkText = By.xpath("//a[contains(text(),'Visit')]");
        WebElement partialSchoolLink = driver.findElement(partialLinkText);

        By fullPath = By.xpath("/html/body/div/ul");
        driver.findElements(fullPath);

        By shortPath = By.xpath("//ul");
        driver.findElements(shortPath);

        By allXpath = By.xpath("//*");
        driver.findElements(allXpath);

        By secondElement = By.xpath("(//input)[2]");
        driver.findElement(secondElement);

        By lastElement = By.xpath("(//input)[last()]");
        driver.findElement(lastElement);

        By elementWithAttribute = By.xpath("//*[@name]");
        driver.findElement(elementWithAttribute);

        By attrEq = By.xpath("//button[@id='clickOnMe']");
        By attrNotEq = By.xpath("//*[@id!='clickOnMe']");
        By attrContains = By.xpath("//*[contains(@name,'ame')]");
        By startWith = By.xpath("//*[starts-with(@name,'user')]");
        By endsWith = By.xpath("//*[substring(@name,string-length(@name)-string-length('ame')+1)='ame']");

        driver.findElements(attrEq);
        driver.findElements(attrNotEq);
        driver.findElements(attrContains);
        driver.findElements(startWith);
        driver.findElements(endsWith);



    }
}
