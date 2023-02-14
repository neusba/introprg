/* Fitxer que conté la classe Ascensor amb les seves corresponents propietats privades, accessors
 * i mètodes naturals
 * Utilitzarem els serveis aturat(), arrencaAmunt(), arrencaAbaix(), seguentPis()
 */

public class Ascensor {
    // propietats privades
    private int pis = 7;                                        // -1 hasta 10
    private String moviment = "aturat";                          // aturat, baixant o pujant

    // accessors
    // getters
    public int getPis() {
        return pis;
    }
    public String getMoviment() {
        return moviment;
    }
    // setters
    public void setPis(int nouPis) {
        if (nouPis > -2 && nouPis < 11) {
            pis = nouPis;
        }
    }
    public void setMoviment(String nouMov) {
        switch (nouMov) {
            case "aturat": moviment = nouMov; break;
            case "pujant": moviment = nouMov; break;
            case "baixant": moviment = nouMov; break;
        }
    }

    // mètodes
    public boolean estaAbaix() {
        if (pis == -1) {
            return true;
        }
        return false;
    }
    public boolean estaAmunt() {
        if (pis == 10) {
            return true;
        }
        return false;
    }
    public boolean estaAturat() {
        if (estaMovent()) {
            return false;
        }
        return true;
    }
    public boolean estaMovent() {
        if (estaPujant() || estaBaixant()) {
            return true;
        }
        return false;
    }
    public boolean estaPujant() {
        if (getMoviment().equals("pujant")) {
            return true;
        }
        return false;
    }
    public boolean estaBaixant() {
        if (getMoviment().equals("baixant")) {
            return true;
        }
        return false;
    }
    // nous mètodes
    public boolean aturat() {
        if (!moviment.equals("aturat")) {
            moviment = "aturat";
            return true;
        }
        return false;
    }
    public boolean arrencaAmunt() {
        if (!moviment.equals("pujant") && estaAturat()) {
            moviment = "pujant";
            return true;
        }
        return false;
    }
    public boolean arrencaAbaix() {
        if (!moviment.equals("baixant") && estaAturat()) {
            moviment = "baixant";
            return true;
        }
        return false;
    }
    public String comEsta() {
        String estat = "";
        estat = String.format("%s al pis %d", moviment, pis);
        return estat;
    }
    public int seguentPis() {
        if (estaPujant()) {
            if (pis == 10) {
                aturat();
                moviment = "baixant";
                arrencaAbaix();
                pis = pis - 1;
                return pis;
            }
            pis = pis + 1;
            return pis;
        } else if (estaBaixant()) {
            if (pis == -1) {
                aturat();
                moviment = "pujant";
                arrencaAmunt();
                pis = pis + 1;
                return pis;
            }
            pis = pis - 1;
            return pis;
        }
        return pis;
    }
}
