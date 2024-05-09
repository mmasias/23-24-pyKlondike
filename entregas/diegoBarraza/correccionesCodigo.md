#Correcciones para Codigo de Klondike

A primer vista, revisando el codigo, viendo cada clase, esto es lo que puedo decir de cada una y lo que se puede corregir en caso tenga algo que se pueda mejorar.

##Clase Klondike:
-A simple vista y por lo que se puede ver, tiene muchos metodos para ser una clase en la que solo se tengan que iniciar otros metodos,como por ejemplo, el metodo jugar(https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Klondike.java#L26),me parece que es un metodo que esta sobrecargando la clase y de hecho se pudiera hacer otra clase a partir de ella, que lleve el metodo jugar y que aparte de eso lleve todos los metodos que van adentro de ella y que se crearon en la clase Klondike.
-Los metodos escogerPalo,escogerColumna y escogerOpcion, hacen de que el acoplamiento de esta clase no sea del todo eficiente y en este caso pudiera hacerse otra clase que pudiera llamarse gestionador, que gestione dichos metodos.

##Clase Menu:
-De esta clase no veo mucho problema, todo parece estar correcto y con un buen uso de responsabilidad, lo unico que a la hora de instanciar, los atributos tienen que estar arriba cuando se inicializa la clase y no en el metodo.

##Clase Carta:
-El unico cambio que hiciera en esta clase es tratar de ocupar un poco mas de encapsulamiento en el metodo distintoColor(https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Carta.java#L54) 
-En el metodo Mostrar (https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Carta.java#L21), estamos volviendo a nombrar variables con el mismo nombre que ya habiamos utilizado un poco mas arriba en la clase, en este caso son la variable numero y palo, seria de cambiar el nombre para no confundirnos a la hora de querer ocuparlos.

##Clase Baraja:
-Veo todo bien y a mi parecer no hay nada que se pueda cambiar, todo se puede explicar a simple vista viendo el codigo y aparte la estructura del codigo tambien está bien definida, igual las responsabilidads y el encapsulamiento.

##Clase Columna:
-Igual esta clase me parece bien hecha, la estructura esta muy bien definida, las responsabilidades,cada clase hace lo que se tiene que hacer y tambien hay un buen manejo de errores por si acaso no se pone lo que se quiere que se ponga a la hora que se ejecute el codigo.

##Clase Descarte:
-Esta clase ocupa algunos metodos de la clase Columna, todo parece que esta bien definido y pues como tiene metodos similares a la clase columna pues tiene las mismas cualidades mencionadas en la clase pasada.

##Clase Intervalo:
-Tiene muchos metodos que a la hora de ver el codigo hacen que se sobrecarge la clase
-Se pueden refactorizar los constructores de intervalo (https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L27) , ya que se llaman 4 veces distintas y pues lo mejor seria que se haga solo un constructor con todos los parametros que se han puesto en los diferentes constructores de intervalo.
-El metodo incluye (https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L63) se repite dos veces el nombre, para que se entienda mejor y no haya confusion a la hora de ocupar estos metodos, seria bueno que se cambie el nombre de uno de estos metodos, ya que llevan el mismo nombre pero hacen cosas diferentes,entonces a la hora de llamarlos, no se supiera a cual metodo se llama.

##Clase Palo:
-Esta clase no tiene ningun problema en absoluto, a mi punto de vista no hay nada que cambiar ya que el codigo es legible y se ocupa reutilizacion de codigo ya que se ocupan metodos que ya en otras clases ya se han ocupado,tiene buen reparto de responsabilidades y no hay metodos redundantes.

En general, este codigo hace lo que se le pide que tiene que hacer, pero a la hora de verlo, hay algunas correcciones que se puedan hacer para que el codigo pueda ser mas flexible y entendible.
