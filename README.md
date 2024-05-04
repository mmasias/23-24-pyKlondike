# Nuestro intento de Klondike

De momento tenemos:

## Clases propuestas y sus respectivas vistas públicas

- **Klondike**
  - [x] Constructor()
  - [x] void jugar()
- **Baraja**
  - [x] Constructor
  - [x] void mostrar()
  - [x] void moverA(Descarte descarte)
  - [x] Carta sacar()
- **Columna**
  - [ ] Constructor(Baraja baraja, int numeroColumna)
  - [ ] void mostrar()
  - [ ] void moverA(Palo palo)
  - [ ] void moverA(Columna columna)
  - [ ] void voltear
- **Descarte**
  - [ ] void mostrar()
  - [ ] void moverA(Palo palo)
  - [ ] void moverA(Columna columna)
  - [ ] void poner(Carta carta)
  - [ ] void voltear(Baraja baraja)
- **Palo**
  - [ ] mostrar()
  - [ ] moverA(Columna columna)
- **Carta**
  - [ ] Constructor(int palo, int numero)
  - [ ] void mostrar()
  - [ ] void voltear()
