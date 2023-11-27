
Feature: Iniciar sesion con nombre de usuario y contraseña

Background:
  Given ingreso a la pagina de automationtesting

@Login
Scenario: Login Exitoso
  When hago clic en el menú Mi Cuenta
  And ingreso el nombre de usuario mita_cervantes@hotmail.com en el campo de nombre de usuario
  When ingreso la contraseña Cmita2021# en el campo de contraseña
  And hago clic en el botón de inicio de sesión
  Then el usuario debe iniciar sesión correctamente en la página web

@LoginFalla
Scenario Outline: Login fallido
  When hago clic en el menú Mi Cuenta
  And ingreso el nombre de usuario <tipoUsuario> en el campo de nombre de usuario
  When ingreso la contraseña <contrasenia> en el campo de contraseña
  And hago clic en el botón de inicio de sesión
  Then se debe mostrar el mensaje <resultado>

@Incorrecto
  Examples:
    | tipoUsuario | contrasenia | resultado                  |
    | incorrecto  | incorrecta  | Nombre de usuario invalido |
#Falla por usuario y contrasenia incorrectos

@campoVacio
  Examples:
    | tipoUsuario                | contrasenia | resultado            |
    | mita_cervantes@hotmail.com |             | Contrasenia invalida |
#Falla por usuario valido y contrasenia vacia