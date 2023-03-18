
// CLASSE GAT
class Gat {
    private final String nom;
    private int vides = 7;
    private String posicio = "estirat";
    // Constructores
    public Gat(String nom) {
        String name = esValid(nom);
        this.nom = name;
    }
    public Gat(String nom, int vides) {
        String name = esValid(nom);
        this.nom = name;
        setVides(vides);
    }
    public Gat(String nom, String posicio) {
        String name = esValid(nom);
        this.nom = name;
        setPosicio(posicio);
    }
    public Gat(String nom, int vides, String posicio) {
        String name = esValid(nom);
        this.nom = name;
        setVides(vides);
    }
    // Methods
    public String esValid(String nom) {
        if (nom == null || nom.isBlank()) {
            return("anònim");
        }
        return(nom);
    }
    public String getNom() {
        return this.nom;
    }
    // Getters & Setters
    public int getVides() {
        return this.vides;
    }
    public void setVides(int vides) {
        if (vides < 0) {
            this.vides = 7;
        } else {
            this.vides = vides;
        }
    }
    public String getPosicio() {
        return this.posicio;
    }
    public void setPosicio(String posicio) {
        switch (posicio) {
            case "estirat": this.posicio = posicio; break;
            case "assegut": this.posicio = posicio; break;
            case "dret": this.posicio = posicio; break;
        }
    }
    // Booleans
    public boolean estaViu() {
        if (this.vides > 0) {
            return true;
        }
        return false;
    }
    public boolean estaDret() {
        if (this.posicio.equals("dret")) { return true; 
        }
        return false;
    }
    public boolean estaAssegut() {
        if (this.posicio.equals("assegut")) { return true; 
        }
        return false;
    }
    public boolean estaEstirat() {
        if (this.posicio.equals("estirat")) { return true; 
        }
        return false;
    }
    // Domestica
    public String aixecat() {
        if (this.posicio.equals("dret")) {
            return("no faig res");
        }
        setPosicio("dret");
        return("m'aixeco");
    }
    public String seu() {
        if (this.posicio.equals("assegut")) {
            return("no faig res");
        }
        setPosicio("assegut");
        return("m'assec");
    }
    public String estirat() {
        if (this.posicio.equals("estirat")) {
            return("no faig res");
        }
        setPosicio("estirat");
        return("m'estiro");
    }
}
