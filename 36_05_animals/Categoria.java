/* fitxer que conté la classe categoria.
 * Aquest classe ens permetrà veure el concepte de foreign key
 */

public class Categoria {
    private int id = -1;  // -1 indica no assignat o indefinit
    private String nom;

    public Categoria(String nom) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }
        this.nom = nom;
    }

    public Categoria(int id, String nom) {
        this(nom);
        if (id < 0) {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }
        this.id = id;
    }
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }
    }
    public boolean idIndefinit() { return id < 0; }
    public int getId() {
        if (idIndefinit()) {
            throw new UnsupportedOperationException("L'identificador no està disponible");
        }
        return id;
    }
    public String getNom() { return nom; }

    @Override
    public String toString() {
        return "Categoria(id:" +
            (id < 0 ? "indefinit" : id) +
            ", " + nom + ")";
    }
}
