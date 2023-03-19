/* Fitxer que conté la classe Gat i totes les seves propietats, mètodes i constructors necessaris
 * per relacionar-se aamb les super i sub classes.
 * No és una interfície ni tampoc una classe abstracta, la tractarem com una classe comuna.
 * Classe Gat implementa la interface EsserViu, per tant gat ha de contenir tots els mètodes definits a la interface EsserViu amb @Override
 */
class Gat implements EsserViu {
    // Propietats
    private int vides = 7;
    private String nom = "anònim";

    // Constructors
    public Gat(String nom) {
        String name = esValid(nom);
        this.nom = name;
    }
    public Gat(String nom, int vides) {
        String name = esValid(nom);
        this.nom = name;
        setVides(vides);
    }

    // Getters i setter
    public String getNom() {
        return this.nom;
    }
    public int getVides() {
        return this.vides;
    }
    public void setVides(int vides) {
        if (vides <= 0 ) {
            this.vides = 7;
        } else {
            this.vides = vides;
        }
    }
    // Mètodes de comprovació de nom
    public String esValid(String nom) {
        if (nom == null || nom.isBlank()) {
            return("anònim");
        }
        return(nom);
    }

    // Mètodes heretats de la interface
    @Override public boolean estaViu() {
        if (this.vides > 0) {
            return true;
        }
        return false;
    }
    @Override public String mor() {
        this.vides = this.vides - 1;
        if (this.vides == 0) {
            return("adéu món cruel");
        } 
        return("ja l'he espifiada");
    }
    @Override public String ressuscita() {
        this.vides = this.vides + 1;
        if (this.vides == 1) {
            return("guai!");
        }
        return("encara miolo");
    }
}
        
