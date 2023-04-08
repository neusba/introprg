/* Fitxer que conté la classe vi amb totes les propietats, accessor i metodes necessaris per fer
 * funcionar l'aplicació de la germana de la Gualda
 */

class Vi {
    // Propiedades de la classe
    private final String nom;
    private int preu;
    private int estoc = 0;

    // Constructors
    public Vi(String nom, int preu) {
        this.nom = normalitzaNom(nom); 
        if (preu < 0 ) {
            this.preu = -1;
        } else {
            setPreu(preu);
        }
    }
    public Vi(String nom, int preu, int estoc) {
        this.nom = normalitzaNom(nom);                                     
        if (preu < 0 ) {
            this.preu = -1;
        } else {
            this.preu = preu;
        }
        if (estoc < 0 ) {
            this.estoc = -1;
        } else {
            this.estoc = estoc;
        }
    }

    // Accessors
    // getters
    public String getNom() {
        return this.nom;
    }
    public int getPreu() {
        return this.preu;
    }
    public int getEstoc() {
        return this.estoc;
    }
    // setters
    public void setPreu(int preu) {
        // El precio ya se recibe en céntimos, no hace falta conversión
        if (preu < 0) {
            this.preu = this.preu;
        } else {
            this.preu = preu;
        }
    }
    public void setEstoc(int estoc) {
        if (estoc < 0 ) {
            this.estoc = this.estoc;
        } else {
            this.estoc = estoc;
        }
    }

    // Methods
    public boolean esValid() {
        if (getNom().isEmpty() || getNom().isBlank() || (getNom() == null)) {
            return false;
        }
        if (this.nom.equals("NOM NO VÀLID!")) { return false; }
        if (this.preu == -1 || this.estoc == -1) { return false; }
        return true;
    }
    public static String normalitzaNom(String nom) {
        // checkea si el nombre és un nombre válido, si no lo es, devuelve "NOM NO VÀLID"
        if (nom.isEmpty() || nom.isBlank() || nom == null) {
            return("NOM NO VÀLID!");
        }
        // Si és un nombre vàlido:
        // limpia nombre de espacios delante, atrás y entremedio si hay más de uno
        nom = nom.strip();
        nom = nom.replaceAll("\\s+", " ");      // une 2 o más ws consecutivos en 1 solo
        return nom;
    }
    // @toString
    @Override public String toString() {
        return(String.format("%n    Vi: %s%n    Preu: %d%n    Estoc: %d%n", this.nom, this.preu, this.estoc));
    }

    // ################ NUEVOS METODOS ########################
    // devuelve un array con los valores de la instància de vino actual
    public String[] aArrayString() {
        String preuArray = Integer.toString(this.preu);
        String estocArray = Integer.toString(this.estoc);
        String[] valors = { this.nom, preuArray, estocArray };
        return valors;
    }
    // Recibe un array con los valores del vino y devuelve el Vino inicializado
    public static Vi deArrayString(String[] valorsVi) {
        int preu = Integer.parseInt(valorsVi[1]);
        int estoc = Integer.parseInt(valorsVi[2]);
        return(new Vi(valorsVi[0], preu, estoc));
    }
}

