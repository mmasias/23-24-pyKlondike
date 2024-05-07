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
            linea();
            mano.mostrar();
            mostrarMenu();
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    if (!mano.haPerdido() && !mano.xxi()) {
                        mano.pedir(baraja);
                    }
                    break;
                case 2:
                    mano = new Mano(baraja);
                    break;
                case 3:
                    estaJugando = !estaJugando;
                    break;
            }
        } while (estaJugando);
    }

    private void mostrarMenu() {
        linea();
        System.out.println("1. Pedir");
        System.out.println("2. Empezar de nuevo");
        System.out.println("3. Salir");
        linea();
    }

    private void linea() {
        System.out.println("-".repeat(20));
    }

    public static void main(String[] args) {
        new XXI().jugar();
    }
}
