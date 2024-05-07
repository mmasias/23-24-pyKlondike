# Nuestro intento de Klondike

## ¡Versión beta 002!

Se actualiza el método `moverA()` de la clase `Columna` para que tenga en cuenta que se pueden mover múltiples cartas a la vez en una misma jugada. Nótese como la cabecera del método no cambia (no tendría por qué hacerlo, la idea es la misma, mover de una columna a otra) por tanto no cambia la relación de la clase con el resto de colaboradores, pero se mejora la lógica.

```
OPCIONES>
1. Mover de Baraja a Descarte
2. Mover de Descarte a Palo
3. Mover de Descarte a Columna
4. Mover de Palo a Columna
5. Mover de Columna a Palo
6. Mover de Columna a Columna
7. Voltear carta de Columna
8. Voltear Descarte en Baraja
9. Salir
BARAJA: [? ?]
Descarte: [3 ♠️][A ♦️][9 ♦️]
1º Palo: [A ♣️]
2º Palo: No hay cartas en el palo
3º Palo: No hay cartas en el palo
4º Palo: No hay cartas en el palo
Columna [1]: [8 ♠️][7 ♦️]
Columna [2]: [? ?][9 ♣️][8 ♥️]
Columna [3]: [? ?][? ?][Q ♥️][J ♣️][X ♦️]
Columna [4]: [? ?][? ?][5 ♥️]
Columna [5]: [? ?][? ?][? ?][5 ♠️]
Columna [6]: [? ?][? ?][? ?][5 ♦️]
Columna [7]: [? ?][? ?][? ?][? ?][? ?][? ?][2 ♠️]
Elige una opción  [1-9]
6
¿De qué columna? [1-7]
2
¿A qué columna? [1-7]
3
OPCIONES>
1. Mover de Baraja a Descarte
2. Mover de Descarte a Palo
3. Mover de Descarte a Columna
4. Mover de Palo a Columna
5. Mover de Columna a Palo
6. Mover de Columna a Columna
7. Voltear carta de Columna
8. Voltear Descarte en Baraja
9. Salir
BARAJA: [? ?]
Descarte: [3 ♠️][A ♦️][9 ♦️]
1º Palo: [A ♣️]
2º Palo: No hay cartas en el palo
3º Palo: No hay cartas en el palo
4º Palo: No hay cartas en el palo
Columna [1]: [8 ♠️][7 ♦️]
Columna [2]: [? ?]
Columna [3]: [? ?][? ?][Q ♥️][J ♣️][X ♦️][9 ♣️][8 ♥️]
Columna [4]: [? ?][? ?][5 ♥️]
Columna [5]: [? ?][? ?][? ?][5 ♠️]
Columna [6]: [? ?][? ?][? ?][5 ♦️]
Columna [7]: [? ?][? ?][? ?][? ?][? ?][? ?][2 ♠️]
Elige una opción  [1-9]
```

## Clases propuestas y sus respectivas vistas públicas

- **Klondike**
  - [x] Klondike()
  - [x] void jugar()
- **Menu**
  - [x] void mostrar()
  - [x] int getOpcion()
- **Baraja**
  - [x] Baraja()
  - [x] void mostrar()
  - [x] void moverA(Descarte descarte)
  - [x] void poner(Carta carta)
  - [x] Carta sacar()
  - [x] boolean vacia()
- **Descarte**
  - [x] Descarte()
  - [x] void mostrar()
  - [x] void moverA(Palo palo)
  - [x] void moverA(Columna columna)
  - [x] void voltear(Baraja baraja)
  - [x] void poner(Carta carta)
- **Palo**
  - [x] Palo()
  - [x] void mostrar()
  - [x] void moverA(Columna columna)
  - [x] void moverA(Palo palo)
  - [x] void poner(Carta carta)
- **Columna**
  - [x] Columna(Baraja baraja, int numeroColumna)
  - [x] void mostrar()
  - [x] void moverA(Palo palo)
  - [x] void moverA(Columna columna)
  - [x] void voltear()
  - [x] void poner(Carta carta)
- **Carta**
  - [x] Carta(int palo, int numero)
  - [x] void mostrar()
  - [x] void voltear()
  - [x] boolean esAs()
  - [x] boolean esRey()
  - [x] boolean igualPalo(Carta carta)
  - [x] boolean siguiente(Carta carta)
  - [x] boolean bocaArriba()
  - [x] boolean distintoColor(Carta carta)

## Clases de apoyo

- **Intervalo**
