## Revisión de código
### Observaciones generales
- En general se repite lógica de métodos como 'mostrar()' en distintas clases como en Palo y Baraja.
- Se repite el método 'vacia()' con el mismo código y lógica en las clases Baraja, Columna, Descarte y Palo.

### Clase Baraja
Al atributo entero 'ultima' no se le da ningún valor inicial. Sin embargo, en el método constructor de la clase, es inicializado con el valor 0. Si se hubiera inicializado y dado un valor la primera vez, no sería necesario incluirlo en el método constructor.

### Clase Carta
Al atributo booleano 'bocaArriva' no se le da ningún valor inicial. Sin embargo, en el método constructor de la clase, es inicializado con el valor 'false'. Si se hubiera inicializado y dado un valor la primera vez, no sería necesario incluirlo en el método constructor.

### Clase Columna
Al atributo entero 'ultima' no se le da ningún valor inicial. Sin embargo, en el método constructor de la clase, es inicializado con el valor 0. Si se hubiera inicializado y dado un valor la primera vez, no sería necesario incluirlo en el método constructor. Lo mismo ocurre con el array Carta[] cartas, su inicialización puede haccerse fuera del método constructor.

Existen dos métodos con el mismo nombre, 'moverA', aunque reciben distintos tipos de atributos, el hecho de llamrse igual puede dar lugar a confusiones  a la hora de llamar a cualquiera de los dos métodos. Además, se repite código en los dos métodos.

### Clase Descarte
Al atributo entero 'ultima' no se le da ningún valor inicial. Sin embargo, en el método constructor de la clase, es inicializado con el valor 0. Si se hubiera inicializado y dado un valor la primera vez, no sería necesario incluirlo en el método constructor. Lo mismo ocurre con el array Carta[] cartas, su inicialización puede hacerse fuera del método constructor.

Al igual que en la clase Columna, hay dos métodos de nombre 'moverA', que pude dar lugar a confusiones. Además, los códigos entre los dos métodos es muy similar, casi idéntico.

### Clase Intervalo
Hay demasiada cantidad de métodos.

En el método 'interseccion', se abusa de los return. Se recomienda almacenar el valor de cada return una misma variable y finalmente devolverla en un único retur.

Hay dos métodos con el mismo nombre, 'incluye', esto puede dar lugar a confusiones.

### Clase Palo
Al atributo entero 'ultima' no se le da ningún valor inicial. Sin embargo, en el método constructor de la clase, es inicializado con el valor 0. Si se hubiera inicializado y dado un valor la primera vez, no sería necesario incluirlo en el método constructor. Lo mismo ocurre con el array Carta[] cartas, su inicialización puede hacerse fuera del método constructor.

### Clase Klondike
Se implementan tanto los métodos del juego como el main en una misma clase. Se recomienda crear una nueva clase para el método main e iniciar el juego.
