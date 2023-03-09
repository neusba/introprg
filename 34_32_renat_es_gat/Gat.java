/* Fitxer que conté la classe Gat la qual és superclasse de Gat Renat i en la que definim les propietats dels
 * que seràn instàncies de Gat Renat per conseqüent
 */
class Gat {
    private int vides = 7;
    private String posicio = "estirat";
    // getters
    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }
    // setters
    public void setPosicio(String posicio) {
        switch (posicio) {
            case "estirat": this.posicio = "estirat"; break;
            case "dret": this.posicio = "dret"; break;
            case "assegut": this.posicio = "assegut"; break;
        }
    }
    public void setVides(int vides) {
        if (vides < 0) return;
        this.vides = vides;
    }
}
