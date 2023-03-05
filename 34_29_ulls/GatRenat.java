/* Programa que introdueix la composició a la Programació Orientada a Objectes.
 * En aquesta primera prova implementarem la classe UllDeGat amb la classe GatRenat
 * els mètodes de la classe Ull variaran segons la posició de la classe GatRenat
 */

public class GatRenat {
    private UllDeGat ullDret;
    private UllDeGat ullEsquerre;
    private String posicio = "estirat";

    // Constructores
    public GatRenat() {
        ullDret = new UllDeGat();
        ullEsquerre = new UllDeGat();
        switch (this.posicio) {
            case "estirat": ullDret.tancat(); ullEsquerre.tancat(); break;
            case "assegut": ullDret.obret(); ullEsquerre.tancat(); break;
            case "dret": ullDret.obret(); ullEsquerre.obret(); break;
        }
    }
    public GatRenat(String posicio) {
        this.posicio = posicio;
        ullDret = new UllDeGat();
        ullEsquerre = new UllDeGat();
        switch (this.posicio) {
            case "estirat": ullDret.tancat(); ullEsquerre.tancat(); break;
            case "assegut": ullDret.obret(); ullEsquerre.tancat(); break;
            case "dret": ullDret.obret(); ullEsquerre.obret(); break;
        }
    }
    // getters
    public UllDeGat getUllDret() {
        UllDeGat copiaDret = new UllDeGat();
        copiaDret = ullDret;
        return copiaDret;
    }
    public UllDeGat getUllEsquerre() {
        UllDeGat copiaEsquerre = new UllDeGat();
        copiaEsquerre = ullEsquerre;
        return copiaEsquerre;
    }
    public String getPosicio() {
        return posicio;
    }
    // Mètodes de posicio de Gat Renat
    public String aixecat() {
        ullDret.obret();
        ullEsquerre.obret();
        this.posicio = "dret";
        return("m'aixeco");
    }
    public String seu() {
        ullDret.obret();
        ullEsquerre.tancat();
        this.posicio = "assegut";
        return("m'assec");
    }
    public String estirat() {
        ullDret.tancat();
        ullEsquerre.tancat();
        this.posicio = "estirat";
        return("m'estiro");
    }
    // MAIN
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
        renat.getUllDret().estaObert(),
        renat.getUllEsquerre().estaObert());
    }
}
