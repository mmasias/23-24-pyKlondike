
public class Palo extends Mazo {

    public Palo() {
        super(13);
    }

    public void mostrar() {
        System.out.print("Palo: ");
        if (this.vacia()) {
            System.out.println("No hay cartas en el palo");
        } else {
            Carta carta = this.cima();
            carta.mostrar();
            System.out.println();
        }
    }

    private Carta cima() {
        return cartas[ultima - 1];
    }

    public void moverA(Columna columna) {
        if (this.vacia()){
            System.out.println("No se puede!");
        }else{
            Carta carta = this.sacar();
            if (columna.apilable(carta)){
                columna.poner(carta);
            } else {
                this.poner(carta);
                System.out.println("Invalido");
            }
        }
    }

    public boolean apilable(Carta carta) {
        return this.vacia() && carta.esAs() ||
        !this.vacia() && carta.igualPalo(this.cima()) && carta.siguiente(this.cima());
    }
}
