/* Programa que prova el polimorfisme de les classes amb Gats */

// CLASSE PÚBLICA
public class UsaGats {
    public static void main(String[] args) {
        Gat[] gats = new Gat[] {
            new Gat("Misifú"),
            new GatRenat(),
            new Garfield()
        };
        for (Gat gat: gats) {
            System.out.println("Entrenant el gat " + gat.getNom());
            System.out.println(gat.getNom() + " diu: "+ gat.seu());
            System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
            System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
            System.out.println(gat.getNom() + " diu: "+ gat.estirat());
            System.out.println();
        }
    }
}

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
        if (nom.isEmpty() || nom.isBlank() || nom == null) { return("anònim"); 
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
        if (vides > 0) {
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
        if (this.vides > 0) { return true; 
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
// CLASSE GAT RENAT
class GatRenat extends Gat {
    // Constructores
    public GatRenat() {
        super("Renat");
    }
    public GatRenat(int vides) {
        super("Renat", vides);
    }
    public GatRenat(String posicio) {
        super("Renat", posicio);
    }
   public GatRenat(int vides, String posicio) {
       super("Renat", vides, posicio);
   }
}
// CLASSE GARFIELD
class Garfield extends Gat {
    // Constructores
    public Garfield() {
        super("Garfield", 9, "estirat");
    }
    public Garfield(int vides) {
        super("Garfield", 9);
    }
    public Garfield(String posicio) {
        super("Garfield", 9, "estirat");
    }
    public Garfield(int vides, String posicio) {
        super("Garfield", 9, "estirat");
    }
    // Methods
    @Override
    public String aixecat() {
        if (getPosicio().equals("assegut")) {
            setPosicio("dret");
            return("m'aixeco");
        }
        if (getPosicio().equals("estirat")) {
            return("Bai Maitea, bai");
        }
        return("no faig res");
    }
    @Override
    public String estirat() {
        if (getPosicio().equals("assegut")) {
            setPosicio("estirat");
            return("m'estiro");
        }
        if (getPosicio().equals("dret")) {
            return("Bai Maitea, bai");
        }
        return("no faig res");
    }
    @Override
    public String seu() {
        if (!getPosicio().equals("assegut")) {
            setPosicio("assegut");
            return("m'assec");
        }
        return("no faig res");
    }
}
