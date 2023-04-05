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
        Vi[] vins = new Vi[DEFAULT_MAX_VINS];
    }
       // específic
    public Botiga(int maxVins) {
        if (maxVins <= 0) {
            Vi[] vins = new Vi[DEFAULT_MAX_VINS];
        } else {
            Vi[] vins = new Vi[maxVins];
        }
    }

    // MÈTODES
    public Vi afegeix(Vi vi) {
        // recibo instancia de vino
        // compruebo si la instància es válida
        if (!vi.esValid()) { return null; }
        if (this.vins[0] == null) {
            this.vins[0] = vi;
            return vi;
        }
        // Para comprobar que no està repetido el nombre en la tienda
        // recorro el array de vinos
        for (int i=0; i<vins.length; i++) {
            // Si no encuentra ninguna instancia con el mismo nombre la añado
            if (vins[i] == null) {
                vins[i] = vi;
                return vi;
            }
            // Si encuentra una instància con el mismo nombre
            if (vins[i].getNom().equals(vi.getNom())) {
               // no puede añadirla a la tienda, la devuelve
                return null;
            }
        }
        // Si no encuentra el mismo nombre y la tienda esta llena, devuelve
            return null;
    }

    public Vi cerca(String nom) {
        // recibo el nombre de un vino
        // normalizamos el nombre para poder buscarlo en la tienda
        nom = Vi.normalitzaNom(nom);
        // buscamos el mismo nombre en la tienda
        for (int i=0; i<vins.length; i++) {
            // Si lo encuentra
            if (vins[i].getNom().equals(nom)) {
               return vins[i];
            }
       }
        // Si acaba el recorrido de la tienda y no ha coincidido el nombre
        return null;
    }

    public Vi elimina(String nom) {
        nom = Vi.normalitzaNom(nom);
        for (int i=0; i<vins.length; i++) {
            // Si encuentra el vino en la tienda
            if (vins[i].getNom().equals(nom)) {
                // comprueba stock
                if (vins[i].getEstoc() > 0) {
                    // si aun queda
                    return null;
                }
                // si no queda
                vins[i] = null;
                return null;
           }
        }
        // Si no encuentra el vino
        return null;
    }
}

