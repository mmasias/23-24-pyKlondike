## Revisión de código
### Observaciones generales
- En general se repite lógica de métodos como 'mostrar()' en distintas clases como en [Palo](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Palo.java#L12) y [Baraja](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Baraja.java#L40).
- Se repite el método 'vacia()' con el mismo código y lógica en las clases [Baraja](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Baraja.java#L74), [Columna](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Columna.java#L33), [Descarte](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Descarte.java#L28) y [Palo](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Palo.java#L27).

### Clase Baraja
Al atributo entero [ultima](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Baraja.java#L11) no se le da ningún valor inicial. Sin embargo, en el método constructor de la clase, es inicializado con el valor 0. Si se hubiera inicializado y dado un valor la primera vez, no sería necesario incluirlo en el método constructor.

### Clase Carta
Al atributo booleano [bocaArriva](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Carta.java#L6) no se le da ningún valor inicial. Sin embargo, en el método constructor de la clase, es inicializado con el valor 'false'. Si se hubiera inicializado y dado un valor la primera vez, no sería necesario incluirlo en el método constructor.

### Clase Columna
Al atributo entero [ultima](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Columna.java#L5) no se le da ningún valor inicial. Sin embargo, en el método constructor de la clase, es inicializado con el valor 0. Si se hubiera inicializado y dado un valor la primera vez, no sería necesario incluirlo en el método constructor. Lo mismo ocurre con el array [Carta[] cartas](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Columna.java#L4), su inicialización puede haccerse fuera del método constructor.

Existen dos métodos con el mismo nombre, 'moverA', aunque reciben distintos tipos de atributos, el hecho de llamrse igual puede dar lugar a confusiones  a la hora de llamar a cualquiera de los dos métodos. Además, se repite código en los dos métodos. [moverA(Palo palo)](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Columna.java#L37), [moverA(Columna columna)](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Columna.java#L51)

### Clase Descarte
Al atributo entero [ultima](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Descarte.java#L5) no se le da ningún valor inicial. Sin embargo, en el método constructor de la clase, es inicializado con el valor 0. Si se hubiera inicializado y dado un valor la primera vez, no sería necesario incluirlo en el método constructor. Lo mismo ocurre con el array [Carta[] cartas](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Descarte.java#L4), su inicialización puede hacerse fuera del método constructor.

Al igual que en la clase Columna, hay dos métodos de nombre 'moverA', que pude dar lugar a confusiones. Además, los códigos entre los dos métodos es muy similar, casi idéntico. [moverA(Palo palo)](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Descarte.java#L32), [moverA(Columna columna)](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Descarte.java#L50)

### Clase Intervalo
Hay demasiada cantidad de métodos.

En el método [interseccion](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Intervalo.java#L79), se abusa de los return. Se recomienda almacenar el valor de cada return una misma variable y finalmente devolverla en un único retur.

Hay dos métodos con el mismo nombre, 'incluye', esto puede dar lugar a confusiones. [incluye(double valor)](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Intervalo.java#L63), [incluye(Intervalo intervalo)](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Intervalo.java#L67)

### Clase Palo
Al atributo entero [ultima](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Palo.java#L5) no se le da ningún valor inicial. Sin embargo, en el método constructor de la clase, es inicializado con el valor 0. Si se hubiera inicializado y dado un valor la primera vez, no sería necesario incluirlo en el método constructor. Lo mismo ocurre con el array [Carta[] cartas](https://github.com/luciaZama/23-24-pyKlondike/blob/0357fd5390eecfc9c090f7e26228cc2de9115b3b/src/Palo.java#L4), su inicialización puede hacerse fuera del método constructor.

### Clase Klondike
Se implementan tanto los métodos del juego como el main en una misma clase. Se recomienda crear una nueva clase para el método main e iniciar el juego.
