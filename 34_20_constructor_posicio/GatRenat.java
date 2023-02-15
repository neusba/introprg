/* Programa que implementa els constructors de classes i ens fa imprimir el contingut de la instància en forma de String
 * a través d'un mètode que s'invisibilitza si només escribim el nom de la instància i específiquem un "@Override"
 */
public class GatRenat {
    private int vides;
    private String posicio;
    public GatRenat() {
        vides = 7;
        posicio = "estirat";
    }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println(renat);
    }
}
