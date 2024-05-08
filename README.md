# Borrador del 21 (Blackjack)

Corregido el bug por no recrear la baraja al iniciar de nuevo. (Discutible...)

```
--------------------
Mano: [9 ♥️][A ♠️] - Puntaje: 20 ==> Sigue jugando
--------------------
1. Pedir
2. Empezar de nuevo
3. Salir
--------------------
1
--------------------
Mano: [9 ♥️][A ♠️][A ♦️] - Puntaje: 21 ==> Ganó
--------------------
1. Pedir
2. Empezar de nuevo
3. Salir
--------------------
```

## Clases propuestas y sus respectivas vistas públicas

- **XXI**
  - [x] XXI()
  - [x] void jugar()
- **Mano**
  - [x] Mano(Baraja baraja)
  - [x] void mostrar()
  - [x] void pedir(Baraja baraja)
  - [x] boolean haPerdido()
  - [x] boolean xxi()
