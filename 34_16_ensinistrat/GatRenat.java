/* Fitxer que conté la classe Gat Renat amb les seves propietats protegides, els accessors i mètodes necessaris
 * Aquesta vegada inclourem uns mètodes natural que faràn que el gat renat faci alguna cosa
 */

public class GatRenat {
    // propietats protegides
    private String posicio = "estirat";

    // accessors
    public String getPosicio() {
        return posicio;
    }
    public void setPosicio(String novaPos) {
        switch (novaPos) {
            case "estirat": posicio = novaPos; break;
            case "assegut": posicio = novaPos; break;
            case "dret": posicio = novaPos; break;
        }
    }

    // mètodes naturals
    public String aixecat() {
        if (estaDret()) {
            return("no faig res");
        }
        posicio = "dret";
        return("m'aixeco");
    }
    public String seu() {
        if (estaAssegut()) {
            return("no faig res");
        }
        posicio = "assegut";
        return("m'assec");
    }
    public String estirat() {
        if (estaEstirat()) {
            return("no faig res");
        }
        posicio = "estirat";
        return("m'estiro");
    }

    // mètodes naturals que comproven posicio
    public boolean estaDret() {
        if (getPosicio().equals("dret")) {
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

