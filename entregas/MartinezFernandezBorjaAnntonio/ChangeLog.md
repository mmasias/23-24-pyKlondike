# Cambios y opiniones de mejora

## Clases: 

- Baraja
  - En el método barajar() guardaria el numero '1000' de iteraciones en una constante 'NumeroBarajeos'.
  - Evitar la creación repetida de objetos Carta.
- Carta
  - En el método mostrar(), podrías evitar asignar valores a las variables numero y palo si la carta no está boca arriba, ya que en ese caso no se mostrará nada.
- Columna
  - Evitar la creación repetida de objetos Carta.
- Descarte
  - En el método mostrar(), podrías optimizar el cálculo de primeraVisible para evitar que sea negativo.
- Intervalo
  - Falta de consistencia en el espaciado de atributos comparado a otras clases.
- Klondike
  - El metodo vacia() podria llamarse estaVacia() para ser mas clara.
- Menu
  - Evitar la creación repetida de objetos Scanner.
- Palo
  - Evitar la creación repetida de objetos Carta.

      
 
Además, en varias clases se repiten métodos como el de moverA() que podría simplemente realizarse una vez de forma genérica.
