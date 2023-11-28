package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.RegistrationService;

public class RegistrationSteps extends PageSteps {

    @And("enter valid Email Address (.*) in Email-Address textbox")
    public void enterValidEmailAddressInEmailAddressTextbox(String email) {
        RegistrationService.enterEmail(email);
    }
    @And("enter password (.*) in password textbox")
    public void enterPasswordInPasswordTextbox(String password) {
        RegistrationService.enterPassword(password);
    }

    @And("click on Register button")
    public void clickRegister() {
        RegistrationService.clickRegisterButton();
    }
    @Then("registration must fail with a warning message (.*)")
    public void registerFails(String message) {
        RegistrationService.registerError(message);
    }

}
