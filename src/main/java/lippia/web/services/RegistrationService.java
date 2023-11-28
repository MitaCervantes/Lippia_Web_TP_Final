package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.RegistrationConstants;
import org.testng.Assert;

public class RegistrationService extends ActionManager {

    public static void enterEmail(String email) {
        setInput(RegistrationConstants.INPUT_EMAIL_REGISTER_ID, email);
    }

    public static void enterPassword(String password) {
        setInput(RegistrationConstants.INPUT_PASSWORD_REGISTER_ID, password);
    }

    public static void clickRegisterButton() {
        waitVisibility(RegistrationConstants.REGISTER_BUTTON);
        click(RegistrationConstants.REGISTER_BUTTON);
    }

    public static void registerError(String message){
        String errorMessagePage = getText(RegistrationConstants.REGISTER_ERROR_MESSAGE);
        Assert.assertEquals(message, errorMessagePage);
    };

}

