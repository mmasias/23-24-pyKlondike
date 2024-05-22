
public class Columna extends MazoAccesible {

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
        super.mostrar("Columna [" + this.posicion + "]: ", "NADA", ultima);
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

    public boolean apilable(Carta carta) {

        return this.vacia() && carta.esRey() ||
                !this.vacia() && this.cima().bocaArriba()
                        && this.cima().siguiente(carta) && this.cima().distintoColor(carta);

    }
}
