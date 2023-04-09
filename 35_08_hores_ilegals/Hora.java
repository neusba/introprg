/* Fitxer que conté la classe Hora amb totes les seves propietats i mètodes necessaris
 * Aquesta vegada programarem el try catch de manera que capturem una excepció més concreta
 * IllegalArgumentException
 */

class Hora {
    // propietats privades
    private int hores;
    private int minuts;
    private int segons;

    // ########################### CONSTRUCTORS ###########################
    // Per defecte
    public Hora() {
        hores = 0;
        minuts = 0;
        segons = 0;
    }
    // Específic
    public Hora(int hores, int minuts, int segons) {
        setHores(hores);
        setMinuts(minuts);
        setSegons(segons);
    }

    // ########################### ACCESSORS #############################
    // Setters amb CONTROL DE EXCEPTIONS
    public void setHores(int hores) {
        if (hores>=0 && hores<24) {
            this.hores = hores;
        } else {
            throw new IllegalArgumentException("hores fora de rang: "+hores+"");
        }
    }
    public void setMinuts(int minuts) {
        if (minuts>=0 && minuts<60) {
            this.minuts = minuts;
        } else {
            throw new IllegalArgumentException("minuts fora de rang: "+minuts+"");
        }
    }
    public void setSegons(int segons) {
        if (segons>=0 && segons<60) {
            this.segons = segons;
        } else {
            throw new IllegalArgumentException("segons fora de rang: "+segons+"");
        }
    }
    // Getters
    public int getHores() {
        return this.hores;
    }
    public int getMinuts() {
        return this.minuts;
    }
    public int getSegons() {
        return this.segons;
    }

    // converteix instància a string
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", this.hores, this. minuts, this.segons);
    }
}
