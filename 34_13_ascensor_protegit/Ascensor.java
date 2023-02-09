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
    public void setPis(String nouPis) {
        String nou = "";
        int pisNou;
        if (nouPis.length() == 1) {
            for (int i=0; i<nouPis.length(); i++) {
                if (Character.isDigit(nouPis.charAt(i))) {
                    nou = nou + nouPis.charAt(i);
                }
            }
           pisNou = Integer.parseInt(nou);
           pis = pisNou;
        }

    }
    public void setMoviment(String nouMoviment) {
        switch (nouMoviment) {
            case "aturat": moviment = nouMoviment; break;
            case "pujant": moviment = nouMoviment; break;
            case "baixant": moviment = nouMoviment; break;
            case "tremola": moviment = nouMoviment; break;
        }
    }
}
