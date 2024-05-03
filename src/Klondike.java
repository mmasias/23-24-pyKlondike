class Klondike {

    private Baraja baraja;
    private Palo[] palos;
    private Descarte descarte;
    private Columna[] columnas;

    private static final int NUM_COLUMNAS = 7;

    public Klondike() {
        baraja = new Baraja();
        descarte = new Descarte();
        palos = new Palo[4];
        for (int i = 0; i < 4; i++) {
            palos[i] = new Palo();
        }
        columnas = new Columna[NUM_COLUMNAS];
        for (int i = 0; i < NUM_COLUMNAS; i++) {
            columnas[i] = new Columna(baraja, i + 1);
        }
    }

    public void jugar() {

    }

    public static void main(String[] args) {
        new Klondike().jugar();
    }

}