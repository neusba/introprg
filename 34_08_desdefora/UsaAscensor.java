/* Part del Programa UsaAscensor que contindrà el main del programa
 * Dins d'aquest fitxer inclourem la inicialització de la instància i el missat a mostrar per pantalla
 */

public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("L'ascensor creat des de fora està al pis " + ascensor.pis);
    }
}
