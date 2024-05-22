abstract class Mazo {

    protected Carta[] cartas;
    protected int ultima;

    public Mazo(int numeroCartas) {
        ultima = 0;
        cartas = new Carta[numeroCartas];
    }

    public void poner(Carta carta) {
        cartas[ultima] = carta;
        ultima++;
    }

    protected Carta sacar() {
        ultima--;
        return cartas[ultima];
    }

    protected Carta cima() {
        return cartas[ultima - 1];
    }

    protected boolean vacia() {
        return ultima == 0;
    }

    protected void mostrar(String titulo, String mensajeMazoVacio, int numeroCartas) {
        System.out.print(": ");
        if (this.vacia()) {
            System.out.println(mensajeMazoVacio);
        } else {
            int primeraVisible = ultima - numeroCartas;
            if (primeraVisible < 0) {
                primeraVisible = 0;
            }
            for (int i = primeraVisible; i < ultima; i++) {
                cartas[i].mostrar();
            }
            System.out.println();
        }
    }
}
