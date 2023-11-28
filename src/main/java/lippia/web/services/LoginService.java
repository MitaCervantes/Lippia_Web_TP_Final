package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void  navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickMyAccountButton() {
        click(LoginConstants.MYACCOUNT_BUTTON_XPATH);
    }

    public static void enterUserCriteria(String user) {
        setInput(LoginConstants.INPUT_USER_LOGIN_XPATH, user);
    }

    public static void enterPasswordCriteria(String password) {
        setInput(LoginConstants.INPUT_PASSWORD_LOGIN_XPATH, password);
    }

    public static void clickLoginButton() {
        click(LoginConstants.LOGIN_BUTTON_XPATH);
    }

    public static void LoginError(String message) {
        String errorMessagePage = getText(LoginConstants.LOGIN_ERROR_DESCRIP);
        Assert.assertEquals(message, errorMessagePage);
    }
    public static void verifyLoginPage() {
        Assert.assertTrue(isVisible(LoginConstants.LOGIN_PAGE_XPATH));
    }
    public static void clickLogOutButton(){
        MobileActionManager.waitVisibility(MyAccountConstants.LOGOUT_BUTTON);
        MobileActionManager.click(MyAccountConstants.LOGOUT_BUTTON);
    }
    public static void clickBackButton(){
        DriverManager.getDriverInstance().getWrappedDriver().navigate().back();
    }
    public static void isLoginTitle() {
        Assert.assertTrue(isVisible(LoginConstants.LOGIN_TITLE));
    }

}
