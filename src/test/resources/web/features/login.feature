
Feature: Login

Background:
  Given login to automationtesting website

@LoginFails
Scenario Outline:  7. Login-Handles case sensitive
  When click on My Account Menu
  And enter the case changed email <email> in email textbox
  And enter the case chenged password <password> in the password tetxbox
  And now click on login button
  Then login must fail saying incorrect username password <errorMessage>

  Examples:
    | email                      | password   | errorMessage                                                                                                  |
    | MITA_CERVANTES@HOTMAIL.COM | CMITA2021# | Error: The password you entered for the username MITA_CERVANTES@HOTMAIL.COM is incorrect. Lost your password? |


@Login
Scenario Outline:  8. Login-Authentication
  When click on My Account Menu
  And enter the case email <email> in email textbox
  And enter the case password <password> in the password tetxbox
  And now click on login button
  And once your are logged in
  And sign out of the site
  And now press back button
  Then user shouldn’t be signed in to his account rather a general webpage must be visible

  Examples:
    | email                      | password   |
    | mita_cervantes@hotmail.com | Cmita2021# |