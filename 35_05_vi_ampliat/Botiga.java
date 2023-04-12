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

    public Vi cerca(String ref) {
        // recibo la referncia de un vino
        // normalizamos la referencia para poder buscarlo en la tienda
        ref = Vi.normalitzaString(ref);
        // buscamos la misma referencia en la tienda
        for (int i=0; i<vins.length; i++) {
            // Si la posicion encontrada es null, continua
            if (vins[i] == null) {
                continue;
            }
            // Si lo encuentra
            if (vins[i].getRef().equalsIgnoreCase(ref)) {
               return vins[i];
            }
       }
        // Si acaba el recorrido de la tienda y no ha coincidido el nombre
        return null;
    }

    public Vi elimina(String ref) {
        ref = Vi.normalitzaString(ref);
        for (int i=0; i<vins.length; i++) {
            // Si la posicion que encuentra es null
            if (vins[i] == null) continue;
            // Si encuentra el vino en la tienda
            if (vins[i].getRef().equalsIgnoreCase(ref)) {
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
    // ############ NOU METODE ###############
    public Vi cerca(Vi plantilla) {
        // especifiquem els valors que ens interesen
        = Vi.normalitzaString(Entrada.readLine());
        plantilla.ref = Vi.normalitzaString(Entrada.readLine());
        plantilla.preu = Integer.parseInt(Entrada.readLine());
        plantilla.estoc = Integer.parseInt(Entrada.readLine());
        plantilla.lloc = Vi.normalitzaString(Entrada.readLine());
        plantilla.origen = Vi.normalitzaString(Entrada.readLine());
        plantilla.tipus = Vi.normalitzaString(Entrada.readLine());
        plantilla.collita = Vi.normalitzaString(Entrada.readLine());
        // recorrem la bodega
        for (int i=0; i<vins.length; i++) {
            if (vins[i] == plantilla) {
                return vins[i];
            }
        }
        return null;
    }

    // ################################ METODES PER GESTIO DE FITXERS ##############################
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
}

