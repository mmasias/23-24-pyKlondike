import java.util.Random;

public class Baraja extends Mazo {

    private static final int PALOS = 4;
    private static final int NUMEROS = 13;
    private static final int TOTAL_CARTAS = PALOS * NUMEROS;

    public Baraja() {
        super(TOTAL_CARTAS);
        for (int palo = 0; palo < PALOS; palo++) {
            for (int numero = 0; numero < NUMEROS; numero++) {
                this.poner(new Carta(palo, numero));
            }
        }
        this.barajar();
    }

    private void barajar() {
        Random aleatorio = new Random();
        for (int i = 0; i < 1000; i++) {
            int origen = aleatorio.nextInt(TOTAL_CARTAS);
            int destino = aleatorio.nextInt(TOTAL_CARTAS);
            Carta carta = cartas[origen];
            cartas[origen] = cartas[destino];
            cartas[destino] = carta;
        }
    }

    public void mostrar() {
        super.mostrar("BARAJA: ", "No hay cartas en la baraja", 1);
    }

    public void descartar(Descarte descarte) {
        if (this.vacia()) {
            System.out.println("¡No hay cartas en la baraja!");
        } else {
            int contador = 3;
            while (contador > 0 && !this.vacia()) {
                Carta carta = this.sacar();
                carta.voltear();
                descarte.poner(carta);
                contador--;
            }
        }
    }
}
