package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginSearchResultService;
import lippia.web.services.LoginService;


public class LoginSteps extends PageSteps {

    @Given("^login to automationtesting website$")
    public void home() { LoginService.navegarWeb();  }

    @When("click on My Account Menu")
    public void clickMyAccount() { LoginService.clickMyAccountButton();  }

    @And("^ingreso el nombre de usuario (.*) en el campo de nombre de usuario")
    public void ingresoUsuario(String criteria) {
        LoginService.enterUserCriteria(criteria);
    }

    @When("^ingreso la contraseña (.*) en el campo de contraseña")
    public void ingresoContrasenia(String criteria) {
        LoginService.enterPasswordCriteria(criteria);
    }

    @And("now click on login button")
    public void nowClickOnLoginButton() { LoginService.clickLoginButton();  }
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

    @And("enter the case changed email {} in email textbox")
    public void enterTheCaseChangedEmail(String email) {
        LoginService.enterUserCriteria(email);
    }
    @And("enter the case chenged password (.*) in the password tetxbox")
    public void enterTheCaseChengedPassword(String password) {
        LoginService.enterPasswordCriteria(password);
    }
    @Then("login must fail saying incorrect username password (.*)")
    public void loginMustFailSayingIncorrectData(String message) {
        LoginService.LoginError(message);
    }
    @And("enter the case email (.*) in email textbox")
    public void enterTheCaseEmailInEmailTextbox(String email) {
        LoginService.enterUserCriteria(email);
    }
    @And("enter the case password (.*) in the password tetxbox")
    public void enterTheCasePasswordInThePasswordTetxbox(String password) {
        LoginService.enterPasswordCriteria(password);
    }
    @And("once your are logged in")
    public void onceYourAreLoggedIn() {
        LoginService.verifyLoginPage();
    }
    @And("sign out of the site")
    public void signOutOfTheSite() {
        LoginService.clickLogOutButton();
    }
    @And("now press back button")
    public void nowPressBackButton() {
        LoginService.clickBackButton();
    }
    @Then("user shouldn’t be signed in to his account rather a general webpage must be visible")
    public void serShouldnTBeSignedInToHisAccount() {
        LoginService.isLoginTitle();
    }
}

