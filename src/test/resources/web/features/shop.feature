
Feature: Shop page

  Background:
    Given login to automationtesting website

  @ViewBasket-ItemLink
  Scenario Outline:  17. Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway
    When Click on Shop Menu
    And Click on the Add To Basket which adds that book to your basket
    And User can view that Book in the Menu item with price.
    And Now click on Item link which navigates to proceed to check out page.
    And Now user can find total and subtotal values just above the Proceed to Checkout button.
    And The total always < subtotal because taxes are added in the subtotal
    And Now click on Proceed to Check out button which navigates to payment gateway page.
    Then User can view Billing Details,Order Details,Additional details and Payment gateway details.
    And Now user can fill his details <personalData> in billing details form and can opt any payment in the payment method <method>.
    And Now click on Place Order button to complete process
    Then On clicking place-order button user completes the process where the page navigates to Order confirmation page with all details.

    Examples:
      | personalData                                                                                                                                                                                                   | method                  |
      | FirstName:Mariana Noemi,LastName:Cervantes,CompanyName:CrowdarAcademy,EmailAddress:mita_cervantes@hotmail.com,Phone:3816223344,Country:Argentina,Address:Bolivar 2722,Town:Tucuman,State:Tucumán,Postcode:4000 | PayPal Express Checkout |

    @ViewBasket-TaxFuncionality
    Scenario: 12. Shop-Add to Basket-View Basket-Tax Functionality
      When Click on Shop Menu
      And Click on the Add To Basket which adds that book to your basket
      And User can view that Book in the Menu item with price.
      And Now click on Item link which navigates to proceed to check out page.
      And Now user can find total and subtotal values just above the Proceed to Checkout button.
      And The total always < subtotal because taxes are added in the subtotal
      And Tax rate for indian should be 2 percent and for abroad it should be 5 percent

