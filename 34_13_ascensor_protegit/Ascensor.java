/* Archiu que conté la classe del Ascensor amb totes les seves propietats
 * i els getters/setters necessaris per poder accedir a les propietats privades
 */

public class Ascensor {
    private int pis = - 1;
    private String moviment = "aturat";

    public int getPis() {
        return pis;
    }
    public void setPis(int nouPis) {
        if (nouPis > -2 && nouPis < 11) {
            pis = nouPis;
        }
    }

    public String getMoviment() {
        return moviment;
    }
    public void setMoviment(String nouMov) {
        switch (nouMov) {
            case "aturat": moviment = nouMov; break;
            case "pujant": moviment = nouMov; break;
            case "baixant": moviment = nouMov; break;
        }
    }
}
