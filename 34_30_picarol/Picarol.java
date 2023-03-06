/* Fitxer que conté la classe Picarol per l'exercici 34_30.
 * Definirem totes les propietats i mètodes necessaris per a que
 * una instància de picarol pugui interactuar amb una de GatRenat
 */

public class Picarol {
    // propietats instàncies picarols
    private int cops = 0;
    
    public Picarol() {
    }

    public void sona() {
        System.out.println("clink-clink");
        this.cops += 1;
    }
    public int quantsCops() {
        return this.cops;
    }
}
