/* Programa que utlilitza la classe ascensor per simular la situacio d'un ascensor mitjançant les indicacions
 * que dona l'usuari
 * Farem l'ús de propietats privades, accessors i mètodes per coneixer l'estat del ascensor
 */
public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        System.out.println("Introdueix nou pis:");
        String nouPis = Entrada.readLine();
        if (UtilString.esEnter(nouPis)) {
            ascensor.setPis(Integer.parseInt(nouPis));
        }
        System.out.println("Introdueix nou moviment:");
        ascensor.setMoviment(Entrada.readLine());
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
        System.out.println("Estat de l'ascensor: " + ascensor.comEsta());
    }
}
