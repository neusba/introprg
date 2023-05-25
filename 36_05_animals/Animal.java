/* Fitxer que conté la classe Animal la qual es el pont conector entre Categories i aquesta última classe creada
 * Farem ús de la Foreign Key: categoria
 */

public class Animal {
    // propietats
    private int id = -1;
    private String nom;
    private Categoria categoria;

    // constuctors
    public Animal(String nom, Categoria categoria) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }
        this.nom = nom;
        if (categoria == null) {
            throw new IllegalArgumentException("La categoria no pot ser null");
        }
        this.categoria = categoria;
    }
    public Animal(int id, String nom, Categoria categoria) {
        this(nom, categoria);
        if (id < 0) {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }
        this.id = id;
    }

    // getters
    public int getId() { 
        if (idIndefinit()) {
            throw new UnsupportedOperationException("L'identificador no està disponible");
        }
        return this.id;
    }
    public String getNom() {
        return this.nom;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }

    // mètodes
    public boolean idIndefinit() { return id < 0; }
}

