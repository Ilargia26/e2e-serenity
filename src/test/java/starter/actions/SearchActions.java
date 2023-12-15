package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class SearchActions extends UIInteractions {
    @Step ("Fill form")
    public void fillForm(String firstName, String lastName, String eMail, String phone, String address, String city, String postCode) {

        $("#input-payment-firstname").sendKeys(firstName);
        $("#input-payment-lastname").sendKeys(lastName);
        $("#input-payment-email").sendKeys(eMail);
        $("#input-payment-telephone").sendKeys(phone);
        $("#input-payment-address-1").sendKeys(address);
        $("#input-payment-city").sendKeys(city);
        $("#input-payment-postcode").sendKeys(postCode);
    }


}