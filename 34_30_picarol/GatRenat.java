/* Programa que utilitza la classe GatRenat i la classe Picarol per simular que el gat interactua
 * amb un picarol
 * Es pot afegir, treure i fer-ho sonar
 */

public class GatRenat {
    private Picarol picarol;
    private boolean tePicarol;
    private String posicio = "estirat";

    // MAIN
    public static void main(String[] args) {
        Picarol picarol = new Picarol();
        picarol.sona();   // el picarol funciona fins i tot sense gat!
        GatRenat renat = new GatRenat();
        renat.aixecat();
        renat.posaPicarol(picarol);
        renat.seu();      // ha de sonar el picarol
        renat.seu();      // no sona el picarol doncs no es mou!
        renat.treuPicarol();
        renat.estirat();  // no sona el picarol doncs ja no el té
        System.out.println("Nombre de cops que sona el picarol: " + picarol.quantsCops());
    }

    // Constructor GatRenat
    public GatRenat() {
        if (this.picarol == null) {
            this.tePicarol = false;
        } else {
            this.tePicarol = true;
        }
    }
    public GatRenat(String posicio) {
        this.posicio = posicio;
        if (this.picarol == null) {
            this.tePicarol = false;
        } else {
            this.tePicarol = true;
        }
    }
    // mètodes agregació picarol
    public boolean tePicarol() { 
        if (tePicarol) {
            return true;
        }
        return false;
    }
    public Picarol posaPicarol(Picarol picarol) {
        if (tePicarol) {
            this.picarol = picarol;
            this.tePicarol = true;
            return picarol;
        }
        this.picarol = picarol;
        this.tePicarol = true;
        return null;
    }
    public Picarol treuPicarol() {
        if (tePicarol) {
            tePicarol = false;
            return picarol;
        }
        return null;
    }
    // Mètodes Gat Renat
    public void seu() {
        if (tePicarol && !getPosicio().equals("assegut")) {
            picarol.sona();
        }
        setPosicio("assegut");
    }
    public void aixecat() {
        if (tePicarol && !getPosicio().equals("dret")) {
            picarol.sona();
        }
        setPosicio("dret");
    }
    public void estirat() {
        if (tePicarol && !getPosicio().equals("estirat")) {
            picarol.sona();
        }
        setPosicio("estirat");
    }
    // setter
    public void setPosicio(String novaPosicio) {
        switch (novaPosicio) {
            case "estirat": this.posicio = "estirat"; break;
            case "assegut": this.posicio = "assegut"; break;
            case "dret": this.posicio = "dret"; break;
            default: this.posicio = this.posicio; break;
        }
    }
    // getter
    public String getPosicio() {
        return this.posicio;
    }
}
