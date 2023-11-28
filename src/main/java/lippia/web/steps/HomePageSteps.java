package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomePageService;

public class HomePageSteps extends PageSteps {

    @And("Now click on Home menu button")
    public void clickHome() {
        HomePageService.clickHome();
    }

    @And("Test whether the Home page has Three Arrivals only")
    public void testWhetherTheHomePageHasThreeArrivalsOnly() {
        HomePageService.arrivalsVerification();
    }
    @When("Now click the image (.*) in the Arrivals")
    public void clickTheImage(String image) {
        HomePageService.clickImageArrival(image);
    }
    @And("Test whether it is navigating to next page where the user can add that book into his basket.")
    public void testWhetherItIsNavigatingToNextPage() {
        HomePageService.navigatingAddBookPageVerification();
    }
    @And("Click on the Add To Basket button which adds that book to your basket")
    public void clickOnTheAddToBasketButton() {
        HomePageService.clickAddToBasket();
    }
    @And("User can view that Book in the Menu item with price.")
    public void userCanViewThatBookInTheMenuItemWithPrice() {
        HomePageService.bookWithPriceInTheMenuItem();
    }
    @And("Now click on Item link which navigates to proceed to check out page.")
    public void nowClickOnItemLink() {
        HomePageService.clickItemLink();
    }
    @And("Now user can find total and subtotal values just above the Proceed to Checkout button.")
    public void nowUserCanFindTotalAndSubtotalValues() {
        HomePageService.findTotalAndSubtotalValues();
    }
    @And("The total always < subtotal because taxes are added in the subtotal")
    public void theTotalAlwaysLowThanSubtotal() {
        HomePageService.validateAmounts();
    }
    @And("Now click on Proceed to Check out button which navigates to payment gateway page.")
    public void nowClickOnProceedToCheckOutButton() {
        HomePageService.clickProceedCheckOut();
    }
    @Then("User can view Billing Details,Order Details,Additional details and Payment gateway details.")
    public void userCanViewBillingDetails() {
        HomePageService.verifyCheckOutDetails();
    }

    @And("Now user can fill his details (.*) in billing details form and can opt any payment in the payment method (.*).")
    public void nowUserCanFillHisDetails(String personalData, String method) {
        HomePageService.setDataBillingForm(personalData);
        HomePageService.selectPaymentMethod(method);
    }

    @And("User has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.")
    public void userHasTheFeasibilityToAddCoupon() {
        HomePageService.verifyAddCoupon();
    }

    @And("Now click on Place Order button to complete process")
    public void nowClickOnPlaceOrderButtonToCompleteProcess() {
        HomePageService.clickPlaceOrderButton();
    }
    @Then("On clicking place-order button user completes the process where the page navigates to Order confirmation page with all details.")
    public void ThePageNavigatesToOrderConfirmationPageWithAllDetails() {
        HomePageService.orderConfirmationDetails();
    }



}
