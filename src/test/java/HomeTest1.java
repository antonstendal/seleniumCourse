import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeTest1 {

    public boolean containText (String text, WebElement webElement) {
        Select select = new Select(webElement);
        List<WebElement> options = select.getOptions();
        for (WebElement i : options) {
            if (i.getText().equals(text)) {
                return true;
            }
        }
        return false;
    }
}
