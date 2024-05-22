
public class Descarte extends MazoAccesible {

    public Descarte() {
        super(52 - 28);
    }

    public void mostrar() {
        super.mostrar("Descarte: ", "No hay cartas en el Descarte", 3);
    }

    public void voltear(Baraja baraja) {
        if (this.vacia() || !baraja.vacia()) {
            System.out.println("No se puede voltear!");
        } else {
            while (!this.vacia()) {
                Carta carta = this.sacar();
                carta.voltear();
                baraja.poner(carta);
            }
        }
    }
}
