/* Fitxer que conté la classe Botiga y totes les seves propietats, accessors i mètodes per fer-la funcionar.
 * Afegirem els vins de la classe vi a la classe Botiga, per tant serà una relació d'agregació.
 * Inclourem la classe Vi dins de la classe Botiga per tal de poder fer-les interactuar
 * La funcionalitat més important de la botiga és poder cercar un vi pel seu nom.
 */

class Botiga {
    private int DEFAULT_MAX_VINS = 10;                // Nombre màxim de vins que hi caben a la botiga
    private Vi[] vins;

    // Constructors
    public Botiga() {
        Vi[] vins = new Vi[this.DEFAULT_MAX_VINS];
    }
    public Botiga(int maxVins) {
        if (maxVins < 1) {
            this.DEFAULT_MAX_VINS = this.DEFAULT_MAX_VINS;
            Vi[] vins = new Vi[this.DEFAULT_MAX_VINS];
        } else {
            this.DEFAULT_MAX_VINS = maxVins;
            Vi[] vins = new Vi[this.DEFAULT_MAX_VINS];
        }
    }

    // Mètodes
    // afegeix un vi a la botiga
    public Vi afegeix(Vi vi) {
        String nomVi = vi.getNom();
        if (!vi.esValid()) { return null; }             
        // si hi ha un altre vi amb el MATEIX NOM RETURNS NULL
        if (vins.length == 0) {
          vins[0] = vi;
          return vins[0];
        } 
        if (estaABotiga(nomVi)) { return null; }       
        // AFEGIRÀ el vi a una POSICIO NULL de l'array i INDICARA que s'ha AFEGIT
        for (int i=0; i<vins.length; i++) {
            if (vins[i] == null) {
                vins[i] = vi;
                return vins[i];
            }
        }       
        return null;    // en cas que la botiga estigui plena
    }
    // elimina un vi de la botiga
    public Vi elimina(String vi) {
        for (int i=0; i<vins.length; i++) {
            if (vins[i].getNom().equals(vi)) {
                // comprova stock
                if (vins[i].getEstoc() > 0) {
                    return null;
                }
                vins[i] = null;
                return vins[i];
            }
        }
        return null;

    }
    // cerca un vi en concret a la botiga
    public Vi cerca(String nom) {
        for (int i=0; i<vins.length; i++) {
            if (vins[i].getNom().equals(nom)) {
                return vins[i];
            }
        }
        return null;
    }

    // Mètodes extres
    // comprova si el vi ja ha sigut afeigit a la botiga
    public boolean estaABotiga(String nomVi) {
        // recorre array de vinos disponibles
        // compara el nombre del vino [i] con el del parametro
        // Si alguno coincide RETURNS TRUE
            // Si nunca devuelve true, al acabar el bucle RETURNS FALSE;
        for (int i=0; i<vins.length; i++) {
            if (vins[i].getNom().equals(nomVi)) {
                return true;
            }
        }
        return false;
    }
}
    

