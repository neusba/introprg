/* Fitxer del programa Ascensor protegit que conté el main amb la creació de la instància
 * i totes les crides i missatges que es veuran per pantalla
 */

public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();

        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        System.out.println("Introdueix nou pis:");
        String nouPis = Entrada.readLine();
        int numPis;
        if (nouPis.length() != 1) {
            numPis = ascensor.getPis();
        }
        for (int i=0; i<nouPis.length(); i++) {
            if (!Character.isDigit(nouPis.charAt(i))) {
                numPis = ascensor.getPis();
            }
        }
        numPis = Integer.parseInt(nouPis);
        ascensor.setPis(numPis);          // ARRELGAR #########
        System.out.println("Introdueix nou moviment:");
        ascensor.setMoviment(Entrada.readLine());
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
    }
}
