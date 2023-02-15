/* Programa que implementa els constructors específics amb mutabilitat per el Gat renat
 * Aquesta vegada controlarem amb el setter que els valors que inicialitzin les vides
 * siguin nombres vàlids
 * Aquesta vegada utilitzarem el mateix nom de variable per el paràmetre que de la propietat per fer ús de de la referència this
 */

public class GatRenat {
    // propietats privades
    private int vides;
    private String posicio = "estirat";
    // MAIN
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "dret"));
    }
    // Constructor específic
    public GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }
    // getters
    public int getVides() {
        return vides;
    }
    public String getPosicio() {
        return posicio;
    }
    // setter
    public void setVides(int vides) {
        if (vides >= 0) {
            this.vides = vides;
        }
    }
    public void setPosicio(String posicio) {
        switch (posicio) {
            case "dret": this.posicio = posicio; break;
            case "estirat": this.posicio = posicio; break;
            case "assegut": this.posicio = posicio; break;
        }
    }
    // toString
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
}
