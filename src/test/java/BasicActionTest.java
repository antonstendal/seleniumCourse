import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        userNameInput.sendKeys(Keys.TAB);
        System.out.println(userNameInput.getAttribute("value"));

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


    }
}
