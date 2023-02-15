/* Programa que crea un array de GatRenat i al recorre-ho va imprimint el "contingut" de cada instància
 * Tots els constructors menys un faran l'ús de this(), l'altra utilitzarà setters
 */
public class GatRenat {
    public int vides = 7;
    public String posicio = "estirat";
    // CONSTRUCTORS
    public GatRenat() {
        this(7);
    }
    public GatRenat(int vides) {
        setVides(vides);
    }
    public GatRenat(String posicio) {
        setPosicio(posicio);
    }
    public GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }
    // MAIN
    public static void main(String[] args) {
    GatRenat[] renats = {
        new GatRenat(),         // tot per defecte
        new GatRenat(8),        // 8 vides i posició per defecte
        new GatRenat("dret"),   // posició dret i vides per defecte
        new GatRenat(8, "dret") // 8 vides i posició dret

    };
        for (GatRenat renat: renats) {
            System.out.println(renat);                                      // toString
        }
    }

    // getters
    public int getVides() {
        return vides;
    }
    public String getPosicio() {
        return posicio;
    }
    // setters
    public void setVides(int vides) {
        if (vides >= 0 ){
            this.vides = vides;
        }
    }
    public void setPosicio(String posicio) {
        switch (posicio) {
            case "estirat": this.posicio = posicio; break;
            case "dret": this.posicio = posicio; break;
            case "assegut": this.posicio = posicio; break;
        }
    }
    // toString
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
}
