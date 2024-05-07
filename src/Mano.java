
public class Mano {

    private Carta[] cartas;
    private int ultima;
    private boolean abierta;

    public Mano(Baraja baraja) {
        ultima = 0;
        cartas = new Carta[10];
        for (int i = 0; i < 2; i++) {
            Carta carta = baraja.sacar();
            carta.voltear();
            this.poner(carta);
        }        
        this.abierta=true;
    }

    private void poner(Carta carta) {
        cartas[ultima] = carta;
        ultima++;
    }

    public void mostrar() {
        System.out.print("Mano: ");
        if (this.vacia()) {
            System.out.println("NADA");
        } else {
            for (int i = 0; i < ultima; i++) {
                cartas[i].mostrar();
            }
        }
        System.out.println();
    }

    private boolean vacia() {
        return ultima == 0;
    }

    public void pedir(Baraja baraja) {
        Carta carta = baraja.sacar();
        carta.voltear();
        this.poner(carta);        
    }

    public void cerrar() {
        this.abierta = false;
    }
}
