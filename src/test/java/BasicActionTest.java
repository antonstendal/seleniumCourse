import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class BasicActionTest {


    @Test
    public void performAction() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        System.out.println(basicPageLink.getText());
        basicPageLink.click();

        driver.findElement(By.id("fname")).sendKeys("Anton");
        WebElement userNameInput = driver.findElement(By.name("username"));
        userNameInput.clear();
        userNameInput.sendKeys("Admin");

        userNameInput.sendKeys(Keys.ENTER);
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();
        driver.switchTo().alert().accept();


        //System.out.println(userNameInput.getAttribute("value"));

        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.cssSelector("input[value='male']")).click();

        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);
        cars.selectByValue("volvo");
        List<WebElement> options = cars.getOptions();
      /*  for (WebElement option : options) {
            System.out.println(option.getText());
        }

        HomeworkSelect select = new HomeworkSelect();
        System.out.println(select.checkOption("Audi", selectCar));
        System.out.println(select.checkOption("Daewoo", selectCar));*/

        WebElement para = driver.findElement(By.cssSelector(".topSecret"));
        System.out.println("Text " + para.getAttribute("value"));
        System.out.println("Text " + para.getAttribute("textContent"));


    }
}
