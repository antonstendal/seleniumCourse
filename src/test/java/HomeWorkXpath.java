import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWorkXpath {

    @Test
    public void findElements() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();


        By findCardElements = By.xpath("//h5[contains(text(), 'Elements')]");
        WebElement cardElement = driver.findElement(findCardElements);
        cardElement.click();

        By findCardWebTables = By.xpath("*//span[contains(text(), 'Web Tables')]");
        WebElement cardWebTables = driver.findElement(findCardWebTables);
        cardWebTables.click();

        By buttonAdd = By.xpath("//button[@id]");
        WebElement clickAdd = driver.findElement(buttonAdd);
        clickAdd.click();

        By inputFirstName = By.xpath("//input[@id='firstName']");
        WebElement addFirstName = driver.findElement(inputFirstName);
        addFirstName.sendKeys("Anton");

        By inputLastName = By.xpath("//input[@id='lastName']");
        WebElement addLastName = driver.findElement(inputLastName);
        addLastName.sendKeys("Sheiko");

        By inputUserEmail = By.xpath("//input[@id='userEmail']");
        WebElement addUserEmail = driver.findElement(inputUserEmail);
        addUserEmail.sendKeys("annntttnnn@gmail.com");

        By inputAge = By.xpath("//input[@id='age']");
        WebElement addAge = driver.findElement(inputAge);
        addAge.sendKeys("33");

        By inputSalary = By.xpath("//input[@id='salary']");
        WebElement addSalary = driver.findElement(inputSalary);
        addSalary.sendKeys("25000");

        By inputDepartment = By.xpath("//input[@id='department']");
        WebElement addDepartment = driver.findElement(inputDepartment);
        addDepartment.sendKeys("First Floor");

        By buttonSubmit = By.xpath("//button[@id='submit']");
        WebElement submit = driver.findElement(buttonSubmit);
        submit.click();

        By stringNumberThree = By.xpath("//span[@id='delete-record-3']");
        WebElement deleteStringNumberThee = driver.findElement(stringNumberThree);
        deleteStringNumberThee.click();













    }
}
