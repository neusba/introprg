/* Fitxer que conté la classe Gat Renat i defineix les seves propietats, mètodes (heretats i no) 
 * i els constructors necessaris
 * Gat Renat extends Gat implements AnimalDeCompanyia, Ensinistrable
 */

class GatRenat extends Gat implements AnimalDeCompanyia, Ensinistrable {
    // propietats
    private String posicio = "estirat";

    // Constructors
    public GatRenat() {
        super("Renat");
    }
    public GatRenat(String posicio) {
        super("Renat");
        switch (posicio) {
            case "estirat": this.posicio = posicio; break;
            case "dret": this.posicio = posicio; break;
            case "assegut": this.posicio = posicio; break;
        }
    }

    // Getters/setters
    public String getPosicio() {
        return this.posicio;
    }

    // Mètodes heretats de la interface AnimalDeCompanyia
    @Override public String deixatEstimar() {
        return("em deixo estimar");
    }

    // Mètodes heretats de la interface Ensinistrable
    @Override public boolean estaDret() {
        if (getPosicio().equals("dret")) {
            return true;
        }
        return false;
    }
    @Override public boolean estaAssegut() {
        if (getPosicio().equals("assegut")) {
            return true;
        }
        return false;
    }
    @Override public boolean estaEstirat() {
        if (getPosicio().equals("estirat")) {
            return true;
        }
        return false;
    }
    @Override public String aixecat() {
        if (!getPosicio().equals("dret")) {
            this.posicio = "dret";
            return("m'aixeco");
        }
        return("no faig res");
    }
    @Override public String seu() {
        if (!getPosicio().equals("assegut")) {
            this.posicio = "assegut";
            return("m'assec");
        }
        return("no faig res");
    }
    @Override public String estirat() {
        if (!getPosicio().equals("estirat")) {
            this.posicio = "estirat";
            return("m'estiro");
        }
        return("no faig res");
    }
}

