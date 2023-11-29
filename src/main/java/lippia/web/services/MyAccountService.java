package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

public class MyAccountService extends ActionManager {

    public static void clickMyAccountButton() {
        click(MyAccountConstants.MYACCOUNT_BUTTON_XPATH);
    }


    public static void clickAccountDetails(){
        waitVisibility(MyAccountConstants.ACCOUNT_DETAILS);
        click(MyAccountConstants.ACCOUNT_DETAILS);
    }

    public static void verifyAccountDetails(){
        waitVisibility(MyAccountConstants.DETAILS_FORM);
        Assert.assertTrue(isVisible(MyAccountConstants.DETAILS_FORM));
        Assert.assertTrue(isVisible(MyAccountConstants.PASSWORD_CHANGE_FORM));
    }
    public static void clickLogOut() {
        waitVisibility(MyAccountConstants.LOGOUT_BUTTON);
        click(MyAccountConstants.LOGOUT_BUTTON);
    }

}
