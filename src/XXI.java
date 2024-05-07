import java.util.Scanner;

class XXI {

    private Baraja baraja;
    private Mano mano;

    public XXI() {
        baraja = new Baraja();
        mano = new Mano(baraja);
    }

    private void jugar() {
        boolean estaJugando = true;

        do {
            mano.mostrar();
            mostrarMenu();
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    mano.pedir(baraja);
                    break;
                case 2:
                    mano.cerrar();
                    break;
                case 3:
                    mano = new Mano(baraja);
                    break;
            }
        } while (estaJugando);
    }

    private void mostrarMenu() {
        System.out.println("1. Pedir");
        System.out.println("2. Plantar");
        System.out.println("3. Empezar de nuevo");
    }

    public static void main(String[] args) {
        new XXI().jugar();
    }
}
