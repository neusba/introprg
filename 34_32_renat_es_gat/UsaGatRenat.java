/* Programa que posa en pràctica l'herència i dins d'un mateix fitxer anomenat UsaGatRenat (on tenim el main)
 * hi podem trobar també altres dues classes: la superclasse Gat i la subclasse GatRenat
 * Gat contindrà els accessors necessàris per obtenir les vides i la posició del gat
 */

public class UsaGatRenat {
    // #################################### MAIN #########################################
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("El Renat diu: "+ renat.aixecat());
        System.out.println("El Renat diu: "+ renat.seu());
        System.out.println("El Renat diu: "+ renat.estirat());
        System.out.println("El Renat diu: "+ renat.estirat());
    }
}
