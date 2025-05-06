public class Columna {

    private Carta[] cartas;
    private int ultima;
    private int posicion;

    public Columna(Baraja baraja, int numeroColumna) {
        posicion = numeroColumna;
        ultima = 0;
        cartas = new Carta[19];
        for (int i = 0; i < posicion; i++) {
            Carta carta = baraja.sacar();
            if (i == posicion - 1) {
                carta.voltear();
            }
            poner(carta);
        }
    }

    public void mostrar() {
        System.out.print("Columna [" + posicion + "]: ");
        if (vacia()) {
            System.out.print("NADA");
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

    public void moverA(Palo palo) {
        if (vacia()) {
            System.out.println("No se puede");
        } else {
            Carta carta = sacar();
            if (palo.apilable(carta)) {
                palo.poner(carta);
            } else {
                poner(carta);
                System.out.println("No se puede!");
            }
        }
    }

    public void moverA(Columna columna) {
        if (vacia()) {
            System.out.println("no se puede!");
        } else {
            Carta carta = sacar();
            if (columna.apilable(carta)) {
                columna.poner(carta);
            } else {
                poner(carta);
                System.out.println("No se puede!");
            }
        }
    }

    private Carta sacar() {
        ultima--;
        return cartas[ultima];
    }

    public void voltear() {
        if (vacia()) {
            System.out.println("No hay carta para voltear");
        } else if (cima().bocaArriba()) {
            System.out.println("No hay carta boca abajo en la cima");
        } else {
            cima().voltear();
        }
    }

    private Carta cima() {
        return cartas[ultima - 1];
    }

    public boolean apilable(Carta carta) {

        return vacia() && carta.esRey() ||
                !vacia() && cima().bocaArriba() && cima().siguiente(carta) && cima().distintoColor(carta);
    }

    public void poner(Carta carta) {
        cartas[ultima] = carta;
        ultima++;
    }
}
