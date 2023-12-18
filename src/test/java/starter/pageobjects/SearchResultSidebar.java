package starter.pageobjects;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ui.Button;

import java.time.Duration;

public class SearchResultSidebar extends PageComponent {

    public String orderConfirm() {
        WebElementFacade successMessage = findBy("//*[@id=\"content\"]/h1");
        return successMessage.getText();
    }
}
