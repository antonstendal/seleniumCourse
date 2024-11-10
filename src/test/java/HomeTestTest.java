import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeTestTest {

    @Test
    public void testPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By checkbox = By.cssSelector("label[for]");
        WebElement textCheckbox = driver.findElement(checkbox);
        System.out.println(textCheckbox.getText());

        HomeTest homeTest = new HomeTest();
        System.out.println(homeTest.containText("First name:", textCheckbox));
        System.out.println(homeTest.containText(" Potwierdzam 100% nieznajomość regulaminu. Kto ma czas na czytanie regulaminów", textCheckbox));

    }
}
