package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.MyAccountService;

public class MyAccountSteps extends PageSteps {
    @When("click on My Account Menu")
    public void clickMyAccount() { MyAccountService.clickMyAccountButton();  }
    @And("enter registered email (.*) in username input")
    public void enterRegisteredEmail(String email) {
        LoginService.enterEmail(email);
    }
    @And("enter password (.*) in password input")
    public void enterPasswordInPasswordInput(String password) {
        LoginService.enterPassword(password);
    }
    @And("user must successfully login to the web page")
    public void userMustSuccessfullyLoginToTheWebPage() {
        LoginService.verifyLoginPage();
    }
    @And("click on Account details")
    public void clickOnAccountDetails() {
        MyAccountService.clickAccountDetails();
    }
    @Then("User can view account details where he can change his password also")
    public void userCanViewAccountDetails() { MyAccountService.verifyAccountDetails(); }
    @And("click on My Account link")
    public void clickOnMyAccountLink() { MyAccountService.clickMyAccountButton();  }
    @And("click on Logout button")
    public void clickOnLogoutButton() { MyAccountService.clickLogOut(); }
    @Then("on clicking logout,User successfully comes out from the site")
    public void onClickingLogoutUserSuccessfully() { LoginService.isLoginTitle(); }
}
