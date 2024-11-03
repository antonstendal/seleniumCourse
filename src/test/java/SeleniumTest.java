import org.junit.jupiter.api.Tag;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage() {

        WebDriver driver = getDrivers("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        //przehodzimy do frame cookies
        //driver.switchTo().frame(0);
        //find the button
        WebElement agreeButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]"));
        agreeButton.click();
        //came back searching field
        driver.switchTo().defaultContent();
        //fins search name
        WebElement searchField = driver.findElement(By.name("q"));
        //enter value search "Selenium" to field
        searchField.sendKeys("Selenium");
        //push the button Enter
        searchField.sendKeys(Keys.ENTER);
        //find results
        WebElement result = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/div[2]/cite"));

        Assert.assertTrue(result.isDisplayed());


    }

    public WebDriver getDrivers(String browser) {
        switch (browser) {
            case "chrome":
                return new ChromeDriver();
            case "fireFox":
                return new FirefoxDriver();
            case "iE":
                String iEPath = "D:\\Properties\\IEDriverServer.exe"; // if manual create path for browser
                System.setProperty("webdriver.ie.driver", iEPath); // if manual create path for browser
                return new InternetExplorerDriver();
            default:
                throw new InvalidArgumentException("NoValidType browser");
        }

    }

    /*    public WebDriver getDrivers(String browser) {
        switch (browser) {
            case "chrome" :
                return new ChromeDriver();
            case "fireFox" :
                return new FirefoxDriver();
            case "iE" :
                String iEPath = "D:\\Properties\\IEDriverServer.exe"; // if manual create path for browser
                System.setProperty("webdriver.ie.driver", iEPath); // if manual create path for browser
                return new InternetExplorerDriver();
            default:
                throw new InvalidArgumentException("NoValidType browser");
        }

    }*/
}