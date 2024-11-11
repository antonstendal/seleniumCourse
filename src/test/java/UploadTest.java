import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static java.lang.Math.random;

public class UploadTest {

    @Test
    public void uploadFile() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");

        int randomNumber = (int) (Math.random()*1000);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File before = screenshot.getScreenshotAs(OutputType.FILE);
        String fileName = "beforeUpload" + randomNumber + ".png";
        FileUtils.copyFile(before, new File("src/test/resources/" + fileName));
        driver.findElement(By.id("myFile")).sendKeys("D:\\Anton\\ExampleTestForQA.txt");


    }
}
