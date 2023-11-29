package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.util.MapUtils;
import lippia.web.constants.HomePageConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomePageService extends ActionManager {


    public static void clickHome() {
        click(HomePageConstants.HOME_BUTTON_XPATH);
    }

    public static void arrivalsVerification() {
        List<WebElement> imagenes = getElementsByParent(HomePageConstants.ARRIVALS_DIV, HomePageConstants.IMG_ARRIVALS);
        Assert.assertEquals(3, imagenes.size());
    }

    public static void clickImageArrival(String image) {
        switch (image) {
            case "Selenium Ruby":
                click(HomePageConstants.SELENIUM_BOOK);
                break;
            case "Thinking in HTML":
                click(HomePageConstants.HTML_BOOK);
                break;
            case "Mastering Javascript":
                click(HomePageConstants.JAVASCRIPT_BOOK);
                break;
            default:
                System.out.println("Error clicked image" + image);
                break;
        }
    }

    public static void bookWithPriceInTheMenuItem() {
        waitVisibility(ShopConstants.PRICE_MENU_ITEM);
        Assert.assertTrue(isVisible(ShopConstants.PRICE_MENU_ITEM));
    }

    public static void clickAddToBasket() {
        click(HomePageConstants.ADD_BASKET);
    }

    public static void navigatingAddBookPageVerification() {
        waitVisibility(HomePageConstants.ADD_BASKET);
        Assert.assertTrue(isVisible(HomePageConstants.ADD_BASKET));
    }

    public static void clickItemLink() {
        waitTime(1000);
        click(ShopConstants.PRICE_MENU_ITEM);
    }

    public static void findTotalAndSubtotalValues() {
        waitVisibility(ShopConstants.SUBTOTAL_VALUE);
        Assert.assertTrue(isVisible(ShopConstants.SUBTOTAL_VALUE));
        waitVisibility(ShopConstants.TOTAL_VALUE);
        Assert.assertTrue(isVisible(ShopConstants.TOTAL_VALUE));
    }

    public static void validateAmounts() {
        WebElement subtotal = getElement(ShopConstants.SUBTOTAL_AMOUNT);
        WebElement total = getElement(ShopConstants.TOTAL_AMOUNT);
        double Subtotal = Double.parseDouble(subtotal.getText().substring(1));
        double Total = Double.parseDouble(total.getText().substring(1));
        Assert.assertTrue(Subtotal < Total, "El subtotal no es menor al total");
    }

    public static void clickProceedCheckOut() {
        click(HomePageConstants.PROCEED_CHECK_OUT_BUTTON);
    }

    public static void verifyCheckOutDetails() {
        waitVisibility(HomePageConstants.BILLING_DETAILS);
        Assert.assertTrue(isVisible(HomePageConstants.BILLING_DETAILS));
        Assert.assertTrue(isVisible(HomePageConstants.ADDITIONAL_INFORMATION));
        Assert.assertTrue(isVisible(HomePageConstants.YOUR_ORDER));
        Assert.assertTrue(isVisible(HomePageConstants.PAYMENT_METHOD_DIV));
        Assert.assertTrue(isVisible(HomePageConstants.FORM_PLACE_ORDER));
    }

    public static void setDataBillingForm(String details) {
        Map<String, String> data = MapUtils.splitIntoMap(details, ",", ":");
        setInput(HomePageConstants.FIRST_NAME, data.get("FirstName"));
        setInput(HomePageConstants.LAST_NAME, data.get("LastName"));
        setInput(HomePageConstants.COMPANY_NAME, data.get("CompanyName"));
        setInput(HomePageConstants.EMAIL, data.get("EmailAddress"));
        setInput(HomePageConstants.PHONE, data.get("Phone"));
        setInput(HomePageConstants.ADDRESS, data.get("Address"));
        setInput(HomePageConstants.TOWN, data.get("Town"));
        setInput(HomePageConstants.POSTCODE, data.get("Postcode"));

        setInput(HomePageConstants.COUNTRY, data.get("Country"));
        String country = data.get("Country");
        if (country != null) {
            String xpath = String.format("xpath:(//span[contains(.,'%s')])", country);
            click(xpath);
        } else {
            System.out.println("País no encontrado: " + country);
        }

        setInput(HomePageConstants.STATE, data.get("State"));
       String state = data.get("State");
        if (state != null) {
            String xpath = String.format("xpath:(//span[contains(.,'%s')])", state);
            click(xpath);
        } else {
            System.out.println("Ciudad no encontrada: " + state);
        }

    }

    public static void selectPaymentMethod(String method) {
        Actions action = new Actions(DriverManager.getDriverInstance());

        Map<String, String> paymentMethods = new HashMap<>();
        paymentMethods.put("Direct Bank Transfer", "payment_method_bacs");
        paymentMethods.put("Check Payments", "payment_method_cheque");
        paymentMethods.put("Cash on Delivery", "payment_method_cod");
        paymentMethods.put("PayPal Express Checkout", "payment_method_ppec_paypal");


        String paymentElement = paymentMethods.get(method);
        if (paymentElement != null) {
            WebElement element = getElement(HomePageConstants.PAYMENT_METHOD_CHECKBOX + paymentElement);
            System.out.println("Locator resultante: " + HomePageConstants.PAYMENT_METHOD_CHECKBOX + paymentElement);

            action.moveToElement(element).click().perform();
        } else {
            System.out.println("No se puede hacer clic en " + method);
        }
    }

    public static void waitTime(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void verifyAddCoupon() {
        ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("window.scrollTo(0,0)");
        waitTime(1500);
        ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("window.scrollTo(0,0)");
        waitClickable(HomePageConstants.COUPON_LINK);
        Assert.assertTrue(isVisible(HomePageConstants.COUPON_LINK));
        click(HomePageConstants.COUPON_LINK);
        waitVisibility(HomePageConstants.COUPON_FORM);
        Assert.assertTrue(isVisible(HomePageConstants.COUPON_FORM));
    }

    public static void clickPlaceOrderButton(){
        ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        waitTime(1500);
        click(HomePageConstants.PLACE_ORDER_BUTTON);
    }

    public static void orderConfirmationDetails(){
        waitVisibility(HomePageConstants.ORDER_DETAILS_TITLE);
        Assert.assertTrue(isVisible(HomePageConstants.ORDER_DETAILS_TITLE));
        Assert.assertTrue(isVisible(HomePageConstants.ORDER_DATA));
        Assert.assertTrue(isVisible(HomePageConstants.DATE));
        Assert.assertTrue(isVisible(HomePageConstants.TOTAL_DATA));
        Assert.assertTrue(isVisible(HomePageConstants.METHOD_DATA));
        waitTime(1500);
    }


}
