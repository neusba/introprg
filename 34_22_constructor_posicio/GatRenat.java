/* Programa que implementa els constructors específics amb mutabilitat per el Gat renat
 * Aquesta vegada controlarem amb el setter que els valors que inicialitzin les vides
 * siguin nombres vàlids
 */

public class GatRenat {
    // propietats privades
    private int vides;
    private String posicio;
    // MAIN
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "dret"));
    }
    // Constructor específic
    public GatRenat(int novesVides, String novaPos) {
        setVides(novesVides);
        setPosicio(novaPos);
    }
    // getters
    public int getVides() {
        return vides;
    }
    public String getPosicio() {
        return posicio;
    }
    // setter
    public void setVides(int novesVides) {
        if (novesVides >= 0) {
            vides = novesVides;
        }
    }
    public void setPosicio(String novaPos) {
        switch (novaPos) {
            case "dret": posicio = novaPos; break;
            case "estirat": posicio = novaPos; break;
            case "assegut": posicio = novaPos; break;
        }
    }
    // toString
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
}
