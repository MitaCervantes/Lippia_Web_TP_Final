package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {
    @When("Click on Shop Menu")
    public void clickMenuShop() {
        ShopService.clickShop();
    }
    @And("Click on the Add To Basket which adds that book to your basket")
    public void clickOnTheAddToBasketButton() {
        ShopService.clickAddToBasket();
    }

    @And("Tax rate for indian should be 2 percent and for abroad it should be 5 percent")
    public void taxRateForIndianShouldDifferent() {
        ShopService.verifyTax();
    }
}
