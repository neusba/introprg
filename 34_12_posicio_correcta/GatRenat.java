/* Fitxer del programa USaGatRenat que conté la classe GatRenat
 * En aquest cas afegirem una propietat que indica l'estat de posició del gat
 * i afegirem els getters i setters necessaris per controlar que la posicio introduïda és correcte
 */

public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";

    public int getVides() {                             // Retorna les vides actuals del gat
        return vides;
    }

    public void setVides(int novesVides) {              // Comprova si les vides noves introduïdes són vàlides pel gat
        if (novesVides >= 0) {
            vides = novesVides;
        }
    }

    public String getPosicio() {                        // Retorna la posició inical del gat
        return posicio;
    }

    public void setPosicio(String novaPosicio) {                // Comprova la nova entrada per posicio i valida si és una posició vàlida
        switch (novaPosicio) {
            case "estirat": posicio = novaPosicio; break;
            case "assegut": posicio = novaPosicio; break;
            case "dret": posicio = novaPosicio; break;
        }
    }
}
