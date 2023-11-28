
Feature: Registration


Background:
Given login to automationtesting website

@RegisterFails
Scenario Outline: 4. Registration with empty password
  When click on My Account Menu
  And enter valid Email Address <email> in Email-Address textbox
  And enter password <password> in password textbox
  And  click on Register button
  Then registration must fail with a warning message <message>


  Examples:
    | email            | password | message                                      |
    | mita@hotmail.com |          | Error: Please enter an account password.     |
    |                  |          | Error: Please provide a valid email address. |
  #Registration fails due to empty data


