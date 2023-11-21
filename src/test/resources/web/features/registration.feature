@Smoke
Feature: Registration-Sign-in failed


Background:
Given ingreso a la pagina de automationtesting

@RegistroFallido
Scenario Outline: Registro fallido
  When hago clic en el menú Mi Cuenta
  And ingresa una dirección de correo electrónico <correo> en el campo de dirección de correo electrónico
  When ingresa una contraseña <contrasenia> vacía en el campo de contraseña
  And hacer click en el botón Registrarse
  Then el registro debería fallar con un mensaje <resultado>

@ContraseniaVacia
  Examples:
    | correo                     | contrasenia | resultado                        |
    | mita_cervantes@hotmail.com |             | Ingrese una contraseña de cuenta |
#Falla por contrasenia vacia

  @CorreoRegistrado
  Examples:
    | correo  | contrasenia | resultado                  |
    | mita_cervantes@hotmail.com  | Cmita2021#  | Nombre de usuario invalido |
#Falla por correo registrado

  @CorreoVacio
  Examples:
    | correo | contrasenia | resultado                                   |
    |        | Cmita2021#  | Ingrese una dirección de correo electrónico |
#Falla por correo vacio


