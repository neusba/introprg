/* Fitxer que conté la clase Ascensor amb les seves propietats
 * Afegim Getters i Setters
 */

public class Ascensor {
    private int pis = -1;
    private String moviment = "aturat";
    
    // Getters
    public int getPis() {
        return pis;
    }
    public String getMoviment() {
        return moviment;
    }
    // Setters
    public void setPis(int nouPis) {
       if (nouPis > -2 && nouPis < 11) {
          pis = nouPis;
        } 
    }
    public void setMoviment(String nouMoviment) {
        switch (nouMoviment) {
            case "aturat": moviment = nouMoviment; break;
            case "pujant": moviment = nouMoviment; break;
            case "baixant": moviment = nouMoviment; break;
        }
    }
}
