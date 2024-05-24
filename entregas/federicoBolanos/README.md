# Federico Bolaños

-*- Organización -*-
Las clases han sido creadas de una manera intuitiva, tomando en cuenta todos los aspectos mas importantes del juego y su interfaz. Cada clase contiene solo los métodos que son relevantes a ellas, y se han separado funciones cuando conllevan código que dificultaría la legibilidad.

-*- Complejidad Lógica -*-
El nivel de complejidad lógica, a pesar de ser un juego en el que el juegador tiene varias opciones, es aceptable. Sólo se sigue un solo camino lógico a través del código.

-*- Longitud -*-
No hay más código del que necestia haber. Además las clases tienen metodos conretos y separados. 

-*- Cohesión -*-
Las clases y sus métodos tienen un bajo número de parametros, lo cual indica que hay un alto nivel de cohesión, ya que cada no hay clases compartiendo funcionalidades.

-*- Duplicación de Código -*-
No hay código duplicados en el proyecto.

-*- Errores -*-
El códiogo no genera errores de compilación, pero no hay manejo de excepciones.

-*- Legibilidad -*-
Hay algunos metodos cuyos nombres no describen aptamente su funcionalidad. Por ejemplo, en la clase Carta, los metodos boolean rojo() y boolean negro() no comunican bien a funcionalidad del metodo.
Además, no se han seguido las convenciones de nombramiento a traves de proyecto. Esto se puede ver en la misma clase Carta, donde los metodos boolean rojo(), y bollean esRey() tienen funcionalidades similares, pero estan nombrados diferentemente.