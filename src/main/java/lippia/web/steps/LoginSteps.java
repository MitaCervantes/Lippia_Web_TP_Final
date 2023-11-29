package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginService;


public class LoginSteps extends PageSteps {

    @Given("^login to automationtesting website$")
    public void home() { LoginService.navigateToWeb();  }
    @And("now click on login button")
    public void nowClickOnLoginButton() { LoginService.clickLoginButton();  }
    @And("enter the case changed email (.*) in email textbox")
    public void enterTheCaseChangedEmail(String email) {
        LoginService.enterEmail(email);
    }
    @And("enter the case chenged password (.*) in the password tetxbox")
    public void enterTheCaseChengedPassword(String password) {
        LoginService.enterPassword(password);
    }
    @Then("login must fail saying incorrect username password (.*)")
    public void loginMustFailSayingIncorrectData(String message) {
        LoginService.loginError(message);
    }
    @And("enter the case email (.*) in email textbox")
    public void enterTheCaseEmailInEmailTextbox(String email) {
        LoginService.enterEmail(email);
    }
    @And("enter the case password (.*) in the password tetxbox")
    public void enterTheCasePasswordInThePasswordTetxbox(String password) {
        LoginService.enterPassword(password);
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

