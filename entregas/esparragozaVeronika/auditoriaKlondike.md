## Autor: Veronika Esparragoza

# Klondike

El siguiente documento es una auditoría al código realizado del proyecto Klondike.

## 1. Estructura
Todos los documentos necesarios en el proyecto se encuentran en la raíz del proyecto.
Recomendaría lo siguiente:
1. Organización en paquetes:
Podría organizarse por paquetes las clases relacionadas. Por ejemplo, en el patrón MVC se podría adjuntar en el paquete *model* para la clase Baraja y Carta, y el paquete *view* para la clase Menu.

## 2. Clases participantes
A continuación añado algunas observaciones de todo el proyecto sobre comportamientos que deberían mejorarse:

- Los métodos de tipo constructor, deberían ser los primeros que aparecieran antes que el resto.
- Se mezclan palabras de Inglés y Español en los mismos métodos, procura tener un mismo idioma.
- El nombre de los métodos y atributos no son tan descriptivos como deberían, son ambiguos o poco claros.
- No se reutilizan valores como el *Numero de Palos*, dado que se vuelve a declarar y dar el mismo valor en las clases **Baraja** y **Klondike**, esto puede llevar a un error dado que se encuentra repetido.
- Se debería añadir el manejo de excepciones.
- Se debería separar la vista (o tambien llamada lógica de entrada/salida) de la lógica del negocio, esto para mejorar la modularidad y la claridad del código.
- Los atributos que se encuentran en todos las clases, tales como *int palo*, *int numero*, *Carta[] cartas*, *Baraja baraja*, *Palo[] palos*, *Descarte descarte*, *Columna[] columnas* deberían ser declaradas como estaticas finales para evitar crear nuevas instancias de estos arreglos cada vez que se instancia una nueva carta.


Ya dicho lo general, adjunto observaciones especificas de cada clase que necesite alguna otra correción:


### 2.1 Intervalo.java
1. En esta clase se pueden encontrar varios ejemplos de Código Muerto o no utilizado en el proposito del proyecto, se recomendaría eliminarlos para reducir la complejidad y mejorar la legibilidad del código.
Se puede notar lo anterior con los métodos:
- [Intervalo(double superior)](https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L32)
- [Intervalo()](https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L40)
- [desplazado(double desplazamiento)](https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L57)
- [equals(Intervalo intervalo)](https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L73)
- [interseccion(Intervalo intervalo)](https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L79)
- [oponer()](https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L99)
- [doblar()](https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L106)
- [recoger()](https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L112)
- [mostrar()](https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L119)



2. Algunos métodos se encuentran públicos cuando deberían ser privados, esto porque se utilizan en la misma clase, tales como:
- [intersecta(Intervalo intervalo)](https://github.com/mmasias/23-24-pyKlondike/blob/f71634b4469e5017c4238f9b8d88a2a5271f50cf/src/Intervalo.java#L36)
Con esto procurar no producir una intimidad inapropiada.
