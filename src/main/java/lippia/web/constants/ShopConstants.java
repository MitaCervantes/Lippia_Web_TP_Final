package lippia.web.constants;

public class ShopConstants {

    public static final String SHOP_BUTTON_XPATH = "xpath://*[@id='menu-item-40']/a";
    public static final String ADD_BASKET_LINK = "xpath://a[text()='Add to basket']";
    public static final String PRICE_MENU_ITEM = "xpath://*[@id='wpmenucartli']/a";
    public static final String SUBTOTAL_VALUE = "xpath://*[@id='page-34']/div/div[1]/div/div/table/tbody/tr[1]/td";
    public static final String TOTAL_VALUE = "xpath://*[@id='page-34']/div/div[1]/div/div/table/tbody/tr[3]/td";
    public static final String SUBTOTAL_AMOUNT= "xpath://*[contains(@data-title,'Subtotal')]";
    public static final String TOTAL_AMOUNT= "xpath://*[contains(@data-title,'Total')]/strong";
    public static final String TAX_AMOUNT= "xpath:(//span[contains(@class, 'woocommerce-Price-amount amount')])[4]";


}
