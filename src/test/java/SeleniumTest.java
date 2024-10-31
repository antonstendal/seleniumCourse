import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
    }
    @Test
    public void sampleTest(){
        System.out.println("hello");
    }
}
