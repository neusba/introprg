/* Fitxer que conté la classe Hora amb totes les seves propietats i mètodes necessaris
 * Aquesta vegada programarem els Setters de manera que capturin les exceptions i responguin
 * de manera que sabem que és el que esta ocurrent
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
    public Hora(int hores, int minuts, int segons) throws Exception {
        // tractem d'assignar les hores
        try {
            setHores(hores);
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
        // tractem d'assignar els minuts
        try {
            setMinuts(minuts);
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
        // tractem d'assignar els segons
        try {
            setSegons(segons);
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }

    // ########################### ACCESSORS #############################
    // Setters amb CONTROL DE EXCEPTIONS
    public void setHores(int hores) throws Exception {
        if (hores>=0 && hores<24) {
            this.hores = hores;
        } else {
            throw new Exception("hores fora de rang: "+hores+"");
        }
    }
    public void setMinuts(int minuts) throws Exception {
        if (minuts>=0 && minuts<60) {
            this.minuts = minuts;
        } else {
            throw new Exception("minuts fora de rang: "+minuts+"");
        }
    }
    public void setSegons(int segons) throws Exception {
        if (segons>=0 && segons<60) {
            this.segons = segons;
        } else {
            throw new Exception("segons fora de rang: "+segons+"");
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
