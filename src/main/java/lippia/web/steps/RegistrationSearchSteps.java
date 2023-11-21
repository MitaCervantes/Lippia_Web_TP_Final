package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.RegistrationSearchResultService;
import lippia.web.services.RegistrationService;

public class RegistrationSearchSteps {

    @And("^ingresa una dirección de correo electrónico (.*) en el campo de dirección de correo electrónico")
    public void ingresaCorreo(String criteria) {
        RegistrationService.enterCorreoCriteria(criteria);
    }


    @When("^ingresa una contraseña (.*) vacía en el campo de contraseña")
    public void ingresaContrasenia(String criteria) {
        RegistrationService.enterPasswordCriteria(criteria);
    }


    @And("hacer click en el botón Registrarse")
    public void clickRegister() {
        RegistrationService.clickRegisterButton();
    }

    @Then("el registro debería fallar con un mensaje (.*)")
    public void registroFallido(String criteria) {
        RegistrationSearchResultService.verifyMessage(criteria);
    }


}
