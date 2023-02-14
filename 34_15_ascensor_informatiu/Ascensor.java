/* Fitxer que conté la classe Ascensor amb les seves propietats, mètodes i accessors corresponents
 * inclourem tots els estats del ascensor respecte al pis
 */

public class Ascensor {
    // propietats
    private int pis = -1;
    private String moviment = "aturat";

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
    public String comEsta() {
        String situacio = "";
        situacio = String.format("%s al pis %d", getMoviment(), getPis());
        return situacio;
    }
}

