package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginSearchResultService extends ActionManager {

    private static WebElement stats() {
        return getElement(LoginConstants.LOGIN_PAGE_XPATH);
    }

    public static String getStats() {
        return stats().getText();
    }

    public static void verifyResults(){
        Assert.assertEquals(getStats(), getElement(LoginConstants.LOGIN_PAGE_XPATH).getText());
    }

    private static WebElement errorStats() {
        return getElement(LoginConstants.ERROR_STATS_LOGIN_XPATH);
    }

    public static String getErrorStats() { return errorStats().getText();
    }

    public static void verifyMessage(String criteria) {
        Assert.assertEquals(getErrorStats(), getElement(LoginConstants.ERROR_STATS_LOGIN_XPATH).getText(), criteria);
    }
}
