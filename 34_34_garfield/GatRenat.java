/* Fitxer que conté la classe GatRenat per l'exercici 34_34 amb tots els seus mètodes i 
 * constructors corresponents per relacionar-se amb la seva superclasse
 */
// CLASSE GAT RENAT
class GatRenat extends Gat {
    // Constructores
    public GatRenat() {
        super("Renat");
    }
    public GatRenat(int vides) {
        super("Renat", vides);
    }
    public GatRenat(String posicio) {
        super("Renat", posicio);
    }
   public GatRenat(int vides, String posicio) {
       super("Renat", vides, posicio);
   }
}
