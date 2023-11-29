package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;

public class ShopService extends ActionManager {
    public static void clickShop() {
        click(ShopConstants.SHOP_BUTTON_XPATH);
    }

    public static void clickAddToBasket() {
        click(ShopConstants.ADD_BASKET_LINK);
    }

    public static void verifyTax() {
        WebElement subtotalElement = getElement(ShopConstants.SUBTOTAL_AMOUNT);
        WebElement totalImpuestoElement = getElement(ShopConstants.TAX_AMOUNT);
        double subtotal = getValues(subtotalElement.getText());
        double totalTax = getValues(totalImpuestoElement.getText());

        if (subtotal != 0) {
            double porcentajeImpuesto = (totalTax / subtotal) * 100;

            final double PORCENTAJE_INDIA = 2.0;
            final double PORCENTAJE_EXTRANJERO = 5.0;

            System.out.println("Porcentaje de impuesto: " + porcentajeImpuesto + "%");

            if (porcentajeImpuesto == PORCENTAJE_INDIA) {
                System.out.println("Tiene impuestos de India");
            } else if (porcentajeImpuesto == PORCENTAJE_EXTRANJERO) {
                System.out.println("Tiene impuestos extranjeros");
            } else {
                System.out.println("Revisar impuestos");
            }
        } else {
            System.out.println("El subtotal es cero. Revisar los valores.");
        }
    }
    private static double getValues(String value) {
        try {
            return Double.parseDouble(value.substring(1));
        } catch (NumberFormatException e) {
            System.err.println("Error al extraer el número: " + e.getMessage());
            return 0.0;
        }
    }

}
