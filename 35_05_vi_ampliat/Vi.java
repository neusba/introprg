/* Fitxer que conté la classe vi amb totes les propietats, accessor i metodes necessaris per fer
 * funcionar l'aplicació de la germana de la Gualda
 */

class Vi {
    // Propiedades de la classe
    private final String nom;
    private int preu;
    private int estoc = 0;
    private String ref;
    private String lloc;
    private String origen;
    private String tipus;
    private String collita;

    // CONSTRUCTOR UNICO 
    public Vi(String ref, String nom, int preu, int estoc, String lloc, String origen, String tipus, String collita) {
        this.ref = normalitzaString(ref);
        this.nom = normalitzaString(nom);
        setPreu(preu);
        setEstoc(estoc);
        setLloc(normalitzaString(lloc));
        this.origen = normalitzaString(origen);
        this.tipus = normalitzaString(tipus);
        this.collita = normalitzaString(collita);
    }

    // Accessors
    // getters
    public String getNom() {
        return this.nom;
    }
    public int getPreu() {
        return this.preu;
    }
    public int getEstoc() {
        return this.estoc;
    }
    public String getRef() {
        return this.ref;
    }
    public String getLloc() {
        return this.lloc;
    }
    public String getOrigen() {
        return this.origen;
    }
    public String getTipus() {
        return this.tipus;
    }
    public String getCollita() {
        return this.collita;
    }
    // setters
    public void setPreu(int preu) {
        // El precio ya se recibe en céntimos, no hace falta conversión
        if (preu < 0) {
            this.preu = -1;
        } else {
            this.preu = preu;
        }
    }
    public void setEstoc(int estoc) {
        if (estoc < 0 ) {
            this.estoc = -1;
        } else {
            this.estoc = estoc;
        }
    }
    public void setLloc(String lloc) {
        this.lloc = lloc;
    }
    

    // EDITAR ESTE METODO
    public boolean esValid() {
        if (getNom().isEmpty() || getNom().isBlank() || (getNom() == null)) return true;
        if (this.preu == -1 || this.estoc == -1) return false;
        return true;
    }
    
    // Editar este metodo
    public static String normalitzaString(String propietat) {
        if (propietat.isEmpty() || propietat.isBlank() || propietat == null) return null;
        propietat = propietat.strip();
        propietat = propietat.replaceAll("\\s+", " ");
        return propietat;
    }

    // @toString
    @Override public String toString() {
        return(String.format("%n    Ref: %s%n    Nom: %s%n    Preu: %d%n    Estoc: %d%n    Lloc: %s%n    D.O.: %s%n    Tipus: %s%n    Collita: %s%n", this.ref, this.nom, this.preu, this.estoc, this.lloc, this.origen, this.tipus, this.collita));
    }

    // ################ NUEVOS METODOS ########################
    // devuelve un array con los valores de la instància de vino actual
    public String[] aArrayString() {
        String preuArray = Integer.toString(this.preu);
        String estocArray = Integer.toString(this.estoc);
        String[] valors = { this.ref, this.nom, preuArray, estocArray, this.lloc, this.origen, this.tipus, this.collita };
        return valors;
    }


    // MODIFICAR METODO ########################################################################################################
    public static Vi deArrayString(String[] valorsVi) {
        if (valorsVi.length != 8) return null;
        // comprova preu
        if (Character.isLetter(valorsVi[2].charAt(0))) return null;
        // comprovar estoc
        if (Character.isLetter(valorsVi[3].charAt(0))) return null;     // PETA ESTOC
        // comprovar nom/ref/lloc/origen/tipus/collita
        String nom = valorsVi[1];
        String ref = valorsVi[0];
        String lloc = valorsVi[4];
        String origen = valorsVi[5];
        String tipus = valorsVi[6];
        String collita = valorsVi[7];
        int preu = Integer.parseInt(valorsVi[2]);
        if (preu < 0) return null;
        int estoc = Integer.parseInt(valorsVi[3]);
        if (estoc < 0) return null;
        // inicialitzem
        return(new Vi(ref, nom, preu, estoc, lloc, origen, tipus, collita));
    }
}

