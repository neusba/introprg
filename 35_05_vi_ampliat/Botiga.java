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
   
    // Busca vino por referencia 
    public Vi cerca(String ref) {
        // recibo referencia de un vino
        // normalizamos referencia  para poder buscarlo en la tienda
        ref = Vi.normalitzaString(ref);
        // buscamos el mismo nombre en la tienda
        for (int i=0; i<vins.length; i++) {
            // Si la posicion encontrada es null, continua
            if (vins[i] == null) {
                continue;
            }
            // Si lo encuentra
            if (vins[i].getRef().toLowerCase().equals(ref.toLowerCase())) {
               return vins[i];
            }
       }
        // Si acaba el recorrido de la tienda y no ha coincidido el nombre
        return null;
    }
    
    // Elimina vino por referencia
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
    public Vi cerca(Vi plantilla) {
        for (Vi vi: vins) {
        if (vi == null) continue;
        if (plantilla.getRef() != null) {
            if (plantilla.getRef().equalsIgnoreCase(vi.getRef())) { return vi; }else{ continue; }}
        if (plantilla.getNom() != null) {
            if (plantilla.getNom().equalsIgnoreCase(vi.getNom())) { return vi; }else{ continue; }}
        if (plantilla.getPreu() != -1) {
            if (plantilla.getPreu() >= vi.getPreu()) { return vi; }else{ continue; }}
        if (plantilla.getEstoc() != -1) {
            if (plantilla.getEstoc() >= vi.getEstoc()) { return vi; }else{ continue; }}
        if (plantilla.getLloc() != null) {
            if (plantilla.getLloc().equalsIgnoreCase(vi.getLloc())) { return vi; }else{ continue; }}
        if (plantilla.getOrigen() != null) {
            if (plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen())) { return vi; }else{ continue; }}
        if (plantilla.getTipus() != null) {
            if (plantilla.getTipus().equalsIgnoreCase(vi.getTipus())) { return vi; }else{ continue; }}
        if (plantilla.getCollita() != null) {
            if (plantilla.getCollita().equalsIgnoreCase(vi.getCollita())) { return vi; }else{ continue; }}
        return vi;
        }
        return null;
    }
}

