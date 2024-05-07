
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
        this.abierta = true;
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
        System.out.println(" - Puntaje: " + obtenerPuntaje() + estado());
    }

    private boolean vacia() {
        return ultima == 0;
    }

    public void pedir(Baraja baraja) {
        Carta carta = baraja.sacar();
        carta.voltear();
        this.poner(carta);
    }

    private int obtenerPuntaje() {
        if (this.vacia()) {
            return 0;
        } else {
            int total = 0;
            int ases = 0;
            for (int i = 0; i < ultima; i++) {
                Carta carta = cartas[i];
                int valor = carta.getNumero() + 1;
                if (valor >= 10) {
                    valor = 10;
                } else if (valor == 1) {
                    ases++;
                    valor = 11;
                }

                total += valor;
            }
            while (total > 21 && ases > 0) {
                total -= 10;
                ases--;
            }
            return total;
        }
    }

    public void cerrar() {
        this.abierta = false;
    }

    public boolean haPerdido() {
        return obtenerPuntaje() > 21;
    }

    public boolean xxi() {
        return obtenerPuntaje() == 21;
    }

    private String estado() {
        return " ==> " + (haPerdido() ? "Perdió" : xxi() ? "Ganó" : "Sigue jugando");
    }
}
