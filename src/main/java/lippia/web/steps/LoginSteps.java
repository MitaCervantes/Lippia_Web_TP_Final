package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginSearchResultService;
import lippia.web.services.LoginService;


public class LoginSteps extends PageSteps {


    @And("^ingreso el nombre de usuario (.*) en el campo de nombre de usuario")
    public void ingresoUsuario(String criteria) {
        LoginService.enterUserCriteria(criteria);
    }

    @When("^ingreso la contraseña (.*) en el campo de contraseña")
    public void ingresoContrasenia(String criteria) {
        LoginService.enterPasswordCriteria(criteria);
    }

    @And("hago clic en el botón de inicio de sesión")
    public void clickLogin() {
        LoginService.clickLoginButton();
    }


    @Then("el usuario debe iniciar sesión correctamente en la página web")
    public void loginExitoso() {
        LoginSearchResultService.verifyResults();
    }

    @Then("se debe mostrar el mensaje (.*)")
    public void mensaje(String criteria) {
        LoginSearchResultService.verifyMessage(criteria);
    }

}

