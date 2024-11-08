import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HomeWorkCssSelector {

    @Test
    public void findElements() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        By findCardByClassElements = By.cssSelector("div[class = 'card mt-4 top-card']:first-child");
        By findCardByClassForms = By.cssSelector("div[class = 'card mt-4 top-card']:nth-child(2)");
        By findCardByClassAlertsFrameAndWindow = By.cssSelector("div[class = 'card mt-4 top-card']:nth-child(3)");
        By findCardByClassWidgets = By.cssSelector("div[class = 'card mt-4 top-card']:nth-child(4)");
        By findCardByClassInteractions = By.cssSelector("div[class = 'card mt-4 top-card']:nth-child(5)");
        By findCardByClassBookStoreApplication = By.cssSelector("div[class = 'card mt-4 top-card']:nth-child(6)");

        WebElement elementCards = driver.findElement(findCardByClassElements);
        elementCards.click();

        By findTextBox = By.cssSelector("[class*='btn btn-light']:first-child");
        By findCheckBox = By.cssSelector("[class*='btn btn-light']:nth-child(2)");
        By findRadioButton = By.cssSelector("[class*='btn btn-light']:nth-child(3)");
        By findWebTables = By.cssSelector("[class*='btn btn-light']:nth-child(4)");
        By findButtons = By.cssSelector("[class*='btn btn-light']:nth-child(5)");
        By findLinks = By.cssSelector("[class*='btn btn-light']:nth-child(6)");
        By findBrokenLinksAndImage = By.cssSelector("[class*='btn btn-light']:nth-child(7)");
        By findUploadAndDownload = By.cssSelector("[class*='btn btn-light']:nth-child(8)");
        By findDynamicProperties = By.cssSelector("[class*='btn btn-light']:nth-child(9)");

        WebElement textBox = driver.findElement(findTextBox);
        WebElement checkBox = driver.findElement(findCheckBox);
        WebElement radioButton = driver.findElement(findRadioButton);
        WebElement webTables = driver.findElement(findWebTables);
        WebElement buttons = driver.findElement(findButtons);
        WebElement links = driver.findElement(findLinks);
        WebElement brokenLinksAndImages = driver.findElement(findBrokenLinksAndImage);
        WebElement uploadAndDownload = driver.findElement(findUploadAndDownload);
        WebElement DynamicProperties = driver.findElement(findDynamicProperties);

        textBox.click();
        By fieldUserName = By.cssSelector("#userName");
        By fieldUserEmail = By.cssSelector("#userEmail");
        By fieldUserCurrentAddress = By.cssSelector("#currentAddress");
        By fieldUserPermanentAddress = By.cssSelector("#permanentAddress");
        By buttonSubmit = By.cssSelector("button[id='submit']");

        WebElement userName = driver.findElement(fieldUserName);
        userName.sendKeys("Anton");
        WebElement userEmail = driver.findElement(fieldUserEmail);
        userEmail.sendKeys("1234@gmail.com");
        WebElement userCurrentAddress = driver.findElement(fieldUserCurrentAddress);
        userCurrentAddress.sendKeys("Poland");
        WebElement userPermanentAddress = driver.findElement(fieldUserPermanentAddress);
        userPermanentAddress.sendKeys("Poland");
        WebElement submit = driver.findElement(buttonSubmit);
        submit.click();

        int n = 20;
        String result = (n < 18 ) ? "Good day" : "Good Evening";

        int code = 1111;
        String res = (code == 1111) ? "Ok" : "Wrong";


    }
}
