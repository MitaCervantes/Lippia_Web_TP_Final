@Smoke
Feature: HomePage

Background:
  Given login to automationtesting website

@Checkout-Payment-Gateway
  Scenario Outline:  17. Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway
  When Click on Shop Menu
  And Now click on Home menu button
  And Test whether the Home page has Three Arrivals only
  And Now click the image <image> in the Arrivals
  And Test whether it is navigating to next page where the user can add that book into his basket.
  And Click on the Add To Basket button which adds that book to your basket
  And User can view that Book in the Menu item with price.
  And Now click on Item link which navigates to proceed to check out page.
  And Now user can find total and subtotal values just above the Proceed to Checkout button.
  And The total always < subtotal because taxes are added in the subtotal
  And Now click on Proceed to Check out button which navigates to payment gateway page.
  Then User can view Billing Details,Order Details,Additional details and Payment gateway details.
  And Now user can fill his details <personalData> in billing details form and can opt any payment in the payment method <method>.
  And User has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.

  Examples:
    | image            | personalData                                                                                                                                                                                                   | method                  |
    | Thinking in HTML | FirstName:Mariana Noemi,LastName:Cervantes,CompanyName:CrowdarAcademy,EmailAddress:mita_cervantes@hotmail.com,Phone:3816223344,Country:Argentina,Address:Bolivar 2722,Town:Tucuman,State:Tucumán,Postcode:4000 | PayPal Express Checkout |


  @PlaceOrder
Scenario Outline:  18. Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway-Place order
  When Click on Shop Menu
  And Now click on Home menu button
  And Test whether the Home page has Three Arrivals only
  And Now click the image <image> in the Arrivals
  And Test whether it is navigating to next page where the user can add that book into his basket.
  And Click on the Add To Basket button which adds that book to your basket
  And User can view that Book in the Menu item with price.
  And Now click on Item link which navigates to proceed to check out page.
  And Now user can find total and subtotal values just above the Proceed to Checkout button.
  And The total always < subtotal because taxes are added in the subtotal
  And Now click on Proceed to Check out button which navigates to payment gateway page.
  Then User can view Billing Details,Order Details,Additional details and Payment gateway details.
  And Now user can fill his details <personalData> in billing details form and can opt any payment in the payment method <method>.
  And User has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.
  And Now click on Place Order button to complete process
  Then On clicking place-order button user completes the process where the page navigates to Order confirmation page with all details.

  Examples:
    | image                | personalData                                                                                                                                                                                                   | method         |
    | Mastering Javascript | FirstName:Mariana Noemi,LastName:Cervantes,CompanyName:CrowdarAcademy,EmailAddress:mita_cervantes@hotmail.com,Phone:3816223344,Country:Argentina,Address:Bolivar 2722,Town:Tucuman,State:Tucumán,Postcode:4000 | Check Payments |

