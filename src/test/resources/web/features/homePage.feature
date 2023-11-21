@Smoke
Feature: HomePage

Background:
  Given ingreso a la pagina de automationtesting

@ElementosHomePAge
Scenario Outline: Verificar elementos en la página de inicio
  When hago clic en el menú Shop
  And hago clic en el botón de menú Home
  Then debería ver <cantidad> <elemento> en la página de inicio

  Examples:
    | cantidad           | elemento   |
    | tres               | sliders    |
    | tres               | ingresos   |

@RedireccionIngreso
Scenario: Verificar redireccion cuando clickeo en un ingreso
  When hago clic en el menú Shop
  And hago clic en el botón de menú Home
  When hago clic en la imagen de uno de los ingresos
  Then debería ser redirigido a la siguiente página donde el usuario puede agregar ese libro a su carrito


@Descripcion
Scenario: Verificar descripcion de imagen
  When hago clic en el menú Shop
  And hago clic en el botón de menú Home
  When hago clic en la pestaña descripcion para el libro en el que hice click
  Then debería haber una descripcion relacionada con el libro en el que hizo click el usuario



