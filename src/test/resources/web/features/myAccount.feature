@Smoke
Feature: My Account

  Background:
    Given login to automationtesting website

  @AccountDetails
  Scenario Outline:  7. My Accounts-Account Details
    When click on My Account Menu
    And enter registered email <email> in username input
    And enter password <password> in password input
    And now click on login button
    And user must successfully login to the web page
    And click on Account details
    Then User can view account details where he can change his password also

    Examples:
      | email                      | password   |
      | mita_cervantes@hotmail.com | Cmita2021# |

    @LogOut
    Scenario Outline: 8. My Accounts-Log-Out
      When click on My Account Menu
      And enter registered email <email> in username input
      And enter password <password> in password input
      And now click on login button
      And user must successfully login to the web page
      And click on My Account link
      And click on Logout button
      Then on clicking logout,User successfully comes out from the site


      Examples:
        | email                      | password   |
        | mita_cervantes@hotmail.com | Cmita2021# |