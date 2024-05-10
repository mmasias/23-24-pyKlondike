
public class Columna extends Mazo {

    private int posicion;

    public Columna(Baraja baraja, int numeroColumna) {        
        super(19);
        this.posicion = numeroColumna;
        for (int i = 0; i < this.posicion; i++) {
            Carta carta = baraja.sacar();
            if (i == this.posicion - 1) {
                carta.voltear();
            }
            this.poner(carta);
        }
    }

    public void mostrar() {
        System.out.print("Columna [" + this.posicion + "]: ");
        if (this.vacia()) {
            System.out.print("NADA");
        } else {
            for (int i = 0; i < ultima; i++) {
                cartas[i].mostrar();
            }
        }
        System.out.println();
    }

    public void moverA(Palo palo) {
        if (this.vacia()) {
            System.out.println("No se puede");
        } else {
            Carta carta = this.sacar();
            if (palo.apilable(carta)) {
                palo.poner(carta);
            } else {
                this.poner(carta);
                System.out.println("No se puede!");
            }
        }
    }

    public void moverA(Columna columna) {
        if (this.vacia()) {
            System.out.println("no se puede!");
        } else {
            Carta carta = this.sacar();
            if (columna.apilable(carta)) {
                columna.poner(carta);
            } else {
                this.poner(carta);
                System.out.println("No se puede!");
            }
        }
    }

    public void voltear() {
        if (this.vacia()) {
            System.out.println("No hay carta para voltear");
        } else if (this.cima().bocaArriba()) {
            System.out.println("No hay carta boca abajo en la cima");
        } else {
            this.cima().voltear();
        }
    }

    private Carta cima() {
        return cartas[ultima - 1];
    }

    public boolean apilable(Carta carta) {

        return this.vacia() && carta.esRey() ||
                !this.vacia() && this.cima().bocaArriba()
                        && this.cima().siguiente(carta) && this.cima().distintoColor(carta);

    }
}
