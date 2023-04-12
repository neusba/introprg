/* Fitxer que conté la classe GatRenat amb les seves propietats i strings
 * i possa a prova el nou concepte ENUMERATS
 */

class GatRenat {
    // GatRenat es relaciona amb la classe enum GatPosicio amb la declaració d'atributs
    private GatPosicio posicio;

    // ##### METODES #####
    public GatRenat(GatPosicio posicio) {
        setPosicio(posicio);
    }
    public GatRenat(String posicio) {
        setPosicio(posicio);
    }

    // ##### ACCESSORS #####
    // Getters
    public GatPosicio getPosicio() {
        return this.posicio;
    }

    // Setters
    public void setPosicio(GatPosicio posicio) {
        this.posicio = posicio;
    }

    public void setPosicio(String posicio) {
        GatPosicio valorAdequat = GatPosicio.fromString(posicio);
        this.posicio = valorAdequat;
    }
}
