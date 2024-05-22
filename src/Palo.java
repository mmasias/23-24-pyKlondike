
public class Palo extends MazoAccesible {

    public Palo() {
        super(13);
    }

    public void mostrar() {
        super.mostrar("Palo: ", "No hay cartas en el palo", 1);
    }

    public boolean apilable(Carta carta) {
        return this.vacia() && carta.esAs() ||
                !this.vacia() && carta.igualPalo(this.cima()) && carta.siguiente(this.cima());
    }
}
