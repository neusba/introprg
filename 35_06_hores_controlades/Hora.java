/* Fitxer que conté la classe Hora però aquesta vegada amb control d'exceptions
 * No inclourem tots els mètodes de la versió ampliada i farem enfàsis
 * només als setters per veure com treballen les exceptions de manera manual
 * és a dir, sense TRY CATCH
 */

class Hora {
    // propietats privades
    private int hores;
    private int minuts;
    private int segons;

    // ########################### CONSTRUCTOR ###########################
    // inicialitzarà la Hora en 0:00:0
    public Hora() {
        hores = 0;
        minuts = 0;
        segons = 0;
    }

    // ########################### ACCESSORS #############################
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
    // Setters
    // Passaran a retornar boolean
    public boolean setHores(int hores) {
        boolean correcte = (hores>0 && hores<24);
        if (correcte) this.hores = hores;
        return correcte;
    }
    public boolean setMinuts(int minuts) {
        boolean correcte = (minuts>0 && minuts<60);
        if (correcte) this.minuts = minuts;
        return correcte;
    }
    public boolean setSegons(int segons) {
        boolean correcte = (segons>0 && segons<60);
        if (correcte) this.segons = segons;
        return correcte;
    }
    // ###########################  METODES ###################################
    // converteix instància a string
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", this.hores, this.minuts, this.segons);
    }
}
