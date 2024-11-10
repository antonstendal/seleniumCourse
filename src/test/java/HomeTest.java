import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomeTest {



    public boolean containText (String text, WebElement webElement) {
        if (webElement.getText().equals(text)) {
            return true;
        }
        return false;
    }


}
