/* Programa que introdueix la composició a la Programació Orientada a Objectes.
 * En aquesta primera prova implementarem la classe UllDeGat amb la classe GatRenat
 * els mètodes de la classe Ull variaran segons la posició de la classe GatRenat
 */

public class GatRenat {
    // propietats GatRenat
    private String posicio;
    // propietats UllDeGat
    private boolean obert;
    private boolean tancat;
    // ########################################### MAIN #################################################
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        UllDeGat ullDret = renat.getUllDret();
        UllDeGat ullEsquerre = renat.getUllEsquerre();
        System.out.printf("Quan està %s: %b + %b%n",
            renat.getPosicio(),
            renat.getUllDret().estaObert(),
            renat.getUllEsquerre().estaObert());
        renat.seu();
        System.out.printf("Quan està %s: %b + %b%n",
            renat.getPosicio(),
            renat.getUllDret().estaObert(),
            renat.getUllEsquerre().estaObert());
        renat.aixecat();
        System.out.printf("Quan està %s: %b + %b%n",
            renat.getPosicio(),
            renat.getUllDret().estaObert());
    }
    // ##################################################################################################
    // Constructor Gat Renat
    public GatRenat() {
        posicio = "estirat";
    }
    public GatRenat(String posicio) {
        this.posicio = posicio;
    }
    // ############# Mètodes GAT RENAT #####################
    public String aixecat() {
        setPosicio("dret");
        ullDret.obret();
        ullEsquerre.obret();
        return("m'aixeco");
    }
    public String seu() {
        ullDret.obret();
        ullEsquerre.tancat();
        setPosicio("assegut");
        return("m'assec");
    }
    public String estirat() {
        ullDret.tancat();
        ullEsquerre.tancat();
        setPosicio("estirat");
        return("m'estiro");
    }
    // setters
    public void setPosicio(String posicio) {
        switch (posicio) {
            case "dret": renat.posicio = "dret"; break;
            case "assegut": renat.posicio = "assegut"; break;
            case "estiro": renat.posicio = "estiro"; break;
            default: renat.posicio = getPosicio(); break;
        }
    }
    // getters
    public String getPosicio() {
        return posicio;
    }
    // ############## CLASSE UllDeGat #####################
    public UllDeGat getUllDret() { 
        this.obert = true;
        this.tancat = false;
        return ullDret;
    }
    public UllDeGat getUllEsquerre() {
        this.obert = true;
        this.tancat = false;
        return ullEsquerre;
    }
    // Mètodes Clase UllDeGat
    public void obret() {
        this.obert = true;
        this.tancat = false;
    }
    public void tancat() {
        this.obert = false;
        this.tancat = true;
    }
    public boolean estaObert() {
        if (obert && !tancat) {
            return true;
        }
        return false;
    }
}
