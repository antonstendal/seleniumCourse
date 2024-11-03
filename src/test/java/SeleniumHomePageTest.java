import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumHomePageTest {

    @Test
    public void findSeleniumTutorial() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumdemo.com/");
        //driver.findElement(By.cssSelector("div[class='ham__toggler-span-wrapper']")).click();
        //WebElement listButtonShop = driver.findElement(By.xpath("//li[2]"));
        //Assert.assertTrue(listButtonShop.isDisplayed());
        //driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div[2]/nav/div/div/ul/li[2]")).click();
        driver.findElement(By.cssSelector("li[ id='menu-item-21']")).click();// for window size maximize
        WebElement seleniumProduct = driver.findElement(By.xpath("//h2[text() = 'Java Selenium WebDriver']"));
        Assert.assertTrue(seleniumProduct.isDisplayed());
        //driver.quit();
    }
}

