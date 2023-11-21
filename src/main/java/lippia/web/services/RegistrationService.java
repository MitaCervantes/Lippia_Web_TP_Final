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

public class RegistrationService extends ActionManager {

    public static void enterCorreoCriteria(String correo) {
        setInput(AutomationConstants.INPUT_EMAIL_REGISTER_ID, correo);
    }

    public static void enterPasswordCriteria(String password) {
        setInput(AutomationConstants.INPUT_PASSWORD_REGISTER_ID, password);
    }

    public static void clickRegisterButton() {
        ActionManager.waitVisibility(AutomationConstants.REGISTER_BUTTON_XPATH);
        click(AutomationConstants.REGISTER_BUTTON_XPATH);
    }

}

