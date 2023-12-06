#language: es
Característica: seleccionar cancion aleatoria en youtube
  @busqueda

  Escenario: Seleccionar el titulo de una cancion aleatoria en youtube
    Dado que el usuario ingrese a youtube
    Cuando busca una cancion y la selecciona aleatoriamente
    Entonces el usuario debera visualizar el titulo de la cancion seleccionada
