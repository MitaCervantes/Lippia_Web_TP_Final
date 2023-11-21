package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePageService extends ActionManager {

    public static void clickShop() {
        click(AutomationConstants.SHOP_BUTTON_XPATH);
    }

    public static void clickHome() {
        click(AutomationConstants.HOME_BUTTON_XPATH);
    }

    public static void slidersVerification(String cantidad, String elemento) {
        ActionManager.waitVisibility(AutomationConstants.SLIDER_DIV_XPATH);
        List<WebElement> sliders = getElementsByParent(AutomationConstants.SLIDER_DIV_XPATH, AutomationConstants.IMG_SLIDER_XPATH, cantidad, elemento);
        Assert.assertEquals(3, sliders.size());

    }
    public static void arrivalsVerification(String cantidad, String elemento) {
        ActionManager.waitVisibility(AutomationConstants.ARRIVALS_DIV_XPATH);
        List<WebElement> imagenes = getElementsByParent(AutomationConstants.ARRIVALS_DIV_XPATH, AutomationConstants.IMG_ARRIVALS_XPATH, cantidad, elemento);
        Assert.assertEquals(3, imagenes.size());
    }

    public static void selectorCasos(String elemento, String cantidad){
        String texto = elemento;
        switch (texto){
            case "sliders":
                slidersVerification(cantidad, elemento);
            case "ingresos":
                arrivalsVerification(cantidad, elemento);
        }

    }

    public static void clickImage() {
        click(AutomationConstants.IMG_ARRIVALS_XPATH);
    }

    public static void clickDescription() {
        click(AutomationConstants.DESCRIPTION_XPATH);
    }



}
