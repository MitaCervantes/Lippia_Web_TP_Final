package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.AutomationHomeService;


public class AutomationSteps extends PageSteps {

    @Given("^login to automationtesting website$")
    public void home() {
        AutomationHomeService.navegarWeb();
    }

    @When("hago clic en el menú Mi Cuenta")
    public void clickMyAccount() {
        AutomationHomeService.clickMyAccountButton();
    }

}
