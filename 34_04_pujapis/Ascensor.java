/* Programa que indica en quin pis es trobava l'ascensor abans i en quin es troba ahora
 * El process de canvi de pis s'ha de fer en un procediment a part
 */

public class Ascensor {
    public int pis = -1;
    // Procediment que puja de pis l'ascensor
    public static void pujaPis(Ascensor ascensor) {
        ascensor.pis = ascensor.pis + 1;
    }

    public static void main(String[] args){
        Ascensor ascensor;
        ascensor = new Ascensor();

        System.out.println("L'ascensor inicialment està a la planta " + ascensor.pis);
        pujaPis(ascensor);
        System.out.println("L'ascensor finalment està a la planta " + ascensor.pis);
    }
}
