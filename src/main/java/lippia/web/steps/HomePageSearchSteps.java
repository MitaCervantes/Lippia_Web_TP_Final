package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomePageSearchResultService;
import lippia.web.services.HomePageService;
import lippia.web.services.RegistrationSearchResultService;
import lippia.web.services.RegistrationService;

public class HomePageSearchSteps {

    @When("hago clic en el menú Shop")
    public void clickMenuShop() {
        HomePageService.clickShop();
    }

    @And("hago clic en el botón de menú Home")
    public void clickHome() {
        HomePageService.clickHome();
    }

    @Then("debería ver (.*) (.*) en la página de inicio")
    public void slidersAndArrivals(String cantidad, String elemento) {
        HomePageService.selectorCasos(cantidad, elemento);
    }

    @When("hago clic en la imagen de uno de los ingresos")
    public void hagoClicEnLaImagen() {
        HomePageService.clickImage();
    }

    @Then("debería ser redirigido a la siguiente página donde el usuario puede agregar ese libro a su carrito")
    public void redirigirAgregarCArrito() {
        HomePageSearchResultService.verifyAddChart();
    }


    @When("hago clic en la pestaña descripcion para el libro en el que hice click")
    public void clickDescripcion() {
        HomePageService.clickDescription();
    }

    @Then("debería haber una descripcion relacionada con el libro en el que hizo click el usuario")
    public void deberiaHaberDescripcion() {
        HomePageSearchResultService.verifyDescription();
    }
}
