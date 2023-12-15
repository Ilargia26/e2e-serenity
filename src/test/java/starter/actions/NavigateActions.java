package starter.actions;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;

import java.time.Duration;

public class NavigateActions extends UIInteractions {

    @Step("Navigate to opencart")
    public void toTheOpenCartPage() {

        openUrl("http://opencart.abstracta.us/");
    }
    public void addItems() {

        WebElementFacade itemOne = findBy("//button[@onclick=\"cart.add('43');\"]");
        WebElementFacade itemTwo = findBy("//button[@onclick=\"cart.add('40');\"]");

        itemOne.withTimeoutOf(Duration.ofSeconds(5)).click();
        itemTwo.withTimeoutOf(Duration.ofSeconds(5)).click();
    }
    public void  seeCart() {
        WebElementFacade cartButton = findBy("//*[@id=\"cart\"]");
        cartButton.withTimeoutOf(Duration.ofSeconds(30)).click();

    }
    public void  goCheckout() {
        WebElementFacade checkoutButton = findBy("//p[@class='text-right']/a[contains(@href,'checkout/checkout')]");
        checkoutButton.withTimeoutOf(Duration.ofSeconds(30)).click();
    }
    public void selectGuestCheckout(){
        WebElementFacade guessRadio = findBy("//input[@value='guest']");
        guessRadio.withTimeoutOf(Duration.ofSeconds(5)).click();
    }
    public void clickContinue(){
        WebElementFacade continueButton = findBy("//*[@id='button-account']");
        continueButton.withTimeoutOf(Duration.ofSeconds(5)).click();
    }
    public void goCountry(){
        WebElementFacade countryDropdown = findBy("//*[@id='input-payment-country']");
        countryDropdown.withTimeoutOf(Duration.ofSeconds(5)).selectByVisibleText("Ecuador");
    }
    public void goRegion(){
        WebElementFacade regionDropdown = findBy("//*[@id='input-payment-zone']");
        regionDropdown.withTimeoutOf(Duration.ofSeconds(5)).selectByVisibleText("Pichincha");
    }

    public void clickGuestContinue(){
        WebElementFacade continueGuestButton = findBy("//*[@id='button-guest']");
        continueGuestButton.withTimeoutOf(Duration.ofSeconds(5)).click();
    }
    public void clickShippingContinue(){
        WebElementFacade continueShippingtButton = findBy("//*[@id='button-shipping-method']");
        continueShippingtButton.withTimeoutOf(Duration.ofSeconds(5)).click();
    }


    public void termsAndConditions(){
        WebElementFacade continueTCButton = findBy("//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]");
        continueTCButton.withTimeoutOf(Duration.ofSeconds(5)).click();
    }
    public void clickPaymentContinue(){
        WebElementFacade continuePaymentButton = findBy("//*[@id='button-payment-method']");
        continuePaymentButton.withTimeoutOf(Duration.ofSeconds(5)).click();
    }
    public void clickConfirmOrder(){
        WebElementFacade confirmButton = findBy("//*[@id='button-confirm']");
        confirmButton.withTimeoutOf(Duration.ofSeconds(50)).click();

    }
}