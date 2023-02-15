/* Programa que implementa els constructors amb paràmetres.
 * Passem un paràmetre i el constructor s'encarrega d'inicialitzar la instància amb els valors donats per argument
 */

public class GatRenat {
    private int vides;
    private String posicio = "estirat";
    
    // MAIN
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "estirat"));
    }
    // constructor
    public GatRenat(int novesVides, String novaPos) {
        vides = novesVides;
        posicio = novaPos;
    }
    // getters per si de cas
    public int getVides() {
        return vides;
    }
    public String getPosicio() {
        return posicio;
    }
    // toString
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
}
