import java.util.Scanner;

public class Menu {

    public void mostrar() {
        System.out.println("1. Mover de Baraja a Descarte");
        System.out.println("2. Mover de Descate a Palo");
        System.out.println("3. Mover de Descate a Columna");
        System.out.println("4. Mover de Palo a Columna");
        System.out.println("5. Mover de Columna a Palo");
        System.out.println("6. Mover de Columna a Columna");
        System.out.println("7. Voltear carta de Columna");
        System.out.println("8. Voltear Descarte en Baraja");
        System.out.println("9. Salir");
    }

    public int getOpcion() {
        int opcion;
        opcion = new Scanner(System.in).nextInt();
        return opcion;
    }

}
