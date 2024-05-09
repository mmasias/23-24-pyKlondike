## Code Smells - Guzmán González-Riancho Gutiérrez

### 1. Duplicación de Código

**Problema:** Repetición de métodos similares en varias clases para mostrar información.  
**Ejemplo:** Los métodos `mostrar()` en las clases `Baraja`, `Palo`, `Descarte` y `Columna`.  
**Solución:** Crear una interfaz común o clase abstracta que defina el método `mostrar()` para utilizar su implementación en todas las clases que lo necesiten.

### 2. Clases Sobrecargadas

**Problema:** `Klondike` gestiona múltiples aspectos del juego como la lógica principal, inicialización de objetos y la interacción con el usuario.  
**Ejemplo:** El constructor de `Klondike` y el método `jugar()`.  
**Solución:** Dividir las funciones en clases separadas que manejen específicamente la inicialización y la interacción con el usuario.

### 3. Dependencia Directa en Implementaciones

**Problema:** Métodos que manipulan directamente instancias de otras clases.  
**Ejemplo:** Los métodos `moverA()` en las clases `Palo` y `Columna`.  
**Solución:** Utilizar interfaces para definir comportamientos comunes y disminuir el acoplamiento.

### 4. Métodos con Múltiples Responsabilidades

**Problema:** Métodos que realizan varias acciones lógicas.  
**Ejemplo:** El método `moverA()` en `Palo` verifica condiciones, realiza el movimiento y gestiona errores.  
**Solución:** Separar estos métodos en funciones más pequeñas con una sola responsabilidad.

### 5. Manejo Inadecuado de Errores

**Problema:** Se utilizan impresiones en consola para gestionar errores.  
**Ejemplo:** Uso de `System.out.println("No se puede!")` en movimientos no permitidos.  
**Solución:** Implementar un sistema de excepciones o de registro de eventos (logging) para un manejo de errores más efectivo.

### 6. Acceso Público a Métodos Internos

**Problema:** Métodos que son públicos pero deberían tener un acceso más restringido.  
**Ejemplo:** El método `poner()` en `Baraja` que es usado principalmente internamente.  
**Solución:** Revisar y ajustar los niveles de acceso para proteger la integridad de las clases.
