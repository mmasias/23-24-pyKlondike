
Palo deberia poder juntar: Trebol y picas/Corazones y Rombos UTilizaremos mejor distintoColor en vez de igualPalo

    public boolean apilable(Carta carta) {
        return this.vacia() && carta.esAs() ||
        !this.vacia() && carta.distintoColor(this.cima()) && carta.siguiente(this.cima());
    }

Dentro del metodo moverA, la comprobación que se hace es posterior a quitar la carta de descarte. Si no se puede mover la volvemos a poner donde estaba.

    public void moverA(Palo palo) {
        if (this.vacia()) {
            System.out.println("No hay cartas en el descarte.");
        } else {
            Carta carta = this.sacar();  //Se saca la carta antes de comprobar si puede ir en otro sitio
            if (palo.apilable(carta)) {
                palo.poner(carta);
            } else {
                this.poner(carta); //Si la jugada es invalida se vuleve a poner la carta.
                System.out.println("Jugada inválida.");
            }
        }
    }