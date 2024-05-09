class Mazo {

    protected Carta[] cartas;
    protected int ultima;    

    public boolean vacia() {
        return ultima == 0;
    }

    public Carta sacar() {
        ultima--;
        return cartas[ultima];
    }

    public void poner(Carta carta) {
        cartas[ultima] = carta;
        ultima++;
    }    
}
