# Entregas

1. Creación repetida de objetos 'Scanner'

- En múltiples clases,como 'Menu' y 'Klondike',cada vez que se requiere entrada del usuario se crea una nueva instancia de 'Scanner'.Esto no solo es ineficiente,sino que puede generar fugas de recursos si los objetos Scanner no se cierran correctamente.

Solución propuesta: inicializar un único objeto 'Scanner' en una clase principal o de utilidad y pasarlo a los métodos que lo requieran.


2. Visibilidad restringida en la clase 'Intervalo'

- Los métodos 'getInferior()' y 'getSuperior()' son privados,lo que limita su utilidad fuera de la clase,aunque son necesarios para realizar validaciones y operaciones en otras clases.

Solución propuesta: cambiar los modificadores de acceso de estos métodos a 'public' para permitir el acceso desde otras clases.


3. Manejo de excepciones en entrada del usuario

- En la clase 'Menu', el método 'getOpcion()' utiliza un 'Scanner' para leer un entero sin manejar la posibilidad de que la entrada no sea númerica,lo que podría causar una excepción.

Solución propuesta: añadir un bloque try-catch para capturar la excepción y solicitar de nuevo la entrada al usuario.


4. Uso recursivo de setters en la clase 'Intervalo'

- Los constructores de 'Intervalo' utilizan setters para establecer valores que a su vez llaman a otros setters.Esto puede llevar a una pilla de llamadas excesiva y difícil de rastrear.

Solución propuesta: rediseñar los setters para que no dependad unos de otros o inicializar los campos directamente en los constructores.


5. Optimización del método 'mostrar' en clases de manipulación de cartas.

- Las clases como 'Baraja','Descarte' y 'Columna' utilizan el método 'mostrar()' para imprimir el estado actual,lo cual puede ser llamado frecuentemente y afectar el rendimiento si el número de cartas es grande.

Solución propuesta: optimizar el método 'mostrar' para reducir la complejidad,posiblemente agregando una representación en caché del estado que se actualice solo cuando cambie.


6. Inconsistencia y redundancia en el manejo de la baraja y descarte.

- En 'Klondike', las operaciones entre 'Baraja' y 'Descarte' pueden mejorarse para evitar redundancias y posibles errores de lógica al trasladar cartas.

Solución propuesta: refactorizar el código para consolidar las operaciones comunes en métodos útiles y asegurarse de que todas las transiciones de estado sean coherentes y manejan correctamente los casos de borde.



Carpeta para entregas, siguiendo el formato apellidoNombre
