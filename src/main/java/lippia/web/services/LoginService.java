package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void  navigateToWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickMyAccountButton() {
        click(MyAccountConstants.MYACCOUNT_BUTTON_XPATH);
    }

    public static void enterEmail(String email) {
        setInput(LoginConstants.INPUT_USER_LOGIN_XPATH, email);
    }

    public static void enterPassword(String password) {
        setInput(LoginConstants.INPUT_PASSWORD_LOGIN_XPATH, password);
    }

    public static void clickLoginButton() {
        click(LoginConstants.LOGIN_BUTTON_XPATH);
    }

    public static void loginError(String message) {
        String errorMessagePage = getText(LoginConstants.LOGIN_ERROR_MESSAGE);
        Assert.assertEquals(message, errorMessagePage);
    }
    public static void verifyLoginPage() {
        Assert.assertTrue(isVisible(LoginConstants.LOGIN_PAGE_XPATH));
    }
    public static void clickLogOutButton(){
        waitVisibility(MyAccountConstants.LOGOUT_BUTTON);
        click(MyAccountConstants.LOGOUT_BUTTON);
    }
    public static void clickBackButton(){
        DriverManager.getDriverInstance().getWrappedDriver().navigate().back();
    }
    public static void isLoginTitle() {
        Assert.assertTrue(isVisible(LoginConstants.LOGIN_TITLE));
    }

}
