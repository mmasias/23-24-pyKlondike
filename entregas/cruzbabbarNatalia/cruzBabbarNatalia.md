# Natalia Cruz Babbar

## Analisis sobre codigo 

### Separacion de responsabilidades
1.  Creacion de una clase separada para gestionar el metodo `voltear()`
Para mejorar la modularidad y cohesion entre clases, se propone separar este metodo a una clase aparte.

- Ejemplo: En la clase `Descarte`:
https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Descarte.java#L63 

La clase Descarte debe encargarse solamente de *descartar* cartas, sin embargo, tambien tiene la logica de de `voltear` cartas. 


2. Creacion de una clase separada para gestionar el metodo `MoverA()`
Se propone la creacion de una clase aparte, la cual puede llamarse `Movimiento` la cual sea la responsable de tener todo lo relacionado con mover. Asi e evita que clases como `Baraja`, `Columna`, `Descarte` y `Palo` reduzcan su baja cohesion:
    - `moverA(Palo palo)` https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Columna.java#L37 
    - `moverA(Descarte descarte)` https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Descarte.java#L32
    - `moverA(Columna columna)` https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Columna.java#L51 


### Clean Code
1. Codigo muerto: 
Ejemplo: en la clase `Intervalo`:
https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L112
El método recoger() solicita valores de entrada al usuario, pero no se utiliza en ninguna parte del código.

