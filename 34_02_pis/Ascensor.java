/* Programa que indica el pis en el que es troba un ascensor.
 * Hem de crear la clase ascensor de la mateixa manera que el Gat Renat i especificar el pis en una variable
 */

public class Ascensor {
    public int pis = -1;
    public static void main(String[] args) {
        Ascensor ascensor;                              // declaració de la referència
        ascensor = new Ascensor();                      // creació de la instància

        System.out.println("L'ascensor està a la planta " + ascensor.pis);
    }
}
