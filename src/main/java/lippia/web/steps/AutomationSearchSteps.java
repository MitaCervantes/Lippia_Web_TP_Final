package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.AutomationHomeService;
import lippia.web.services.LoginSearchResultService;
import lippia.web.services.LoginService;


public class AutomationSearchSteps extends PageSteps {

    @Given("^ingreso a la pagina de automationtesting$")
    public void home() {
        AutomationHomeService.navegarWeb();
    }

    @When("hago clic en el menú Mi Cuenta")
    public void clickMyAccount() {
        AutomationHomeService.clickMyAccountButton();
    }

}
