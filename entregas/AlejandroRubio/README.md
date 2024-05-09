
## Clase Klondike
Esta clase presenta un posible problema el cual es que esta clase manipula directamente a otras clases (Baraja, Palo, Descarte, Columna, y Menu) esto resulta en alto acoplamiento, pero esta clase es la esta encargada en correr el juego por ende estos problemas no son tan criticos

## Clase Baraja
Esta clase esta bien estructurada y no presenta violaciones a las reglas de la programacion modular

## Clase Carta
Esta clase tampoco presenta problemas de diseño o de esctructura

## Clase Columna
Esta clase no presenta problemas criticos pero hay algunas sugerencias como cambiar algunos nombres de variables para que sean ma descripttivas como [apilable](https://github.com/mmasias/23-24-pyKlondike/blob/c382692c663f874ab4a6c8f7641303d4df024144/src/Columna.java#L84) a otro nombre como puedeApilarCarta

## Clase Descarte
Esta clase parece estar bien estructurada

## Clase Intervalo
Esta clase tambien sigue las reglas de la programacion modular 

## Clase Menu
Esta clase tambien sigue las reglas de la programacion modular 

## Clase Palo
Esta clase tambien sigue las reglas de la programacion modular 

## En General
El porgrama  presenta un gran acoplamiento, en la clase intervalo el metodo [recoger](https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L112) no se usa en ningun parta
