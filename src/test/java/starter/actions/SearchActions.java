import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class SearchActions extends UIInteractions {
    public void byKeyword(String keyword) {
        $("#searchbox_input").sendKeys(keyword, Keys.ENTER);
    }
}