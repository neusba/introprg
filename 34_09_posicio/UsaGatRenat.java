/* Fitxer del programa UsaGatRenat que conté el main i executa els missatges a mostrar per pantalla
 * Haurem de modificar la nova propietat del gat, de estirat a assegut
 */

public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Vides inicials: " + renat.vides);
        System.out.println("Posició inicial: " + renat.posicio);
        renat.posicio = "assegut";
        System.out.println("Posició final: " + renat.posicio);
    }
}
