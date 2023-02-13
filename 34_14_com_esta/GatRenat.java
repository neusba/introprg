/* Fitxer que conté la classe del Gat Renat i les seves propietats
 * Implementem els mètodes/serveis els quals pregunten a les instàncies
 * la seva situació
 */

public class GatRenat {
    // propietats privades
    private int vides = 7;
    private String posicio = "estirat";

    // accessors
    public int getVides() {
        return vides;
    }
    public String getPosicio() {
        return posicio;
    }
    public void setVides(int novesVides) {
        if (novesVides > 0){
            vides = novesVides;
        }
    }
    public void setPosicio(String novaPosicio) {
        switch (novaPosicio) {
            case "dret": posicio = novaPosicio; break;
            case "assegut": posicio = novaPosicio; break;
            case "estirat": posicio = novaPosicio; break;
        }
    }

    // mètodes que preguntes a les instàncies la situació
    // esta viu?
    public boolean estaViu() {
        if (getVides() > 0) {
            return true;
        }
        return false;
    }
    // posicio
    public boolean estaDret() {
        if (getPosicio().equals("dret")){
            return true;
        }
        return false;
    }
    public boolean estaAssegut() {
        if (getPosicio().equals("assegut")) {
            return true;
        }
        return false;
    }
    public boolean estaEstirat() {
        if (getPosicio().equals("estirat")) {
            return true;
        }
        return false;
    }
}    
