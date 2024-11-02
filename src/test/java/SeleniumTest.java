import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class SeleniumTest {

    @Test
    public void openGooglePage() {

        WebDriver driver = getDrivers("chrome");
        driver.manage().window().maximize();
        Dimension windowSize = new Dimension(400, 400);
        driver.manage().window().setSize(windowSize);
        driver.get("https://www.google.com/");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.open('https://mvnrepository.com/artifact/org.testng/testng/7.10.2','blank')");

        driver.quit(); // or .close()
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