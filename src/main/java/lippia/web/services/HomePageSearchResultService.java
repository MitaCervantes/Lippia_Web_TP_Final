package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePageSearchResultService extends ActionManager {

    private static WebElement stats() {
        return getElement(AutomationConstants.ADD_CHART_XPATH);
    }

    public static String getStats() {
        return stats().getText();
    }

    public static void verifyAddChart(){
        Assert.assertEquals(getStats(), getElement(AutomationConstants.ADD_CHART_XPATH).getText());
    }

    private static WebElement statsDesc() {
        return getElement(AutomationConstants.DESCRIPTION_DIV_XPATH);
    }

    public static String getStatsDesc() {
        return statsDesc().getText();
    }

    public static void verifyDescription(){
        Assert.assertEquals(getStatsDesc(), getElement(AutomationConstants.DESCRIPTION_DIV_XPATH).getText());
    }


}
