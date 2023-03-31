/* Fitzxer que conté el main i la classe vi per dur a terme l'aplicació de gestió de vins de la germana
 * de la Gualda.
 * La classe vi tindrà totes les propietats, accessors i metodes necessaris per fer funcionar el main
 */

public class UsaVi {
    public static void main(String[] args) {
        System.out.println("Vi sense estoc" + new Vi("Roura blanc", 1234));
        Vi vi = new Vi("Roura blanc", 1234, 24);
        System.out.println("Vi amb estoc" + vi);
        vi.setPreu(vi.getPreu() + 120);  // incrementa preu del vi
        vi.setEstoc(vi.getEstoc() - 10); // decrementa el nombre d'ampolles
        System.out.println("Vi modificat" + vi);
    }
}

/* ################################# CLASSE VI ############################## */

class Vi {
    // Propiedades de la classe
    private final String nom;
    private int preu;
    private int estoc = 0;

    // Constructors
    public Vi(String nom, int preu) {
        this.nom = nom;
        normalitzaNom(nom);                                     
        if (preu < 0 ) {
            this.preu = -1;
        } else {
            setPreu(preu);
        }
        esValid();
    }
    public Vi(String nom, int preu, int estoc) {
        this.nom = nom;
        normalitzaNom(nom);                                     
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
        esValid();
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
        if (this.nom.equals("NOM NO VÀLID")) { return false; }
        if (this.preu == -1 || this.estoc == -1) { return false; }
        return true;
    }
    public static String normalitzaNom(String nom) {
        // checkea si el nombre és un nombre válido, si no lo es, devuelve "NOM NO VÀLID"
        if (nom.isBlank() || nom.isEmpty()) {
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
        return(String.format("%n     Vi: %s%n    Preu: %d%n   Estoc: %d%n", this.nom, this.preu, this.estoc));
    }
}

