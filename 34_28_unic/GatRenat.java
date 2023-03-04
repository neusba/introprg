/* Programa que crea un array de GatRenat i al recorre-ho va imprimint el "contingut" de cada instància
 * Tots els constructors menys un faran l'ús de this(), l'altra utilitzarà setters
 */
public class GatRenat {
    public int vides = 7;
    public String posicio = "estirat";

    private static GatRenat instancia;                                          // nova propietat
        
    // CONSTRUCTORS
    private GatRenat() {
    }
    // NOUS MÈTODES GETINSTANCIA()
    public static GatRenat getInstancia() {
        if (instancia == null) {
            instancia = new GatRenat();
        } else {
            GatRenat copiaInstancia = GatRenat.instancia;
            return copiaInstancia;
        }
        return instancia;
    }
    public static GatRenat getInstancia(int vides) {
        if (instancia == null) {
            instancia = new GatRenat();
        } else {
            instancia.setVides(vides);
            GatRenat copiaInstancia = GatRenat.instancia;
            return copiaInstancia;
        }
        return instancia;
    }
    public static GatRenat getInstancia(String posicio) {
        if (instancia == null) {
            instancia = new GatRenat();
        } else {
            instancia.setPosicio(posicio);
            GatRenat copiaInstancia = GatRenat.instancia;
            return copiaInstancia;
        }
        return instancia;
    }
    public static GatRenat getInstancia(int vides, String posicio) {
        if (instancia == null) {
            instancia = new GatRenat();
        } else {
            instancia.setVides(vides);
            instancia.setPosicio(posicio);
            GatRenat copiaInstancia = GatRenat.instancia;
            return copiaInstancia;
        }
        return instancia;
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
        this.posicio = posicio;
    }
    // toString
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
}
