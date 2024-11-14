import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Set;

public class BasicsHtmlHomeWorkTest {

    @Test
    public void basicTestHomeWork() {
        // Things i want to do:
        // on https://testeroprogramowania.github.io/selenium/basics.html
        //   Create tests that work on basics.html
        //1. open browser
        //2. get text from head
        //3. hover on text h1
        //3. click button Klickij mnie!
        //4. enter the name on field
        //5 click on links
        //6. get text from table
        //7. Select volvo option
        //8. I submit option
        //9. i select "female"
        //10. clear input name/password than write new one
        //11. click on button Submit
        //12. Click on "click me"
        //13. On opening page enter text selenium
        //14. Get text from list
        //15. Create one screenshot
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        Actions actions = new Actions(driver);
        WebElement paragraph = driver.findElement(By.tagName("h1"));
        actions.moveToElement(paragraph).perform();
        System.out.println(paragraph.getText());

        WebElement buttonClickOnMe = driver.findElement(By.id("clickOnMe"));
        buttonClickOnMe.click();
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();

        WebElement inputName = driver.findElement(By.name("fname"));


        WebElement tableValue = driver.findElement(By.cssSelector("td:last-child"));
        System.out.println("Saving " + tableValue.getText());

        WebElement select = driver.findElement(By.tagName("select"));
        Select optionSelect = new Select(select);
        optionSelect.selectByValue("volvo");

        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.cssSelector("input[value='female']")).click();

        WebElement userName = driver.findElement(By.name("username"));
        WebElement userPassword = driver.findElement(By.name("password"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].setAttribute('value','Mando');", userName);
        userName.clear();
        userName.sendKeys("Anton");
        userPassword.clear();
        userPassword.sendKeys("1234");

        driver.findElement(By.cssSelector("input[value='Submit']")).click();
        Alert sendForm = driver.switchTo().alert();
        sendForm.accept();
        Alert onSubmitMethod = driver.switchTo().alert();
        onSubmitMethod.accept();

        String currentAddress = driver.getWindowHandle();
        driver.findElement(By.id("newPage")).click();
        Set<String> windowNames = driver.getWindowHandles();
        for (String window : windowNames) {
            if (!window.equals(currentAddress)) {
                driver.switchTo().window(window);
            }
        }
        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.switchTo().window(currentAddress);

        WebElement listValue = driver.findElement(By.cssSelector("div > ul"));
        System.out.println(listValue.getText());








    }
}
