/* Fitxer que conté la classe Botiga y totes les seves propietats, accessors i mètodes per fer-la funcionar.
 * Afegirem els vins de la classe vi a la classe Botiga, per tant serà una relació d'agregació.
 * Inclourem la classe Vi dins de la classe Botiga per tal de poder fer-les interactuar
 * La funcionalitat més important de la botiga és poder cercar un vi pel seu nom.
 */

class Botiga {
    public int posicionRecorrido;
    private int DEFAULT_MAX_VINS = 10;                // Nombre màxim de vins que hi caben a la botiga
    private Vi[] vins;

    // Constructors
    public Botiga() {
        this.vins = new Vi[DEFAULT_MAX_VINS];
    }
       // específic
    public Botiga(int maxVins) {
        if (maxVins <= 0) {
            this.vins = new Vi[DEFAULT_MAX_VINS];
        } else {
            this.vins = new Vi[maxVins];
        }
    }

    // MÈTODES
    public Vi afegeix(Vi vi) {
        // recibo instancia de vino
        // compruebo si la instància es válida
        if (!vi.esValid()) { return null; }
        // Para comprobar que no està repetido el nombre en la tienda
        // recorro el array de vinos
        for (int i=0; i<vins.length; i++) {
            // Si no encuentra ninguna instancia con el mismo nombre la añado
            if (vins[i] == null) {
                vins[i] = vi;
                return vins[i];
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
    
    // MODIFICAR METODO ####################################################################################################
    // public Vi cerca(String ref) {}
    public Vi cerca(String nom) {
        // recibo el nombre de un vino
        // normalizamos el nombre para poder buscarlo en la tienda
        nom = Vi.normalitzaNom(nom);
        // buscamos el mismo nombre en la tienda
        for (int i=0; i<vins.length; i++) {
            // Si la posicion encontrada es null, continua
            if (vins[i] == null) {
                continue;
            }
            // Si lo encuentra
            if (vins[i].getNom().toLowerCase().equals(nom.toLowerCase())) {
               return vins[i];
            }
       }
        // Si acaba el recorrido de la tienda y no ha coincidido el nombre
        return null;
    }

    // MODIFICAR METODO ####################################################################################################
    // public Vi elimina(String ref) {}
    public Vi elimina(String nom) {
        nom = Vi.normalitzaNom(nom);
        for (int i=0; i<vins.length; i++) {
            // Si la posicion que encuentra es null
            if (vins[i] == null) continue;
            // Si encuentra el vino en la tienda
            if (vins[i].getNom().equalsIgnoreCase(nom)) {
                // comprueba stock
                if (vins[i].getEstoc() > 0) {
                    // si aun queda
                    return null;
                } else {
                    // si no queda
                    Vi copia = vins[i];
                    vins[i] = null;
                    return copia; 
                }
            }
        }
        // Si no encuentra el vino
        return null;
    }

    // ################################ NOUS METODES ##############################
    public void iniciaRecorregut() {
        posicionRecorrido = 0;        
    }
    public Vi getSeguent() {
        if (posicionRecorrido == vins.length) return null;
        while (vins[posicionRecorrido] == null) {
            posicionRecorrido += 1;
            if (posicionRecorrido == vins.length) return null;
        }
        posicionRecorrido += 1;
        return(vins[posicionRecorrido - 1]);
    }

    // NUEVO METODO A AÑADIR #############################################################################################
    // public Vi cerca(Vi plantilla) {
    //  for (int i=0; i<vins.length; i++) {
    //         if (vins[i] != null) {
    //                  if (plantilla.getNom() != null) {
    //          /* ... */
}

