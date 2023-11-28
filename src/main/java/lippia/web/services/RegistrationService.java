package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;

public class RegistrationService extends ActionManager {

    public static void enterCorreoCriteria(String correo) {
        setInput(LoginConstants.INPUT_EMAIL_REGISTER_ID, correo);
    }

    public static void enterPasswordCriteria(String password) {
        setInput(LoginConstants.INPUT_PASSWORD_REGISTER_ID, password);
    }

    public static void clickRegisterButton() {
        ActionManager.waitVisibility(LoginConstants.REGISTER_BUTTON_XPATH);
        click(LoginConstants.REGISTER_BUTTON_XPATH);
    }

}

