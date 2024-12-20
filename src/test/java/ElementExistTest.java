import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementExistTest {

    WebDriver driver;

    @Test
    public void elementExistTest() {
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(elementExist(By.tagName("p")));
        System.out.println(elementExist(By.id("topSecret")));
        System.out.println(elementExistSecond(By.tagName("p")));
        System.out.println(elementExistSecond(By.id("topSecret")));
        System.out.println(driver.findElement(By.tagName("p")).isDisplayed());
        System.out.println(driver.findElement(By.tagName("button")).isDisplayed());
        System.out.println(driver.findElement(By.tagName("button")).isEnabled());


        System.out.println("===========================================================");
        WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        System.out.println(checkBox.isSelected());
        checkBox.click();
        System.out.println(checkBox.isSelected());


    }

    public boolean elementExist(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }

    public boolean elementExistSecond(By locator) {
        return driver.findElements(locator).size() > 0;


    }

}
