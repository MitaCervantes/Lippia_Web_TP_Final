package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.AutomationConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void enterUserCriteria(String user) {
        setInput(AutomationConstants.INPUT_USER_LOGIN_XPATH, user);
    }

    public static void enterPasswordCriteria(String password) {
        setInput(AutomationConstants.INPUT_PASSWORD_LOGIN_XPATH, password);
    }

    public static void clickLoginButton() {
        click(AutomationConstants.LOGIN_BUTTON_XPATH);
    }

}
