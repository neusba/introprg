/* Fitxer que conté la classe del Gat renat amb les seves propietats protegides, els seus accessor i 
 * els seus mètodes.
 * Aquesta vegada ens carregarem i resuscitarem al gat amb 3 nous mètodes naturals
 */

public class GatRenat {
    // propietats privades
    private int vides = 7;
    
    // accessors
    // getter
    public int getVides() {
        return vides;
    }
    // setter
    public void setVides(int nouVides) {
        vides = nouVides;
    }

    // mètodes
    public String mor() {
        if (vides > 0) {
            vides = vides - 1;
            if (vides > 0) {
                return("auch");
            }
            return("ximpún");
        }
        return("...");
    }
    public String resuscita() {
        vides += 1;
        if (vides == 1) {
            return("guai!");
        }
        return("...");
    }
    public String resuscita(int novesVides) {
        vides = novesVides;
        if (vides < 1) {
            return("...");
        }
        return("guai!");
    }
    public boolean estaViu() {
        if (vides > 0) {
            return true;
        }
        return false;
    }
}

