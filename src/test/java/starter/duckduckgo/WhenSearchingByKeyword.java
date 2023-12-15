package starter.duckduckgo;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.actions.NavigateActions;
import starter.actions.SearchActions;
import starter.pageobjects.SearchResultSidebar;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingByKeyword {

    @Managed(driver = "chrome")//We can add the headless mode

    WebDriver driver;
    NavigateActions navigate;
    SearchActions search;
    SearchResultSidebar searchResultSidebar;

    @Test
    void buyTwoItems() {
        navigate.toTheOpenCartPage();
        navigate.addItems();
        navigate.seeCart();
        navigate.goCheckout();
        navigate.selectGuestCheckout();
        navigate.clickContinue();
        search.fillForm("Mariela","Monge","mariela@yopmail.com","+593992910800","Rumipamba","Quito","052010");
        navigate.goCountry();
        navigate.goRegion();
        navigate.clickGuestContinue();
        navigate.clickShippingContinue();
        navigate.termsAndConditions();
        navigate.clickPaymentContinue();
        navigate.clickConfirmOrder();
        try {
            Thread.sleep(50000);
            Serenity.reportThat("The order should complete",
                    () -> assertThat(searchResultSidebar.orderConfirm()).isEqualTo("Your order has been placed!")
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}