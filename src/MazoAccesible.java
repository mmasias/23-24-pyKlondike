
class MazoAccesible extends Mazo {

    public MazoAccesible(int numeroCartas) {
        super(numeroCartas);
    }

    public void moverA(Palo palo) {
        if (this.vacia()) {
            System.out.println("No hay cartas en el descarte.");
        } else {
            Carta carta = this.sacar();
            if (palo.apilable(carta)) {
                palo.poner(carta);
            } else {
                System.out.println("Jugada inválida.");
            }
        }
    }

    public void moverA(Columna columna) {
        if (this.vacia()) {
            System.out.println("No se puede mover");
        } else {
            Carta carta = this.sacar();
            if (columna.apilable(carta)) {
                columna.poner(carta);
            } else {
                System.out.println("No se puede");
            }
        }
    }
}
